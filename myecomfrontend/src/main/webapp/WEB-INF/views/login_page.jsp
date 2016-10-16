<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />



	<div class="container">
<div class="row"><!-- row Start -->

<div class="col-lg-3">
<!-- empty column for space from right -->
</div>
<div class="col-lg-6"><!-- col Start -->
    <article role="login">
                <h3 class="text-center"><i class="fa fa-lock"></i>NEW USER</h3>
                <form class="signup" action="index.html" method="post">
                
                      <div class="form-group">
                    <input type="email" class="form-control" placeholder="Email Address" required="required">
                  </div>
                  
                  <div class="form-group">
                    <input type="password" class="form-control" placeholder="Password" required="required">
                  </div>
                  
                  <div class="form-group">
                    <div class="checkbox">
                      <label>
                        <input type="checkbox"> Please accept the terms and conditions to proceed with your request.
                      </label>
                    </div>
                  </div>
                  <div class="form-group">
                    <input type="submit" class="btn btn-success btn-block"  value="LOGIN">
                  </div>
                
                </form>

                <footer role="signup" class="text-center">
                  <ul>
                    <li>
                      <a href="<c:url value="/signup"/>">New User ?</a>
                    </li>
                    <li>
                      <a href="#">Forget Password ?</a>
                    </li>
                  </ul>
                </footer>

              </article>
    </div> <!-- col over -->
    
    <div class="col-lg-3">
<!-- empty column for space from left -->
</div>
    
    </div> <!-- Row over -->
    
	${sno}


		<jsp:include page="footer.jsp" />

	</div>
	<!-- Contain over -->
    