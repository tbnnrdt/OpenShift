<%@page pageEncoding="UTF-8" %>

<!doctype html>
<html class="noselect">
	<head>
		<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, height=device-height,initial-scale=1.0, user-scalable=no">
         
         <meta name="apple-mobile-web-app-capable" content="yes">
         <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
        <!--<link href="../bootflat/css/bootstrap.min.css" rel="stylesheet">-->
		<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link rel="apple-touch-icon" href="../img/fmb.png" />
        <link rel="apple-touch-startup-image" media="(device-width: 320px) and (-webkit-device-pixel-ratio: 2)"href="img/mila.jpg">
       <script src="bootflat/js/jquery-1.10.1.min.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
		<!--<script src="bootflat/js/jquery-1.10.1.min.js"></script> -->
        <!--<script src="bootflat/js/bootstrap.min.js"></script>-->
        <script src="js/home.js"></script>
        <!--<script src="../js/main_js.js"></script>-->
		<title>FindMyBeer</title>
</head>

<body>
<div class="container">
                <div class="row vertical-offset-100">
                    <div class="col-xs-10 col-xs-offset-1">
                        <div class="panel panel-default">
                            <div class="panel-heading">                                
                                <div class="row-fluid user-row">
                                <img src="img/logo.png" class="img-responsive" alt="Conxole Admin"/>
                                </div>
                            </div>
                            <div class="panel-body">
                            <article>
                            <h5>Bienvenue Thomas</h5>
                            <h3><small>La Faluche (Lille)</small></h3>
                            <p>Vous pouvez choisir parmis l'un des 4 sous menus afin d'optimiser l'atractivité de votre bar</p>
                            </article>
                               <a href='bieres_gerant'class="btn btn-default btn-lg" type="button">Bières proposées</a>
                               <a class="btn btn-default btn-lg">Info Bar</a> 
                               <a class="btn btn-default btn-lg">Satisfaction Client</a> 
                               <a class="btn btn-default btn-lg">Bières Favorites</a>
                               
                               	<div class="rating rating2">
                                <input type="hidden" value="" name="input_star" id="input_star">
                                    <span class="star" id="star_5" title="Give 5 stars">★</span>
                                    <span class="star" id="star_4" title="Give 4 stars">★</span>
                                    <span class="star" id="star_3" title="Give 3 stars">★</span>
                                    <span class="star" id="star_2" title="Give 2 stars">★</span>
                                    <span class="star" id="star_1" title="Give 1 star">★</span>
								</div>
                                
    
                               <a class="btn btn-danger" href='login'> Deconnexion</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
</body>
</html>
