<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- <%@include file="linking.jsp" %>  --%>
<c:set var="imgs" value="/resources/images" />
<c:set var="bimg" value="/resources/images/productimages" />
<%@include file="header.jsp"%>






<div class="container-fluid">
<div ng-app="ngAppProduct" ng-controller="allProduct" >

<input type="hidden" class="form-control" placeholder="Search Product" ng-init="searchBox ='${sno}'" ng-model="search">

<div class="row" ng-repeat="product in allProductData | orderBy:mydata | filter:searchBox">
<div class="col-sm-2">
</div>

<div class="col-sm-4">
<img alt="" src="<c:url value="${bimg}/item1.jpg"/>"/>
</div>

<div class="col-sm-4">
<br>{{product.sno}}
						{{product.productName}}<br>
						{{product.productBrand}}<br>
						{{product.productCategory}}<br>
						{{product.productSupplier}}

</div>
<div class="col-sm-2">
</div>
</div>
</div>
</div>
<%-- 
			<table class="table table-bordered table-hover table-condensed cf table2">
				
				<tbody>
					<tr ng-repeat="product in allProductData | orderBy:mydata | filter:searchBox">
						<td>{{product.sno}}</td>
						<td>{{product.productName}}</td>
						<td>{{product.productBrand}}</td>
						<td>{{product.productCategory}} </td>
						<td>{{product.productSupplier}}</td>

						<td> <a href="<c:url value="/viewbyproduct/{{product.sno}}"/>">View</a></td>
					</tr>
				</tbody>
			</table>

 --%>		
				





<sript src="resources/js/All_Product.js"></sript>
<%@include file="footer.jsp"%>
