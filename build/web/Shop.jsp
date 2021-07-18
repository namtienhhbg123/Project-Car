<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Shop</title>
    <script src="https://kit.fontawesome.com/d3fa3cecaa.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Mulish:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,200;1,300;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Merriweather:ital,wght@0,300;0,400;0,700;0,900;1,300;1,400;1,700;1,900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="libs/bootstrapv4.5/css/bootstrap.css">
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="libs/bootstrapv4.5/js/bootstrap.js"></script>
    <link rel="stylesheet" href="css/shop.css">
</head>
<body>
    <section class="sectional header">
        <div class="container-fluid">
            <div class="logo">
                <a href="Test" style="text-decoration: none; color: black"><h1>NTAuto</h1></a>
            </div>
            <div class="right">
                <ul class="menu">
                    <li><a href="Test" style="color: #f86d72;border-bottom: 1px solid #f86d72">Home</a></li>
                    <li><a href="ShopControl">Shop</a></li>
                    <c:if test="${sessionScope.ac != null && sessionScope.ac.isAdmin==true}">
                        <li>
                            <a href="#">Hello ${ac.userName}</a>                                   
                        </li>
                        <li>
                            <a href="ManagerAllProductControl">Manager</a>                       
                        </li>
                        <li>  
                            <a href="LogoutControl"> <p>Logout</p></a>                       
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.ac != null&& sessionScope.ac.isAdmin==false}">
                        <li>
                            <a href="#">Hello ${ac.userName}</a>                                   
                        </li>
                        <li>  
                            <a href="LogoutControl"> <p>Logout</p></a>                       
                        </li>
                    </c:if>    

                    <li class="dropdows">
                        <a href="#">Categorys<i class="fas fa-chevron-down" style="margin-left: 5px;font-size: 0.6em;"></i></a>
                        <div class="dropdows-menu">
                            <div class="dropdows-item"><a href="#">Calendars</a></div>
                            <div class="dropdows-item"><a href="#">Diary</a></div>
                        </div>
                    </li>
                </ul>
                <ul class="menu_seach">
                    <li><a href="#"><i class="fas fa-search"></i></a></li>
                    <li><a href="#"><i class="far fa-heart"></i></a></li>
                    
                <c:if test="${sessionScope.ac == null}">
                    <li><a href="Login.jsp"><i class="far fa-user-circle"></i></a></li>
                </c:if>     
                    <li><a href="#"><i class="fas fa-shopping-bag"></i></a></li>
                </ul>
            </div>
        </div>
    </section>
    <section class="sectional slide1">
        <div class="container-fluid">
            <div class="row">
                <div class="breadcrumbb">
                    <img src="img/Breadcumd.jpg" alt=""/>
                    <div class="breadcrumb_content">
                        <h1>Shop</h1>
                        <a href="Test" onclick="removeSes()">Home /</a>
                        <a href="ShopControl" onclick="removeSes()">Shop</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="sectional slide2">
        <div class="container">
            <div class="row">
                <div class="col-xl-3 slide2_left">
                    <div class="input-group mb-3">
                        <form name="search" method="post" action="SearchControl">
                            <% HttpSession ses = request.getSession(); %>
                            <select id="se" name="theloai">
                                <option value="loaixe">Type</option>
                                <option value="ProductName">Product Name</option>
                                <option value="namsanxuat">Year</option>
                                <option value="xuatxu">Country of car</option>
                                <option value="mausac">Color</option>
                                <option value="UnitsPrice <">Price (<)</option>
                                <option value="UnitsPrice >">Price (>)</option>
                            </select>   
                            
                            <input type="text" class="form-control input_search" placeholder="Search..." aria-label="Recipient's username" aria-describedby="button-addon2" name="txtSearch" 
                                   value="<%=(String)ses.getAttribute("txtSearch")%>">
                            <div class="input-group-append" style="width: 20%;">
                                <button class="btn btn-outline-secondary button_search" type="submit" id="button-addon2" onclick="m()"><i class="fas fa-search"></i></button>
                            </div>
                        </form>
                        </div>
                        <br>
                        <div class="input-group mb-3">
                        <!--              sap xep-->
                        <form action="OrderByControl" method="get">
                            <div id ="sort" class="input-group input-group-lg">
                                <span class="input-group-text" id="inputGroup-sizing-lg">Sort by</span>
                                <select id="listSapXep" name="orderby" style="width: 70%">
                                    <option value="ProductName">Product Name</option>
                                    <option value="namsanxuat">Year</option>
                                    <option value="UnitsPrice">Prices range from cheap to expensive</option>
                                    <option value="UnitsPrice desc">Prices range from expensive to cheap</option>
                                </select> 
                                <button type="submit" class="btn btn-success" onclick="orderBy()">Sort</button>
                            </div>
                        </form>
                    </div>
                    <div class="categories">
                        <h2 style="font-size: 16px;border-bottom:1px solid rgba(248,109,114,.25);">Categories</h2>
                        <div style="margin-bottom: 30px" class="h2_gach"></div>
                        <ul>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                        </ul>
                    </div>
                    <div class="price">
                        <h2 style="font-size: 16px;border-bottom:1px solid rgba(248,109,114,.25);">Price</h2>
                        <div style="margin-bottom: 30px" class="h2_gach"></div>
                        <input type="number" name="years" placeholder="Min"/>
                        <span>-</span>
                        <input type="number" name="years" placeholder="Max"/>
                        <button class="btn btn-outline-secondary button_search" type="button"><i class="fas fa-search"></i></button>
                    </div>
                    <div class="designer">
                        <h2 style="font-size: 16px;border-bottom:1px solid rgba(248,109,114,.25);">Designer</h2>
                        <div style="margin-bottom: 30px" class="h2_gach"></div>
                        <ul>
                            <li><a href="#">Anna Hillton </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                            <li><a href="#">Business </a>(3)</li>
                        </ul>
                    </div>
                    <div class="sale">
                        <img src="imgs/Image-1-2.jpg">
                    </div>
                    <div class="tags">
                        <h2 style="font-size: 16px;border-bottom:1px solid rgba(248,109,114,.25);">Tags</h2>
                        <div style="margin-bottom: 30px" class="h2_gach"></div>
                        <button class="btn btn-outline-secondary button_tags" type="button">classic</button>
                        <button class="btn btn-outline-secondary button_tags" type="button">kids</button>
                        <button class="btn btn-outline-secondary button_tags" type="button">classic</button>
                        <button class="btn btn-outline-secondary button_tags" type="button">classic</button>
                        <button class="btn btn-outline-secondary button_tags" type="button">classic</button>
                        <button class="btn btn-outline-secondary button_tags" type="button">kids</button>
                        <button class="btn btn-outline-secondary button_tags" type="button">classic</button>
                        <button class="btn btn-outline-secondary button_tags" type="button">classic</button>
                        <button class="btn btn-outline-secondary button_tags" type="button">classic</button>
                    </div>
                </div>
                <div class="col-xl-9 slide2_right">
