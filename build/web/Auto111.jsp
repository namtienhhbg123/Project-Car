<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta http-equiv="X-UA-Compatible" content="ie=edge" />
<!--      <img href="https://travelcar.vn/images/logo/Lexus.png">-->
      <title>NTAuto</title>   
      <link rel="shortcut icon" href="https://i.vdoc.vn/data/image/2016/08/31/nhan-biet-bieu-tuong-logo-cua-cac-hang-xe-o-to-noi-tieng-the-gioi-10.jpg" />
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
    <link rel="preconnect" href="https://fonts.gstatic.com">
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
        .bestsell{
            margin-left: 20%;
        }
    </style>
  </head>
  <body>
    <main class="container-fluid">
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
            <a class="click" href="Test" onclick="removeSes()">
                        <img src="https://image.freepik.com/free-vector/automotive_25327-95.jpg" alt="" style="width: 140px; height: 120px;border-radius: 100%">
                        NTAUTO
                        </a>                         
                        
                      </h1>
                  </div>
                </div>
              </div>
<!--                dang nhap-->
                <div>
<!--                    road to login.jsp-->

            <c:if test="${sessionScope.ac != null && sessionScope.ac.isAdmin==true}">
                    <li class="nav-item">
                        <h1 style="color: yellow;
                            font-family: 'Lobster', cursive;
                            ">Hello ${ac.userName}</h1>
                        <a href="ManagerAllProductControl" style="
                           text-decoration: none
                           ;color: #fff">
                            <h1>Manager</h1>
                        </a>    
                        <a href="LogoutControl" style="
                           text-decoration: none
                           ;color: #fff">
                            <h1>Logout</h1>
                        </a>
                        <a href="ShopControl" style="
                           text-decoration: none
                           ;color: #fff">
                            <h1>Go To Shop</h1>
                        </a> 
                    </li>
                </c:if>
                <c:if test="${sessionScope.ac != null&& sessionScope.ac.isAdmin==false}">
                    <li class="nav-item">
                        <h1 style="color: yellow;
                            font-family: 'Lobster', cursive;
                            ">Hello ${ac.userName}</h1>
                        <a href="#talk" style="
                           text-decoration: none
                           ;color: #fff" data-toggle="modal">
                            <h4></h4>
                        </a>    
                        <a href="LogoutControl" style="
                           text-decoration: none
                           ;color: #fff">
                            <h1>Logout</h1>
                        </a>
                        <a href="ShopControl" style="
                           text-decoration: none
                           ;color: #fff">
                            <h1>Go To Shop</h1>
                        </a> 
                    </li>
                </c:if>    
                <c:if test="${sessionScope.ac == null}">
                    <li class="nav-item">
                        <a href="Login.jsp" style="
                           text-decoration: none
                           ;color: #fff">
                            <h1>Login</h1>
                    </a>
                    </li>
                </c:if>
 


                </div> 
                
              <ul id="tmMainNav" class="nav flex-column text-uppercase text-right tm-main-nav">
                  <c:if test="${sessionScope.ac != null&& sessionScope.ac.isAdmin==false}">
                      <li class="nav-item">
                          <a href="#talk" class="nav-link">
                              <span class="d-inline-block mr-3">View car reservation schedule</span>
                              <span class="d-inline-block tm-white-rect"></span>
                          </a>
                      </li> 
                  </c:if>
                  
                <li class="nav-item">
                  <a href="#intro" class="nav-link active">
                    <span class="d-inline-block mr-3">Intro</span>
                    <span class="d-inline-block tm-white-rect"></span>
                  </a>
                </li>
                
                
                <li class="nav-item">
                  <a href="#about" class="nav-link">
                    <span class="d-inline-block mr-3">About</span>
                    <span class="d-inline-block tm-white-rect"></span>
                  </a>
                </li>
                <!--                  tìm ki?m-->
                <li class="nav-item">
                  <a href="#shop" class="nav-link active">
                      <span class="d-inline-block mr-3">Shop</span>
                      <span class="d-inline-block tm-white-rect"></span>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="#work" class="nav-link">
                    <span class="d-inline-block mr-3">Product</span>
                    <span class="d-inline-block tm-white-rect"></span>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="#clients" class="nav-link">
                    <span class="d-inline-block mr-3">Clients</span>
                    <span class="d-inline-block tm-white-rect"></span>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="#talk" class="nav-link">
                    <span class="d-inline-block mr-3">Contact</span>
                    <span class="d-inline-block tm-white-rect"></span>
                  </a>
                </li> 
 
