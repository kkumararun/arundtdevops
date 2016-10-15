<html>
<head>


<jsp:include page="linking.jsp" />
</head>
<body>

<jsp:include page="header.jsp" />

<div class="container-fluid">
<div class ="row">
<div class="col-lg-12">


				<div class="carousel slide" id="carousel-729274">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0" data-ride="carousel" data-target="#carousel-729274">
						</li>
						<li data-slide-to="1" data-target="#carousel-729274">
						</li>
						<li data-slide-to="2" data-target="#carousel-729274">
						</li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img style="height:500px;" alt="Carousel Bootstrap First" src="resources/images/c1.jpg" />
							<div class="carousel-caption">

							</div>
						</div>
						<div class="item">
							<img style="height:500px;"  alt="Carousel Bootstrap Second" src="resources/images/c1.jpg" />
							<div class="carousel-caption">
							</div>
						</div>
						<div class="item">
							<img style="height:500px;" alt="Carousel Bootstrap Third" src="resources/images/c1.jpg" />
							<div class="carousel-caption">

							</div>
						</div>
					</div>
            <a class="left carousel-control" data-target="#carousel-729274"  data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
         <a class="right carousel-control" data-target="#carousel-729274"  data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>

</div>
<br><br>
<div class="row">
<div class="col-sm-3">
<div class="card">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-block">
    <h4 class="card-title">Card title</h4>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</div>

<div class="col-sm-3">
<div class="card">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-block">
    <h4 class="card-title">Card title</h4>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</div>


<div class="col-sm-3">
<div class="card">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-block">
    <h4 class="card-title">Card title</h4>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</div>	

<div class="col-sm-3">
<div class="card">
  <img class="card-img-top" src="..." alt="Card image cap">
  <div class="card-block">
    <h4 class="card-title">Card title</h4>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</div>
</div>


</div>




<h2>${msg}</h2>

<jsp:include page="footer.jsp" />

</body>
</html>