<!--                    san pham-->
                <c:forEach items="${list}" var="o">
                    <div class="col-xl-4 new_product">
                        <div class="img_product">
                            <img src="${o.img}" class="image_1"/>
                            <div class="product_hover">
                                <img src="${o.img}" class="image"/>
                                <div class="product_hover_a">
                                    <a href="#"><i class="fas fa-cart-arrow-down a"></i></a>
                                    <a href="#"><i class="fas fa-search a"></i></a>
                                    <a href="#"><i class="far fa-heart a"></i></a>
                                </div>
                            </div>
                        </div>
                        <div class="contact_product">
                            <a href="ProductDetailControl?pid=${o.productID}">${o.productName}</a>
                            <h3><i>by</i> <a href="#"> Coco Simon</a></h3>
                            <p>${o.unitPrice}</p>
                        </div>
                    </div>
                    </c:forEach>                  
                </div>
            </div>
        </div>
    </section>
    <section class="sectional slide7">
        <div class="container-fluid" style="padding: 0 80px">
            <div class="col-xl-3 slide7_content">
                <div class="new_arrivals h2">
                    <h2 style="font-size: 16px;">Contact Us</h2>
                    <div style="margin-bottom: 20px" class="h2_gach"></div>
                </div>
                <div class="slide7-content">
                    <i class="fas fa-map-marker-alt"></i>
                    <p>1998 Wall Street 707, Washington DC, USA</p>
                </div>
                <div class="slide7-content">
                    <i class="far fa-envelope"></i>
                    <p>    bookmart@domain.com<br/>
                        support@gmail.com</p>
                </div>
                <div class="slide7-content">
                    <i class="fas fa-mobile-alt"></i>
                    <p>    ( 84) 0123 456 789<br/>
                        ( 84) 00123 456 789</p>
                </div>
            </div>
            <div class="col-xl-3 slide7_content">
                <div class="new_arrivals h2">
                    <h2 style="font-size: 16px;">Information</h2>
                    <div style="margin-bottom: 20px" class="h2_gach"></div>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">Contact Us</a>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">Site Map</a>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">Privacy Policy</a>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">About Us</a>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">Costumer Service</a>
                </div>
            </div>
            <div class="col-xl-3 slide7_content">
                <div class="new_arrivals h2">
                    <h2 style="font-size: 16px;">My Account</h2>
                    <div style="margin-bottom: 20px" class="h2_gach"></div>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">Sign In</a>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">View Cart</a>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">My Wishtlist</a>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">Track My Order</a>
                </div>
                <div class="slide7-content" style="margin-bottom: 15px">
                    <a href="#">Help</a>
                </div>
            </div>
            <div class="col-xl-3 slide7_content">
                <div class="new_arrivals h2">
                    <h2 style="font-size: 16px;">Instagram</h2>
                    <div style="margin-bottom: 20px" class="h2_gach"></div>
                </div>
                <div class="slide7_contact">
                    <img src="imgs/Image-1-720x484.jpg"/>
                    <img src="imgs/Image-1-720x484.jpg"/>
                    <img src="imgs/Image-1-720x484.jpg"/>
                </div>
                <div class="time">
                    7 Days A Week From 8.00 Am To 5 Pm
                </div>
                <div class="contact">
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-facebook-f"></i></a>
                    <a href="#"><i class="fab fa-google-plus-g"></i></a>
                    <a href="#"><i class="fab fa-invision"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
    </section>
