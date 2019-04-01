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

                                  <h2>Sign Up Page</h2>

                                  <p>Please enter the details</p>

                                  <h2 align="center">

                                  <font color="black"size="4px">${error}</font>

                           </h2>

                           </div>

                          

                           <form id="Signup" action="signup"method="post">

 

                                  <div class="form-group">

 

 

                                         <input type="text"class="form-control" id="inputName"

                                                name="inputName"placeholder="Enter Your Name" required=required>

 

                                  </div>

                                 

                                  <div class="form-group">

 

 

                                         <input type="text"class="form-control" id="inputUsername"

                                                name="inputUsername"placeholder="Enter Your Username"required=required>

 

                                  </div>

                                 

                                  <div class="form-group">

 

                                         <input type="password"class="form-control" id="inputPassword"

                                                name="inputPassword"placeholder="Enter Your Password"required=required>

 

                                  </div>

                                  <button type="submit" class="btn btn-primary" name="login">Sign Up</button>

                                  <p>or</p>

                                 

                           </form>

                           <a href="index.jsp"><button class="btn btn-primary">Login</button></a>

                          

                          

                     </div>

              </div>

       </div>

      

 

 

</body>

</html>