<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%-- <c:set var="contextPath" value="${pageContext.request.contextPath}"/> --%>


<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="<c:url value="/welcome"/>">mYeCom</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="<c:url value="/aboutUs"/>">AboutUs</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li> 
      <li><a href="#">Page 3</a></li> 
    </ul>
  </div>
</nav>

