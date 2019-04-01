<%@include file="header.jsp" %>

 

 

<body id="LoginForm">

 

       <div class="container">

              <div align="center">

                     <img src="resources/img/wander_today.png" height=60pxwidth=200px; style="padding: 0px;margin: 0px">

              </div>

             

              <div class="login-form">

                     <div class="main-div">

                     <h1 class="form-heading" align="center"

                     style="font-size: 40px; color:#dc3545">Wander Tool</h1>

                           <div class="panel">

                                  <h2>Login Page</h2>

                                  <p>Please enter your username and password</p>

                                  <h3 align="center">

                                  <font color="black"size="4px">${error}</font>

                           </h3>

                           </div>

                           <form id="Login" action="login" method="post">

 

                                  <div class="form-group">

 

 

                                         <input type="text" class="form-control" id="inputUsername"

                                                name="inputUsername" placeholder="Username" required=required>

 

                                  </div>

 

                                  <div class="form-group">

 

                                         <input type="password" class="form-control" id="inputPassword"

                                                name="inputPassword" placeholder="Password" required=required>

 

                                  </div>

                                  <button type="submit" class="btn btn-primary" name="login">Login</button>

                                  <p>or</p>

                                 

                           </form>

                           <a href="signup.jsp"><button class="btn btn-primary">Sign Up</button></a>

                           <br>

                          

                     </div>

              </div>

       </div>

      

 

 

</body>

</html>

 