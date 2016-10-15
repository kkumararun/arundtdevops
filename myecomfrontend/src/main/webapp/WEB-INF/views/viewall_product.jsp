<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<script src="resources/js/All_Product.js"></script>



<%@include file="linking.jsp" %>
<%@include file="header.jsp" %>



<div ng-app="ngAppProduct">
	<div ng-controller="allProduct">


		<div class="container">
		<input type="text" class="form-control" placeholder="Search Product" ng-model="searchBox">

			<table class="table table-bordered table-hover table-condensed cf table2">
				<thead>
					<tr>
						<th>Sr. Number</th>
						<th>Product Name</th>
						<th>Brand</th>
						<th>Category</th>
						<th>Supplier</th>
						<th>Action</th>

					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="product in allProductData | filter:searchBox">
						<td>{{product.sno}}</td>
						<td>{{product.name}}</td>
						<td>{{product.brand}}</td>
						<td>{{product.category}}</td>
						<td>{{product.supplier}}</td>

						<td><button ng-click="" class="glyphicon glyphicon-trash btn btn-danger"></button></td>
					</tr>
				</tbody>
			</table>

		</div>
		{{msg}}
	</div>

</div>


<%@include file="footer.jsp" %>
