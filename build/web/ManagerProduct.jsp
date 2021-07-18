<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Manager</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
body {
	color: #566787;
	background: #f5f5f5;
	font-family: 'Varela Round', sans-serif;
	font-size: 13px;
}
.table-responsive {
    margin: 30px 0;
}
.table-wrapper {
	background: #fff;
	padding: 20px 25px;
	border-radius: 3px;
	min-width: 1000px;
	box-shadow: 0 1px 1px rgba(0,0,0,.05);
}
.table-title {        
	padding-bottom: 15px;
	background: #435d7d;
	color: #fff;
	padding: 16px 30px;
	min-width: 100%;
	margin: -20px -25px 10px;
	border-radius: 3px 3px 0 0;
}
.table-title h2 {
	margin: 5px 0 0;
	font-size: 24px;
}
.table-title .btn-group {
	float: right;
}
.table-title .btn {
	color: #fff;
	float: right;
	font-size: 13px;
	border: none;
	min-width: 50px;
	border-radius: 2px;
	border: none;
	outline: none !important;
	margin-left: 10px;
}
.table-title .btn i {
	float: left;
	font-size: 21px;
	margin-right: 5px;
}
.table-title .btn span {
	float: left;
	margin-top: 2px;
}
table.table tr th, table.table tr td {
	border-color: #e9e9e9;
	padding: 12px 15px;
	vertical-align: middle;
}
table.table tr th:first-child {
	width: 60px;
}
table.table tr th:last-child {
	width: 100px;
}
table.table-striped tbody tr:nth-of-type(odd) {
	background-color: #fcfcfc;
}
table.table-striped.table-hover tbody tr:hover {
	background: #f5f5f5;
}
table.table th i {
	font-size: 13px;
	margin: 0 5px;
	cursor: pointer;
}	
table.table td:last-child i {
	opacity: 0.9;
	font-size: 22px;
	margin: 0 5px;
}
table.table td a {
	font-weight: bold;
	color: #566787;
	display: inline-block;
	text-decoration: none;
	outline: none !important;
}
table.table td a:hover {
	color: #2196F3;
}
table.table td a.edit {
	color: #FFC107;
}
table.table td a.delete {
	color: #F44336;
}
table.table td i {
	font-size: 19px;
}
table.table .avatar {
	border-radius: 50%;
	vertical-align: middle;
	margin-right: 10px;
}
.pagination {
	float: right;
	margin: 0 0 5px;
}
.pagination li a {
	border: none;
	font-size: 13px;
	min-width: 30px;
	min-height: 30px;
	color: #999;
	margin: 0 2px;
	line-height: 30px;
	border-radius: 2px !important;
	text-align: center;
	padding: 0 6px;
}
.pagination li a:hover {
	color: #666;
}	
.pagination li.active a, .pagination li.active a.page-link {
	background: #03A9F4;
}
.pagination li.active a:hover {        
	background: #0397d6;
}
.pagination li.disabled i {
	color: #ccc;
}
.pagination li i {
	font-size: 16px;
	padding-top: 6px
}
.hint-text {
	float: left;
	margin-top: 10px;
	font-size: 13px;
}    
/* Custom checkbox */
.custom-checkbox {
	position: relative;
}
.custom-checkbox input[type="checkbox"] {    
	opacity: 0;
	position: absolute;
	margin: 5px 0 0 3px;
	z-index: 9;
}
.custom-checkbox label:before{
	width: 18px;
	height: 18px;
}
.custom-checkbox label:before {
	content: '';
	margin-right: 10px;
	display: inline-block;
	vertical-align: text-top;
	background: white;
	border: 1px solid #bbb;
	border-radius: 2px;
	box-sizing: border-box;
	z-index: 2;
}
.custom-checkbox input[type="checkbox"]:checked + label:after {
	content: '';
	position: absolute;
	left: 6px;
	top: 3px;
	width: 6px;
	height: 11px;
	border: solid #000;
	border-width: 0 3px 3px 0;
	transform: inherit;
	z-index: 3;
	transform: rotateZ(45deg);
}
.custom-checkbox input[type="checkbox"]:checked + label:before {
	border-color: #03A9F4;
	background: #03A9F4;
}
.custom-checkbox input[type="checkbox"]:checked + label:after {
	border-color: #fff;
}
.custom-checkbox input[type="checkbox"]:disabled + label:before {
	color: #b8b8b8;
	cursor: auto;
	box-shadow: none;
	background: #ddd;
}
/* Modal styles */
.modal .modal-dialog {
	max-width: 400px;
}
.modal .modal-header, .modal .modal-body, .modal .modal-footer {
	padding: 20px 30px;
}
.modal .modal-content {
	border-radius: 3px;
	font-size: 14px;
}
.modal .modal-footer {
	background: #ecf0f1;
	border-radius: 0 0 3px 3px;
}
.modal .modal-title {
	display: inline-block;
}
.modal .form-control {
	border-radius: 2px;
	box-shadow: none;
	border-color: #dddddd;
}
.modal textarea.form-control {
	resize: vertical;
}
.modal .btn {
	border-radius: 2px;
	min-width: 100px;
}	
.modal form label {
	font-weight: normal;
}
.delete-curso{
    cursor:pointer;
}
</style>
<script>
$(document).ready(function(){
	// Activate tooltip
	$('[data-toggle="tooltip"]').tooltip();
	
	// Select/Deselect checkboxes
	var checkbox = $('table tbody input[type="checkbox"]');
	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});
	checkbox.click(function(){
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});
});
</script>
</head>
<body>
<div class="container-xl">
	<div class="table-responsive">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-6">
						<h2>Manage <b>Product</b></h2>
					</div>
					<div class="col-sm-6">
						<a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Product</span></a>
						<a href="#feedback" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>View Feedback</span></a>
                                                <br>
						<a href="#schedule" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Schedule a car delivery</span></a>																														
					</div>
				</div>
			</div>
                    <table id="POITable" class="table table-striped table-hover">
				<thead>
					<tr>

						<th>Product ID</th>
						<th>Prodcut name</th>
                                                <th>Image</th>
						<th>Category ID</th>
						<th>Units In Stock</th>
						<th>Units On Order</th>
						<th>Units Price</th>						
					</tr>
				</thead>
				<tbody>
                                    <c:forEach items="${list}" var="o">
					<tr>
						<td>${o.productID}</td>
						<td>${o.productName}</td>
                                                <td><img src="${o.img}"></td>
						<td>${o.categoryID}</td>
						<td>${o.unitsInStock}</td>
						<td>${o.unitsOnOrder}</td>
						<td>${o.unitPrice}</td>
						
						<td>
                                                        
                                                        <a onclick="editProduct(this,${o.productID})" href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                                        <a class="delete-curso" onclick="deleteProduct(this,${o.productID})"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                                     
						</td>
					</tr>
                                        </c:forEach>
				</tbody>
			</table>
			<div class="clearfix">
				<div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
				<ul class="pagination">
					<li class="page-item disabled"><a href="#">Previous</a></li>
					<li class="page-item"><a href="#" class="page-link">1</a></li>
					<li class="page-item"><a href="#" class="page-link">2</a></li>
					<li class="page-item active"><a href="#" class="page-link">3</a></li>
					<li class="page-item"><a href="#" class="page-link">4</a></li>
					<li class="page-item"><a href="#" class="page-link">5</a></li>
					<li class="page-item"><a href="#" class="page-link">Next</a></li>
				</ul>
			</div>
		</div>
	</div>        
