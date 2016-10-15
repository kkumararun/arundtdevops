




<%@include file="linking.jsp" %>

<%@include file="header.jsp" %>



<div ng-app="ngAppProduct">
	<div ng-controller="allProduct">


		<div class="container">
		
		<div class="form-group">
      <div class="input-group">
 <div class="input-group-addon"><i class="fa fa-search"></i></div>

    		<input type="text" class="form-control" placeholder="Search Product" ng-init="searchBox ='${cat}'">
</div>
</div>

			<table class="table table-bordered table-hover table-condensed cf table2">
				<thead>
					<tr>
						<th >Sr. Number</th>
						<th >Product <span class="fa fa-caret-down" ng-click="myDataSort('name')"></span><span  class="fa fa-caret-up"></span></th>
						<th>Brand</th>
						<th>
						Category 
						 
						<span class="fa fa-caret-down"></span>
        <span  class="fa fa-caret-up"></span>
						</th>
						<th>Supplier</th>
						<th>Action</th>

					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="product in allProductData| orderBy:mydata | filter:searchBox">
						<td>{{product.sno}}</td>
						<td>{{product.name}}</td>
						<td>{{product.brand}}</td>
						<td>{{product.category}} </td>
						<td>{{product.supplier}}</td>

						<td><button ng-click="" class="glyphicon glyphicon-trash btn btn-danger"></button></td>
					</tr>
				</tbody>
			</table>
${cat}
		</div>
		
	</div>

</div>


<%@include file="footer.jsp" %>
