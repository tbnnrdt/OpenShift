<%@page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
        <link rel="apple-touch-icon" href="img/fmb.png" />
        <link rel="apple-touch-startup-image" media="(device-width: 320px) and (-webkit-device-pixel-ratio: 2)"href="img/mila.jpg">
        <script src="bootflat/js/jquery-1.10.1.min.js"></script>
        <style type="text/css"></style>
        <script src="bootflat/js/bootstrap.min.js"></script>
        <script src="js/home.js"></script>
        <!--<script src="../js/main_js.js"></script>-->
		<title>FindMyBeer</title>
	</head>
	
    	<body>

        <div class="entete" class="case">
            <div class="status_bar"></div>
            <div class="information">
                <a href="info.html"><img src="img/i.png" alt="info"></a>
            </div>
            <div class="menu">
                <img class="btn_menu" id="afficher_menu" src="img/menu.png" alt="menu">
            </div>
            <div class="menu_deroule">
                <ul>
                    <li>Choisir sa Bière</li>
                    <li>Qui sommes nous?</li>
                    <li>Contact</li>
                </ul>
            </div>
            <div class="logo">
                <img src="img/logo.png" alt="erreurs">
            </div>
            <div class="info">
                Choisir sa bière
            </div>
        </div>
        
        
             
        <div class="listview">
            <div class="case">
                <div class="row">
                    <div class="col-xs-6 casse">
                        <span>Latitude</span><br />
                        <span class="ok_lat"><small>Pas d'info</small></span>
                    </div>
                    <div class="col-xs-6 casse">
                        <span>Longitude</span><br />
                        <span class="ok_longi"><small>Pas d'info</small></span>
                    </div>
                </div>
            </div>
            
             <c:forEach var="biere" items="${listeBieres}">
            <a class="case" href="bar?id=${biere.idBiere}">
                <div class="col-xs-12">
                    <div class="row">
                         <div class="col-xs-2">
                            <img src="img/cuvee_des_trolls.jpg" alt="${biere.nomBiere}" class="img-circle biere">
                         </div>
                         <div class="col-xs-8">
                            <div class="info_bdd">
                                <span class="titre">${biere.nomBiere}</span>
                                <span class="degre">${biere.degresBiere}°</span>
                            </div>
                        </div>
                        <div class="col-xs-2">
                            <img class="fleche" src="img/fleche.png" alt="fleche">
                        </div>
                    </div>
                </div> 
             </a>
             </c:forEach>
             
        <!-- Ferme Listeview -->         
        </div>
    
        <footer>
            <div class="col-md-3 col-sm-offset-9 ">
                <a href="login" class="btn btn-default demande_log" type="button"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></a>
            </div>
        </footer>
	</body>
</html>