</div>
<!-- Edit Modal HTML -->
<div id="addEmployeeModal" class="modal fade">
	<div class="modal-dialog">
<!--            them san pham-->
		<div class="modal-content">
                    <form action="AddProductControl" method="post">
				<div class="modal-header">						
					<h4 class="modal-title">Add Employee</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
   
					<div class="form-group">
						<label>Product Name</label>
                                                <input name="productname" type="text" class="form-control" required>
					</div>
					<div class="form-group">
						<label>Image 1</label>
						<input name="img1" type="text" class="form-control" required>
					</div>
                                        <div class="form-group">
						<label>Image 2</label>
						<input name="img2" type="text" class="form-control" required>
					</div>
                                        <div class="form-group">
						<label>Image 3</label>
						<input name="img3" type="text" class="form-control" required>
					</div>
                                        <div class="form-group">
						<label>Image 4</label>
						<input name="img4" type="text" class="form-control" required>
                                        </div>
                               
					<div class="form-group">
						<label>Category ID</label>
						<textarea name="categoryid" class="form-control" required></textarea>
					</div>
					<div class="form-group">
						<label>Units In Stock</label>
						<input name="unitsinstock" type="text" class="form-control" required>
					</div>	
                                        <div class="form-group">
						<label>Units On Order</label>
						<input name="unitsonorder" type="text" class="form-control" required>
					</div>
                                        <div class="form-group">
						<label>Units Pricer</label>
						<input name="unitsprice" type="text" class="form-control" required>
					</div>     
                                    <div class="form-group">
                                        <label>Category</label>
                                        <input name="loaixe" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Year of manufacture</label>
                                        <input name="namsanxuat" type="date" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Hop so</label>
                                        <input name="hopso" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Tinh trang</label>
                                        <input name="tinhtrang" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Xuat xu</label>
                                        <input name="xuatxu" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Color</label>
                                        <input name="color" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Nhien lieu</label>
                                        <input name="nhienlieu" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>So ghe</label>
                                        <input name="soghe" type="number" class="form-control" required>
                                    </div>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
					<input type="submit" class="btn btn-success" value="Add">
				</div>
			</form>
		</div>
	</div>
