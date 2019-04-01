<%@include file="header.jsp" %>

 

 

<body id="LoginForm">

 

<%

response.setHeader("Cache-Control","no-cache");

response.setHeader("Cache-Control","no-store");

response.setHeader("Pragma","no-cache");

response.setDateHeader ("Expires", 0);

 

if(session.getAttribute("user")==null){

    response.sendRedirect("login");

}else{

     System.out.print(session.getAttribute("user")+":::::::::::::::::::::::::");

}

 

%>

 

       <div class="container">

              <div align="center">

                     <img src="resources/img/wander_today.png" height=60pxwidth=200px; style="padding: 0px;margin: 0px">

              </div>

             

              <div class="login-form">

                     <div class="main-div"style="width:1200px">

                     <h1 class="form-heading" align="center"

                     style="font-size: 40px; color:#dc3545">List of Notes</h1>

                    

                     <div><form action="login"method="post">

                     <input type="hidden"name="inputUsername" value="<%=session.getAttribute("username")%>">

                     <input type="hidden"name="inputPassword" value="<%=session.getAttribute("password")%>">

                     <button class="btn btn-primary"type="submit"style="width:100px;float:left">Home</button></form>

                     </div>


                           <c:if test="${!empty list}">

              <table class="table">

              <thead>

                     <br><br>

                     <tr>

                     <th nowrap="nowrap">Sr No.</th>

                     <th nowrap="nowrap">Title</th>

                     <th nowrap="nowrap">Created Time</th>

                    

                     <th nowrap="nowrap">Last Updated Time</th>

                     <th nowrap="nowrap">Update</th>
                     <th nowrap="nowrap">Delete</th>

                     </tr>

                     </thead>

              <tbody>

             

                     <c:forEach items="${list}" var="w_r" varStatus="counter">

                     <tr>

                     <td align="left"><b><c:out value="${counter.count}"></c:out></b></td>

                     <td align="left"><c:out value="${w_r.title}"></c:out></td>

                     <td align="left"><c:out value="${w_r.created_time}"></c:out></td>

                     <td align="left"><c:out value="${w_r.updated_time}"></c:out></td>

                    

                     <td align="left">

                           <font size="3"><a href="updatenotes?title=${w_r.title}&description=${w_r.description}&created_time=${w_r.created_time}

                           &updated_time=${w_r.updated_time}"><button class="btn btn-primary" style="width:100px">Update Note</button></a></font></td>

 					<td align="left">

                           <font size="3"><a href="deletenotes?title=${w_r.title}"><button class="btn btn-primary" style="width:100px">Delete Note</button></a></font></td>

 					
						
                     </tr>

                     </c:forEach>

             

              </tbody>

             

              </table>

       </c:if>

                          

                          

                     </div>

              </div>

       </div>

      

 

 

</body>

</html>
