<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="linking.jsp" />
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp" />

<div class="container">
	<div class="row-fluid">
      
      	<div class="span12">
    		<h2>${msg}</h2>
    		<address>
    			<strong>MyEcom</strong><br>
    			J-8 RDC,Raj Nagar<br>
    			Ghaziabad<br>
    			Uttar Pardesh<br>
    			
    			<abbr title="Phone">P:</abbr> 01234 567 890
    		</address>
    	</div>
    </div>
</div>

<jsp:include page="footer.jsp" />

</body>
</html>