</div>
<!-- Edit Modal HTML -->
<div id="editEmployeeModal" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form>
				<div class="modal-header">						
					<h4 class="modal-title">Edit Product</h4>
                                        
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">					
					
					<div class="form-group">
						<label>Product Name</label>
                                                
                                                <input name="productname" type="text" class="form-control" value="${ep.productName}" required>
					</div>
					<div class="form-group">
						<label>Image 1</label>
						<input name="img1" type="text" class="form-control" required>
					</div>
                                        <div class="form-group">
						<label>Image 2</label>
						<input name="img2" type="text" class="form-control" required>
					</div>
                                        <div class="form-group">
						<label>Image 3</label>
						<input name="img3" type="text" class="form-control" required>
					</div>
                                        <div class="form-group">
						<label>Image 4</label>
						<input name="img4" type="text" class="form-control" required>
                                        </div>
                               
					<div class="form-group">
						<label>Category ID</label>
						<textarea name="categoryid" class="form-control" required></textarea>
					</div>
					<div class="form-group">
						<label>Units In Stock</label>
						<input name="unitsinstock" type="text" class="form-control" required>
					</div>	
                                        <div class="form-group">
						<label>Units On Order</label>
						<input name="unitsonorder" type="text" class="form-control" required>
					</div>
                                        <div class="form-group">
						<label>Units Pricer</label>
						<input name="unitsprice" type="text" class="form-control" required>
					</div>     
                                    <div class="form-group">
                                        <label>Category</label>
                                        <input name="loaixe" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Year of manufacture</label>
                                        <input name="namsanxuat" type="date" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Hop so</label>
                                        <input name="hopso" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Tinh trang</label>
                                        <input name="tinhtrang" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Xuat xu</label>
                                        <input name="xuatxu" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Color</label>
                                        <input name="color" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Nhien lieu</label>
                                        <input name="nhienlieu" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>So ghe</label>
                                        <input name="soghe" type="number" class="form-control" required>
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
<!-- Feedback of user -->
<div id="feedback" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
				<div class="modal-header">						
					<h4 class="modal-title">Delete Employee</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
                                    
                                        <table border="1">
                                            <thead>
                                                <tr>
                                                    <th>Email</th>
                                                    <th>User Name</th>
                                                    <th>Phone</th>
                                                    <th>Title</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${listFB}" var="o">
                                                <tr>
                                                    <td>${o.email}</td>
                                                    <td>${o.name}</td>
                                                    <td>${o.phone}</td>
                                                    <td>${o.title}</td>
                                                </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>                                            
                                    
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
				</div>
		</div>
	</div>
</div>
<!-- dat lich giao xe cho khach hang -->
<div id="schedule" class="modal fade" >
    <div class="modal-dialog">
		<div class="modal-content" style="width: 600px">
				<div class="modal-header">						
					<h4 class="modal-title">Schedule a car delivery</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">      
                                    
                                        <table border="1">
                                            <div class="form-group">
                                            <thead>
                                                <tr>
                                                    <th>Phone</th>
                                                    <th>Email</th>
                                                    <th>User Name</th>
                                                    <th>Date</th>
                 
                                                    <th>Save</th>
                                             
                                                </tr>
                                            </thead>
                                            </div>
                                            <div class="form-group">
                                            <tbody>
                                                <c:forEach items="${listAc}" var="a">
                                                <tr>
                                                    <td>${a.phone}</td>
                                                    <td>${a.email}</td>
                                                    <td>${a.userName}</td>
                                                <form action="schedule" method="get">
                                                    <td><input type="date" name="scheduleCar"></td>
                                                    <td hidden><input type="text" name="phoneUser" value="${a.phone}"></td>
                                                    <td><button type="submit">Save</button></td>
                                                </form>    
                                                </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>                                            
                                    			
					
				</div>
				</div>
				<div class="modal-footer" style="width: 600px">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
				</div>
		</div>
	</div>
</div>
<!--    dùng ajax ?? khi delete không ph?i load l?i-->
        <script>
                function deleteProduct(row,pid){
//                    xóa hàng trong table
                    var i=row.parentNode.parentNode.rowIndex;
                    document.getElementById('POITable').deleteRow(i);
                    $.ajax({
                        url: '/NTAuto/DeleteProduct',
                        type: 'GET',
                        data: {//truyen id va status
                            proid: pid
                        },
                        success: function (data) {
                            //do some thing
                        }
                    });
                }
                function editProduct(btn,pid){
                    $.ajax({
                        url: '/NTAuto/editProduct',
                        type: 'GET',
                        data: {//truyen id va status
                            eid: pid
                        },
                        success: function (data) {
                            //do some thing
                        }
                    });
                }

        </script>
</body>
</html>