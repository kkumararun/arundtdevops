<%@include file="linking.jsp" %>

<nav class="navbar navbar-default">
  <div class="container-fluid">
   
    <div class="navbar-header">
    
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
              </button>
      <a class="navbar-brand" href="<c:url value="/welcome"/>">mYeCom</a>
    </div>
    
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
    <li><a href="#"><span class="glyphicon glyphicon-home"></span>Home</a></li>
    
      <li class="active"><a href="<c:url value="/aboutUs"/>">About</a></li>
      
     
       <li><a href="#">Page 3</a></li>
         <li><a href="<c:url value="/viewall"/>">View All Products</a></li> 
    </ul>
   
   <ul class="nav navbar-nav navbar-right">
   <li class="dropdown">
                   <a href="" class="dropdown-toggle" data-toggle="dropdown">Login<strong class="caret"></strong></a>
                  <ul class="dropdown-menu">

                    <li>
                      <a href="<c:url value="/signup"/>">New User ?</a>
                    </li>
                    <li class="divider">
                    </li>
                    <li>
                      <a href="<c:url value="/login"/>">Sign In</a>

                    </li>
                  </ul>
                </li>
    </ul>
   
    </div>
    
  </div>
</nav>

