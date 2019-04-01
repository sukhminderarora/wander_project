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

                     <div class="main-div">

                     <h1 class="form-heading" align="center"

                     style="font-size: 40px; color:#dc3545">Welcome ${name}</h1>

                           <div class="panel">

                                 

                                  <p>Make your choice</p>

                           </div>
                          

                           <form action="createnote"method="post">

                           <button class="btn btn-primary">Create a Note</button></a><br><br></form>

                           <form action="viewnote"method="get">

                           <button class="btn btn-primary">View/Update Notes</button></a><br><br></form>

                           <p>or</p><br><br>

                           <a href="logout"><button class="btn btn-primary">Logout</button>

                          

                     </div>

              </div>

       </div>

      

 

 

</body>

</html>