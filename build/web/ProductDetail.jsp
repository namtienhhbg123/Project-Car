<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ProductDetail</title>
    <script src="https://kit.fontawesome.com/d3fa3cecaa.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Mulish:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,200;1,300;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Merriweather:ital,wght@0,300;0,400;0,700;0,900;1,300;1,400;1,700;1,900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="libs/bootstrapv4.5/css/bootstrap.css">
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="libs/bootstrapv4.5/js/bootstrap.js"></script>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="css/product.css">
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
                        <h1>Product Details</h1>
                        <a href="Test">Home / </a>
                        <a href="ShopControl"> Shop </a>
                        <span class="delimiter">
                            / Name product
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="sectional slide2">
        <div class="container">
            <div class="row">
                <div class="product-details">
                    <div class="product_left">
                        <div class="w3-content" style="max-width:800px">
                            <img class="mySlides" src="${pd.img1}" style="width:100%">
                            <img class="mySlides" src="${pd.img2}" style="width:100%">
                            <img class="mySlides" src="${pd.img3}" style="width:100%">
                        </div>

                        <div class="w3-center">
                            <div class="w3-section">
                                <button class="w3-button w3-light-grey" onclick="plusDivs(-1)">Prev</button>
                                <button class="w3-button w3-light-grey" onclick="plusDivs(1)">Next</button>
                            </div>
                            <button class="w3-button demo" onclick="currentDiv(1)">1</button> 
                            <button class="w3-button demo" onclick="currentDiv(2)">2</button> 
                            <button class="w3-button demo" onclick="currentDiv(3)">3</button> 
                        </div>
                    </div>
                    <div class="product_right">
                        <div class="name_product">
                            <h2>${p.productName}</h2>
                            <div class="star">
                                <i>x x x x x</i>
                                <p>(2 customer reviews)</p>
                            </div>
                            <div class="price">${p.unitPrice} $</div>
                        </div>
                        <hr style="margin-top: 120px">
                        <div class="check">
                            <div class="check_icon">
                                <i class="fas fa-check-circle" style="margin-left: 1px;margin-top: 1px"></i>
                            </div>
                            <span>In Stock</span>
                        </div>
                        <div class="description">
                            <p>Phasellus sed volutpat orci. Fusce eget lore mauris vehicula elementum gravida nec dui. Aenean aliquam varius ipsum, non ultricies tellus sodales eu. Donec dignissim viverra nunc, ut aliquet magna posuere eget.</p>
                        </div>
                        <div class="add-to-cart">
                            <c:if test="${sessionScope.ac != null && p.unitsInStock == 1}">
                                <a href="#buyCar" data-toggle="modal">BUY NOW</a>
                            </c:if>
<!--                                can dang nhap de mua san pham-->
                            <c:if test="${sessionScope.ac == null}">
                                <a href="Login.jsp">BUY NOW</a>
                            </c:if>
                            <c:if test="${p.unitsInStock == 0}">
                                <a href="#">Het Hang</a>
                            </c:if>       
                            <a href="#" style="padding: 15px"><i class="far fa-heart" style="font-size: 1.3em;margin-top: 3px"></i></a>
                        </div>
                        <hr style="margin-top: 35px">
                        <div class="product-meta">
                            <h4>Gia xe: <a href="#">${p.unitPrice}</a></h4>
                            <h4>Sale: <a href="#">${pd.sale}</a></h4>
                            <h4>Nam san xuat: <a href="#">${pd.namsanxuat}</a></h4>
                            <h4>Hop so: <a href="#">${pd.hopso}</a></h4>
                            <h4>Tinh trang: <a href="#">${pd.tinhtrang}</a></h4>
                            <h4>Xuat xu: <a href="#">${pd.xuatxu}</a></h4>
                            <h4>Mau sac: <a href="#">${pd.mausac}</a></h4>
                            <h4>Nhien lieu: <a href="#">${pd.nhienlieu}</a></h4>
                            <h4>So ghe: <a href="#">${pd.soghe}</a></h4>
                            <h4>Share:
                                <a href="#"><i class="fab fa-twitter"></i></a>
                                <a href="#"><i class="fab fa-facebook-f"></i></a>
                                <a href="#"><i class="fab fa-google-plus-g"></i></a>
                                <a href="#"><i class="fab fa-invision"></i></a>
                                <a href="#"><i class="fab fa-instagram"></i></a>
                            </h4>
                        </div>
                    </div>
                </div>
                <div class="related-products">
                    <h2 style="">Related Products</h2>
                    <div style="margin-bottom: 20px" class="h2_gach"></div>
                    <c:if test="${listType!=null}">
                    <c:forEach items="${listType}" var="o">
                    <div class="col-xl-3 new_product">
                        <div class="img_product">
                            <img src="${o.img}" class="image_1"/>
                            <div class="product_hover">
                                <img src="${o.img}" class="image"/> 
                            </div>
                        </div>
                        <a href="ProductDetailControl?pid=${o.productID}">${o.productName}</a>    
                        <p>${o.unitPrice}</p>
                    </div>
                    </c:forEach>
                    </c:if>
                </div>
                <div class="reviews">
                    <h2 style="">Reviews</h2>
                    <div style="margin-bottom: 20px" class="h2_gach"></div>
                    <div class="review-item">
                        <div class="avartar">
                            <i class="far fa-user"></i>
                        </div>
                        <div class="comment">
                            <div class="time_star">
                                <h3 class="user">D??ng Ng-<p class="time">October 4, 2018</p></h3>
                                <div class="box-star"><div class="star"></div></div>
                            </div>
                            <p>Mauris cursus arcu neque, nec bibendum lorem convallis vel. Nulla ac tincidunt est.
                                Praesent sodales nisi diam. Etiam ullamcorper turpis erat,
                                eu malesuada turpis pulvinar sed.</p>
                        </div>
                    </div>
                </div>
            </div>
<!-- Buy a car HTML -->
<div id="buyCar" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
                    <form action="buy" method="get">
				<div class="modal-header">						
					<h4 class="modal-title">Enter infomation</h4>
                                        
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">					
                                        <div class="form-group" style="display: none;">
						<label>ID of car</label>
                                                <input name="productid" type="text" class="form-control" required value="${p.productID}">
					</div>
					<div class="form-group">
						<label>Name</label>
                                                
                                                <input name="namecustomer" type="text" class="form-control" value="${ep.productName}" required>
					</div>		
                                        
                                        <div class="form-group">
						<label>Address</label>
						<input name="addresscustomer" type="text" class="form-control" required>
					</div>     
                                    <div class="form-group">
                                        <label>Email</label>
                                        <input name="emailcustomer" type="text" class="form-control" required>
                                    </div>
                                        
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
					<input type="submit" class="btn btn-info" value="Save">
				</div>
			</form>
		</div>
	</div>
</div>
        </div>
    </section>
                            <script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" w3-red", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-red";
}
</script>
</body>
</html>