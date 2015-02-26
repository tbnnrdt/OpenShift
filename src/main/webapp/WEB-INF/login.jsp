<!doctype html>
<html class="noselect">
	<head>
		<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, height=device-height,initial-scale=1.0, user-scalable=no">
         
         <meta name="apple-mobile-web-app-capable" content="yes">
         <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
        <!--<link href="bootflat/css/bootstrap.min.css" rel="stylesheet">-->
		<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link rel="apple-touch-icon" href="../img/fmb.png" />
        <!--<link rel="apple-touch-startup-image" media="(device-width: 320px) and (-webkit-device-pixel-ratio: 2)"href="../img/mila.jpg">-->
        <link rel="apple-touch-startup-image" href="../img/start.png">
       <script src="bootstrap/js/jquery-1.11.1.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
		<!--<script src="../bootflat/js/jquery-1.10.1.min.js"></script> -->
        <style type="text/css">
        
    .form-signin input[type="text"] {
        /*margin-bottom: 5px;*/
        border-bottom-left-radius: 0;
        border-bottom-right-radius: 0;
    }
    .form-signin input[type="password"] {
        /*margin-bottom: 10px;*/
        border-top-left-radius: 0;
        border-top-right-radius: 0;
    }
    .form-signin .form-control {
        position: relative;
        font-size: 16px;
        font-family: 'Open Sans', Arial, Helvetica, sans-serif;
        height: auto;
        padding: 10px;
        -webkit-box-sizing: border-box;
        -moz-box-sizing: border-box;
        box-sizing: border-box;
    }
    .img-responsive-engrenage {
    display: block;
    max-width: 100%;
    height: auto;
    margin: auto;
    }
    .panel {
    margin-bottom: 20px;
    background-color: rgba(255, 255, 255, 0.75);
    border: 1px solid transparent;
    border-radius: 4px;
    -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
    box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
    }
        </style>
        <!--<script src="../bootflat/js/bootstrap.min.js"></script>-->
        <script src="../js/home.js"></script>
        <!--<script src="../js/main_js.js"></script>-->
		<title>FindMyBeer</title>
</head>

<body>
<div class="container">
                <div class="row vertical-offset-100">
                    <div class="col-xs-10 col-xs-offset-1 col-md-4 col-md-offset-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">                                
                                <div class="row-fluid user-row">
                                <img src="img/logo.png" class="img-responsive" alt="Conxole Admin"/>
                                    <img src="img/log_engrenage.png" class="img-responsive-engrenage" alt="Conxole Admin"/>
                                </div>
                            </div>
                            <div class="panel-body">
                                <form accept-charset="UTF-8" role="form" method="post" action="user" class="form-signin">
                                    <fieldset>
                                        <label class="panel-login">
                                            <div class="login_result"></div>
                                        </label>
                                        <div class="input-group">
      										<div class="input-group-addon"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></div>
      											<input type="text" class="form-control" id="login" placeholder="Login">
    									</div>
                                        <div class="input-group">
      										<div class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true"></span></div>
      											<input type="password" class="form-control" id="passwd" placeholder="Password">
    									</div>
                                        <br></br>
                                        <input class="btn btn-lg btn-success login" type="submit" id="login" value="Login">
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
</body>
</html>
