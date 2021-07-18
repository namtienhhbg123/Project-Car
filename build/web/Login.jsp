<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>NTAuto</title>
<!--
DREAM PULSE
https://templatemo.com/tm-536-dream-pulse
-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,600" />
    <link rel="stylesheet" href="css/all.min.css" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="slick/slick.css"/>    
    <link rel="stylesheet" href="slick/slick-theme.css"/>    
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/templatemo-dream-pulse.css" />
    <style>
        .ball{
            border-radius: 10%;
        }
        .click{
            color: #FFF;

        }
        .click:hover{
            text-decoration: none;
            color: #000;
        }
        .product{
            width: 800px;
            height: 400px;
        }
        body{
            background-image: url('https://i.pinimg.com/originals/d7/61/61/d7616107df70a7702c3e8a1d073d5e09.jpg');
            background-size: cover;
            background-repeat: none;
        }
        .loginform{
            background-color: rgba(255,255,255,0.7);
            border-radius: 20%;
            
        }
        .form-group{
            margin-top: 15%;
        }
        .button-login{
            background-color: rgb(224 238 238);
            width: 50%;
        }
    </style>
  </head>
  <body>
      <div class="row"> 
                <nav id="tmSidebar" class="tm-bg-black-transparent tm-sidebar">
            <button class="navbar-toggler" type="button" aria-label="Toggle navigation">
              <i class="fas fa-bars"></i>
            </button>
            <div class="tm-sidebar-sticky">
              <div class="tm-brand-box">
                <div class="tm-double-border-1 ball">
                  <div class="tm-double-border-2 ball">
                      <h1 class="tm-brand text-uppercase">
<!--                          logo c?a trang web-->
                    <a class="click" href="Test">
                        <img src="https://image.freepik.com/free-vector/automotive_25327-95.jpg" alt="" style="width: 140px; height: 120px;border-radius: 100%">
                        NTAUTO
                        </a>                         
                        
                      </h1>
                  </div>
                </div>
              </div>

              <ul id="tmMainNav" class="nav flex-column text-uppercase text-right tm-main-nav">
                <li class="nav-item">
                  <a href="#" class="nav-link active">
                    <span class="d-inline-block mr-3" onclick="login()">Login</span>
                    <span class="d-inline-block tm-white-rect"></span>
                  </a>
                </li>

                
                <li class="nav-item">
                  <a href="#" class="nav-link">
                      <span class="d-inline-block mr-3" onclick="signIn()">Sign In</span>
                       <span class="d-inline-block tm-white-rect"></span>
                  </a>
                </li>
              </ul>
            </div>
          </nav>
          
        <div class="tm-section-wrap">
            <section id="talk" class="row tm-section">
                <div class="col-xl-6 mb-5">
                  <div class="tm-double-border-1 tm-border-gray">
                    <div class="tm-double-border-2 tm-border-gray tm-box-pad">
                        <h2 class="tm-color-primary tm-section-title mb-4" style="text-align: center">Login</h2>
                        <p class="mb-4">
                            Welcome members of NTAuto
                        </p>
                        <p class="mb-3">
                            <img src="https://image.freepik.com/free-vector/automotive_25327-95.jpg" alt="" style="width: 100%; height: 100%;border-radius: 20px">
                        </p>
                    </div>                    
                  </div>                  
                </div>
                <div class="col-xl-6 mb-5">
                  <div class="tm-contact-form-wrap loginform">
                      <!--                      dang ky-->
                      <form action="SigninControl" method="POST" class="tm-contact-form" id="formSign">
                          <!--                            email-->
                          <div class="form-group">
                              <input type="email" id="email" name="emailSign" class="form-control rounded-0 border-top-0 border-right-0 border-left-0" placeholder="Your Email" required="""/>
                              <b style="color: red;display: none">Please enter the email account</b>
                          </div>
                          <!--                        phone-->
                          <div class="form-group">
                              <input type="text" id="phone" name="phoneSign" class="form-control rounded-0 border-top-0 border-right-0 border-left-0" placeholder="Your Phone" required=""
                                     />
                              <b style="color: red;display: none">Please enter the phone account</b>
                          </div>
                          <!--                        tk-->
                          <div class="form-group">
                              <input type="text" id="contact_name" name="userSign" class="form-control rounded-0 border-top-0 border-right-0 border-left-0" placeholder="Your Name" required="" />
                              <b style="color: red;display: none">Please enter the name account</b>
                          </div>
                          <!--                        mk-->
                          <div class="form-group">
                              <input type="password" id="pass" name="passwordSign" class="form-control rounded-0 border-top-0 border-right-0 border-left-0" placeholder="Your Password" required="" />
                          </div>
                          <div class="form-group">
                              <input type="password" id="repass" name="repassword" class="form-control rounded-0 border-top-0 border-right-0 border-left-0" placeholder="RePassword" required="" 
                                     />
                          </div>

                          <div class="form-group mb-0">
                              <button  type="submit"  class="btn rounded-0 d-block ml-auto tm-btn-primary button-login">
                                  <b id="Butsignin">Sign in</b>
                              </button>
                          </div>
                      </form>
                      <!--                      dang nhap -->
                      <form action="LoginControl" method="POST" class="tm-contact-form" id="formLogin">
                          <!--                        tk-->
                          <div class="form-group">
                              <input type="text" id="userName" name="userName" class="form-control rounded-0 border-top-0 border-right-0 border-left-0" placeholder="Your Name" required="" />
                          </div>
                          <!--                        mk-->
                          <div class="form-group">
                              <input type="password" id="pass" name="pass" class="form-control rounded-0 border-top-0 border-right-0 border-left-0" placeholder="Your Password" required="" />
                          </div>

                          <div class="form-group mb-0">
                              <button  type="submit"  class="btn rounded-0 d-block ml-auto tm-btn-primary button-login">
                                  <b id="Butlogin">Login</b>     
                              </button>
                          </div>
                      </form>

                  </div>                    
                </div>
              </section>
          </div>
        </div>  
      <script>
//          hi?n th? khi ??ng nh?p
document.getElementById('formSign').style.display = 'none';
          function login(){
              document.getElementById('formSign').style.display = 'none';
              document.getElementById('formLogin').style.display = 'block';
          }
//          hi?n th? khi ??ng ký
          function signIn(){
              document.getElementById('formSign').style.display = 'block';
              document.getElementById('formLogin').style.display = 'none';
          }
      </script>
     <script src="js/jquery.min.js"></script>
    <script src="js/jquery.singlePageNav.min.js"></script>
    <script src="js/parallax.min.js"></script>
    <script src="slick/slick.min.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/templatemo-scripts.js"></script>
  </body>   
</html>