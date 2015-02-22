<%@page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, height=device-height,initial-scale=1.0, user-scalable=no">
         <meta name="apple-mobile-web-app-capable" content="yes">
        <link href="bootflat/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <script src="bootflat/js/jquery-1.10.1.min.js"></script>
        <style type="text/css"></style>
        <script src="bootflat/js/bootstrap.min.js"></script>
        <script src="js/home.js"></script>
        <!--<script src="../js/main_js.js"></script>-->
		<title>FindMyBeer</title>
</head>
	<body>

    <div class="entete" class="case">
        <div class="comment">
        	<img src="img/info.png" alt="info">
        </div>
        <div class="menu" id="afficher_menu">
        	<img class="btn_menu" src="img/menu.png" alt="menu">
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
				 <a class="case" href="index.html">
                	<img src="img/cuvee_des_trolls.jpg" alt="cuvee" class="img-circle biere">
                	<span class="titre">${biere.nomBiere}</span>
                	<span class="infos">${biere.degresBiere}°</span>

                	<img class="fleche" src="img/fleche.png" alt="fleche">
            </a>			   			
				
			 </c:forEach>
          
    </div>
	</body>
</html>