</body>
    <script>
//        l?u gúa tr? khi ch?n th? lo?i tìm ki?m
        function  m(){
          var selecteTypeCar = document.getElementById('se').value;
          // Kh?i t?o sesionStorage
          sessionStorage.setItem('select', selecteTypeCar);  
        }
        function    
        removeSes(){
//            xóa h?t các sessionStorange 
           sessionStorage.clear();
        }
//        l?y giá tr? ch?n c?a dánh sách s?p x?p
        function orderBy(){
//            l?y ra giá tr? c?a cái mình ch?n
          var selecteOrder = document.getElementById('listSapXep').value;
          // Kh?i t?o sesionStorage
          sessionStorage.setItem('orderby', selecteOrder); 
        }
        
        if(sessionStorage.getItem('select')==null && sessionStorage.getItem('orderby')==null){          
           document.getElementById('se').value = 'loaixe';
           document.getElementById('listSapXep').value = 'ProductName';
//        cho nó select
           document.getElementById('listSapXep').selected;
           document.getElementById('se').selected;
        }
        else{
//        l?y giá tr? c?a sessioon ra
            var itemSearch = sessionStorage.getItem('select');
            var itemOrder = sessionStorage.getItem('orderby');
            document.getElementById('se').value = itemSearch;
            document.getElementById('listSapXep').value = itemOrder;
//        cho nó select
            document.getElementById('se').selected;
            document.getElementById('listSapXep').selected;
        }
  </script>  
</html>