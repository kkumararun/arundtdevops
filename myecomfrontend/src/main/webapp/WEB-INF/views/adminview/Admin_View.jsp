
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />

<style>

</style>

<jsp:include page="../header.jsp" />


<div class="container-fluid">
<div class="row">
<div class="col-sm-2">
</div>
<div class="col-sm-8">
<form:form method="POST" action="${cp}/admin/insert" modelAttribute="pid">
	<table>
  	<c:if test="${!empty pid}">
	<tr>
 	<td>
			<form:label path="productId">
				<spring:message text="Product Id"/>
			</form:label>
		</td>
 		<td>
			<form:input path="productId" readonly="true"  disabled="true" />
			<form:hidden path="productId" /> <span class="glyphicon glyphicon-lock "></span>
		</td> 
	</tr>
	</c:if>
  
  
  	<tr>
  	
			<td><form:label path="productName">Product Name</form:label></td>
			<td><form:input path="productName" /></td>
		</tr>
		<tr>
			<td><form:label path="productBrand">Product Brand</form:label></td>
			<td><form:input path="productBrand" /></td>
		</tr>

		<tr>
			<td><form:label path="productCategory">Product Category</form:label></td>
			<td><form:input path="productCategory" /></td>
		</tr>
		<tr>
		<td>
		<br>
		<c:if test="${!empty pid.productName}">
			<input type="submit" value="<spring:message text="Edit Product"/>" />
		</c:if>	
		</td>
		<td>
		<br>
		<c:if test="${empty pid.productName}">
			<input type="submit" value="<spring:message text="Insert Product"/>" />
		</c:if>	
		</td>
		
		</tr>
	</table>
</form:form>
</div> <!-- col end -->

<div class="col-sm-2">
</div><!-- col end -->

</div><!-- row end -->


<div class="row">
<div class="col-sm-2">
</div>
<div class="col-sm-8 ">
<div class="table-responsive">
<table class="table table-hover table-condensed cf table2">
    <thead class="cf">
      <tr>
        <th>ProductID</th>
        <th>Product Name</th>
        <th>Product Brand</th>
        <th>Product Category</th>
        <th>Edit Product</th>
<th>Delete Product</th>
      </tr>
    </thead>
    <tbody>
<c:forEach items="${productData}" var="data">

		<tr>
			<td class="active">${data.productId}</td>
			<td align="left">${data.productName}</td>
			<td>${data.productBrand}</td>
			<td>${data.productCategory}</td>
			<td><a href="<c:url value='/admin/edit/${data.productId}' />" >edit</a></td>
			<td><a href="<c:url value='/admin/remove/${data.productId}'/>"> <span class="glyphicon glyphicon-trash btn btn-danger"></span></a></td>
			
		</tr>
</c:forEach>
</tbody>
	</table>

</div>
</div>
<div class="col-sm-2">
</div>
</div>
</div>

<jsp:include page="../footer.jsp" />