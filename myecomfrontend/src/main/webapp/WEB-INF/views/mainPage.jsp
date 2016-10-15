<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="linking.jsp" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<!-- container start -->
		<jsp:include page="header.jsp" />

		<c:if test="${IfClickedOnLogin == true}">

			<%@include file="login_page.jsp"%>
		</c:if>




		<jsp:include page="footer.jsp" />

	</div>
	<!-- Contain over -->



</body>
</html>