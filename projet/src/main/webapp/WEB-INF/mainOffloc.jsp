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
        MODE OFFLOCALISATION <br/>
        Choisir sa ville
        </div>
    </div>
    <form action="biereofflocalisation">
    <select name="ville">
    <c:forEach var="ville" items="${listeVilles}">
    <option value="${ville}">${ville}</option>
    </c:forEach>
    </select>
    <button>Valider</button>
    </form>
	</body>
</html>
