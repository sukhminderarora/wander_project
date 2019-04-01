<%@include file="header.jsp" %>

 

 

<body id="LoginForm">

 

<%-- <%

response.setHeader("Cache-Control","no-cache");

response.setHeader("Cache-Control","no-store");

response.setHeader("Pragma","no-cache");

response.setDateHeader ("Expires", 0);

 

if(session.getAttribute("user")==null){

    response.sendRedirect("login");

}else{

     System.out.print(session.getAttribute("user")+":::::::::::::::::::::::::");

}

 

%> --%>

 

       <div class="container">

              <div align="center">

                     <img src="resources/img/wander_today.png" height=60pxwidth=200px; style="padding: 0px;margin: 0px">

              </div>

             

              <div class="login-form">

                     <div class="main-div" style="width:1200px">

                     <h1 class="form-heading" align="center"

                     style="font-size: 40px; color:#dc3545">Update a Note</h1>

                    

                     <div><form action="login" method="post">

                     <input type="hidden"name="inputUsername" value="<%=session.getAttribute("username")%>">

                     <input type="hidden"name="inputPassword" value="<%=session.getAttribute("password")%>">

                     <button class="btn btn-primary" type="submit" style="width:100px;float:left">Home</button></form>

                     </div>

                    

                           <div class="panel">

                                 

                                  <h3 align="center">

                                  <font color="black"size="4px">${error}</font>

                           </h3>

                           </div>

                          

                           <form id="updatenotesubmit"action="updatenotesubmit" method="post">

                          

                           <table class="table">

                           <tr>

                           <td class="form-heading"

                     style="font-size: 20px; color:#dc3545">Title :- </td><td><input type="text"size="35" name="title" required="required"value="${title}"><br></td></tr>

                           <tr><td class="form-heading"

                     style="font-size: 20px; color:#dc3545">Description :-</td><td style="size:1000px"> <input size="35" width="60"type="text" name="description"value="${description}" required="required"></td></tr>

                          

                           <tr>

                           <td class="form-heading" style="font-size: 20px; color: #dc3545">Created Time :- </td><td>${created_time}</td></tr>

                           <tr>

                           <td class="form-heading" style="font-size: 20px; color: #dc3545">Last Updated Time :-</td><td>${updated_time}</td></tr>

                          

                           </table>

                           <button class="btn btn-primary"style="width:300px" type="submit"name="created_time"value="${created_time},,,${title}">Update</button><br><br>

                           </form>

                          

                          

                     </div>

              </div>

       </div>

      

 

 

</body>

</html>

 