<!--                login-->             
              </ul>
              <ul class="nav flex-row tm-social-links">
                <li class="nav-item">
                  <a href="https://facebook.com" class="nav-link tm-social-link">
                    <i class="fab fa-facebook-f"></i>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="https://twitter.com" class="nav-link tm-social-link">
                    <i class="fab fa-twitter"></i>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="https://dribbble.com" class="nav-link tm-social-link">
                    <i class="fab fa-dribbble"></i>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="https://linkedin.com" class="nav-link tm-social-link">
                    <i class="fab fa-linkedin-in"></i>
                  </a>
                </li>
              </ul>
              <footer class="text-center text-white small">
                <p class="mb--0 mb-2">Copyright 2020 Dream Pulse</p>
                <p class="mb-0">Design:
                  <a rel="nofollow" href="https://templatemo.com" class="tm-footer-link">Template Mo</a>
                </p>
              </footer>
            </div>
          </nav>
          
          <main role="main" class="ml-sm-auto col-12">
            <div
              class="parallax-window"
              data-parallax="scroll"
              data-image-src="https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2018-rolls-royce-phantom-1536152159.png">
              <div class="tm-section-wrap">
                <section id="intro" class="tm-section">
                    <div class="tm-bg-white-transparent tm-intro">
                        <h1 class="tm-section-title mb-5 text-uppercase tm-color-primary">Welcome to NTAuto</h1>
                        <p class="tm-color-gray">
                            Address:  Trung Hoa - Cau Giay - Ha Noi

                            Phone: 099999999 - 0366866668 .<br>

                            Fax: 0462566668 <br>

                            Email: info@ntauto.com <br>

                            Specializing in buying, selling, and consigning all kinds of cars at home and abroad
                        </p>
                        <p class="mb-0 tm-color-gray">
                          The customer's demand is our enthusiasm
                        </p>
                    </div>              
                </section>
            </div>            
          </div>

          <div class="tm-section-wrap bg-white">
            <section id="about" class="row tm-section">
              <div class="col-xl-6">
                <div class="tm-section-half">    
                    <div><i class="fas fa-6x fa-balance-scale mb-5 tm-section-icon"></i></div>                        
                    <h2 class="tm-section-title tm-color-primary mb-5">About Us</h2>
                    <p class="mb-5">
                      When first section is scrolled up, BG image will be
                      disappeared with a parallax effect. Donec ac tempor tellus, a
                      eleifend ligula. Fusce vitae sem sed purus euismod
                      condimentum.
                    </p>
                    <p>
                      Sed at orci non metus tristique suscipit vitae in nibh. Sed
                      rutrum odio ac est hendrerit, at vestibulum felis condimentum.
                    </p>
                </div>
              </div>
              <div class="col-xl-6">
                <div class="tm-section-half">
                    <div><i class="far fa-6x fa-building mb-5 tm-section-icon"></i></div>
                    <h2 class="tm-section-title tm-color-primary mb-5">Company Profile</h2>
                    <p class="mb-5">
                      You can use this template for your commercial websites or for your clients. 
                      You are NOT allowed to re-post this template as a downloadable ZIP file 
                      on your template collection sites. It is illegal.
                    </p>
                    <p>
                      Suspendisse fermentum orci eget lorem euismod suscipit. Morbi
                      condimentum odio metus, at finibus dolor sollicitudin quis.
                      Curabitur eu congue erat.
                    </p>
                </div>
              </div>
            </section>
          </div>
            
 <div class="tm-section-wrap bg-white">
     <h1 id="shop" style="text-align: center"><a href="ShopControl">GO TO SHOP</a></h1>
<div class="tm-gallery  bestsell"> 
    <h1>Best - selling product</h1>
    <div class="tm-gallery-item">  
        
        <figure class="effect-bubba product">
            <img
                src="https://img1.oto.com.vn/crop/458x344/2020/04/16/20200416101420-bc49_wm.jpg" alt="Our Work Image" class="img-fluid">
            <figcaption>
                <h2>Camry <span>
                        Toyota
                    </span>
                </h2>
                <a href="${o.img}">View more</a>
            </figcaption>
        </figure>                                    

        <a href="ShopControl">Product details</a>                              
    </div>                            
            </div>
<!--         san pham-->
            <section id="work" class="row tm-section">
              <div class="col-12">
                <div class="w-100 tm-double-border-1 tm-border-gray">
                    <div class="tm-double-border-2 tm-border-gray tm-box-pad">
                      <div class="tm-gallery-wrap">
                          <h2 class="tm-color-primary tm-section-title mb-4 ml-2">Our Car</h2>
                          <div class="tm-gallery">
