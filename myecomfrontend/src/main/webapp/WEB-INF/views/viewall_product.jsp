
<%-- <%@include file="linking.jsp" %> --%>

<%@include file="header.jsp" %>



<div ng-app="ngAppProduct">
	<div ng-controller="allProduct">


		<div class="container">
		
		<div class="form-group">
      <div class="input-group">
 <div class="input-group-addon"><i class="fa fa-search"></i></div>

    		<input type="text" class="form-control" placeholder="Search Product" ng-init="searchBox ='${cat}'" ng-model="searchBox">
</div>
</div>

			<table class="table table-bordered table-hover table-condensed cf table2">
				<thead>
					<tr>
						<th >Sr. Number</th>
						<th >Product <span class="fa fa-caret-down" ng-click="myDataSort('productName')"></span><span  class="fa fa-caret-up"></span></th>
						<th>Brand</th>
						<th>
						Category 
						 
						
						</th>
						<th>Supplier</th>
						<th>Action</th>

					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="product in allProductData | orderBy:mydata | filter:searchBox">
						<td>{{product.productId}}</td>
						<td>{{product.productName}}</td>
						<td>{{product.productBrand}}</td>
						<td>{{product.productCategory}} </td>
						<td>{{product.productSupplier}}</td>

						<td> <a href="<c:url value="/viewbyproduct/{{product.productId}}"/>" class="btn btn-info">View</a></td>
						<td> <a href="" class="btn btn-success">Add to Cart</a></td>
						<td> <a href=""class="btn btn-warning">Update</a></td>
						<td> <a href="<c:url value="/deletebyid/{{product.sno}}"/>" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span></a></td>
					</tr>
				</tbody>
			</table>

		</div>
		
	</div>

</div>

<sript src="resources/js/All_Product.js"></sript>
<%@include file="footer.jsp" %>