<!--                              khong co san pham tim thay-->
                            <c:if test="${list == null}">
                                <div class="tm-gallery-item">                        
                                      <h1>Not Found</h1>                                                               
                                  </div>              
                            </c:if>    
                              
                             <c:if test="${list != null}">  
                                <c:forEach items="${list}" var="o">
                                  <div class="tm-gallery-item">                        
                                      <figure class="effect-bubba product">
                                          <img
                                              src="${o.img}" alt="Our Work Image" class="img-fluid">
                                          <figcaption>
                                              <h2>${o.productName} <span>

                                                  </span>
                                              </h2>
                                              <a href="${o.img}">View more</a>
                                          </figcaption>
                                      </figure>                                    

                                      <a href="ShopControl">Demo Car</a>                              
                                  </div>          
                              </c:forEach>
                            </c:if>                     
                          </div>
                      </div>                        
                    </div>                  
                  </div>     
              </div>         
            </section>
          </div>
            
          <div class="tm-section-wrap bg-white">
            <section id="clients" class="row tm-section">
              <div class="col-12 tm-section-pad">
                  <div class="tm-flex-item-left">
                      <div class="tm-w-80">
                          <h2 class="tm-color-primary tm-section-title mb-4">Our Clients</h2>
                          <p class="mb-5">
                            Aenean est augue, iaculis ut arcu a, cursus tempus eros.
                            Maecenas ut efficitur lectus, vel commodo nibh. Vivamus
                            consequat massa non euismod facilisis. Morbi assumsan non libero
                            a vehicula. Donec blandit suscipit magna sit amet elementum.
                          </p>
                      </div>
                      
                      <div class="row tm-clients-images">
                        <div class="col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap">
                          <a href="https://google.com">
                            <img src="https://assets.stickpng.com/images/580b57fcd9996e24bc43c48b.png" alt="Client Image" class="img-fluid tm-client-img" />
                          </a>                          
                        </div>
                        <div class="col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap">
                          <a href="https://facebook.com">
                            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRETFosf0KT9oZep86vLpud9oGOcIJEsiYSwA&usqp=CAU" alt="Client Image" class="img-fluid tm-client-img" />
                          </a>                          
                        </div>
                        <div class="col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap">
                          <a href="https://twitter.com">
                            <img src="https://www.logocentral.info/wp-content/uploads/2019/05/BMW-Logo-1920x1080.png" alt="Client Image" class="img-fluid tm-client-img" />
                          </a>                          
                        </div>
                        <div class="col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap">
                          <a href="https://instagram.com">
                            <img src="https://cdn.mos.cms.futurecdn.net/WpcTavg99b5XpK6STzSLZ8.jpg" alt="Client Image" class="img-fluid tm-client-img" />
                          </a>                          
                        </div>
                        <div class="col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap">
                            <a href="https://google.com">
                              <img src="https://www.carlogos.org/logo/Land-Rover-logo-2011-1920x1080.png" alt="Client Image" class="img-fluid tm-client-img" />
                            </a>                          
                          </div>
                          <div class="col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap">
                            <a href="https://facebook.com">
                              <img src="https://www.carlogos.org/logo/Mercedes-Benz-logo-2011-1920x1080.png" alt="Client Image" class="img-fluid tm-client-img" />
                            </a>                          
                          </div>
                          <div class="col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap">
                            <a href="https://twitter.com">
                              <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Ford_Motor_Company_Logo.svg/1024px-Ford_Motor_Company_Logo.svg.png" alt="Client Image" class="img-fluid tm-client-img" />
                            </a>                          
                          </div>
                          <div class="col-xl-3 col-lg-6 col-md-4 col-sm-6 tm-img-wrap">
                            <a href="https://instagram.com">
                              <img src="https://m.atcdn.co.uk/ect/media/w1200/f1d8f620971b49a88706a06bafd947a5.jpg" alt="Client Image" class="img-fluid tm-client-img" />
                            </a>                          
                          </div>
                      </div>
                  </div> 
              </div>                             
            </section>
          </div>
            
          <div class="tm-section-wrap bg-white">
            <section id="talk" class="row tm-section">
                <div class="col-xl-6 mb-5">
                  <div class="tm-double-border-1 tm-border-gray">
                    <div class="tm-double-border-2 tm-border-gray tm-box-pad">
                        <h2 class="tm-color-primary tm-section-title mb-4" style="text-align: center">
                            <a href="Login.jsp">Login</a>
                        </h2>
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
                  <div class="tm-contact-form-wrap">
<!--                      dang nhap -->
                <c:if test="${sessionScope.ac != null}">
                    <form action="FeedbackControl" method="POST" class="tm-contact-form">
                        <div class="form-group">
                            <h3>Name : ${ac.userName}</h3>
                        </div>
                        <div class="form-group">
                           <h3>${ac.email}</h3>
                        </div>
                         <div class="form-group">
                             <label>Car delivery schedule:</label>
                             <c:if test="${sessionScope.ac != null&& sessionScope.ac.isAdmin==false && 
                                              sessionScope.ac.schedule != null}">
                                 <b>${ac.schedule}</b>
                             </c:if>
                             <c:if test="${sessionScope.ac != null&& sessionScope.ac.isAdmin==false && 
                                              sessionScope.ac.schedule == null}">
                                 <b>You have not bought a car</b>
                             </c:if>
                             <h3>Very pleased to serve you</h3>
                        </div>
                        
                        <div class="form-group">
                          <textarea rows="4" id="contact_message" name="feedbackmessage" class="form-control rounded-0 border-top-0 border-right-0 border-left-0" placeholder="Message..." required=""></textarea>
                        </div>
                
                        <div class="form-group mb-0">
                          <button type="submit" class="btn rounded-0 d-block ml-auto tm-btn-primary">
                                Contact
                          </button>
                        </div>
                      </form>
                   </c:if> 
                  </div>                    
                </div>
              </section>
          </div>
        </main>        
      </div>
    </main>
                     
  </body>       
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.singlePageNav.min.js"></script>
    <script src="js/parallax.min.js"></script>
    <script src="slick/slick.min.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/templatemo-scripts.js"></script>
</html>
