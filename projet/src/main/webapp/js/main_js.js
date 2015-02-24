$(document).ready(function(){
if (navigator.geolocation)
  var watchId = navigator.geolocation.getCurrentPosition(successCallback, null, {enableHighAccuracy:true});
else
  alert("Votre navigateur ne prend pas en compte la géolocalisation HTML5");    
 
function successCallback(position){
   lat = position.coords.latitude;
   longi = position.coords.longitude;
    //$('#start').val(lat+','+longi);
	   
     $('.ok_lat').text(lat);
	 $('.ok_longi').text(longi);
}
});

var directionsDisplay;
var lat = 44.8534100;
var longi = 3.3488000;
var directionsService = new google.maps.DirectionsService();

function calcDistance(lat,longi,val) {
	end = val; 
  	var request = 
	{
    	origin: lat+","+longi,
    	destination: end,
    	travelMode: google.maps.TravelMode.WALKING
  	};
  	directionsService.route(request, function(response, status) 
	{
    	if (status == google.maps.DirectionsStatus.OK) 
		{
      		directionsDisplay.setDirections(response);
      		var total = 0;
      		var myroute = response.routes[0];
      		for (i = 0; i < myroute.legs.length; i++) 
			{
        		total += myroute.legs[i].distance.value;
      		}
	  		if(total>1000)
			{
    			total = total / 1000;
				kil = "kms";
			} else 
			{
				kil = "m";
			}
			$('#info').append('<tr><td>'+val+'/   /</td><td>'+total+' '+kil+'</td></tr>');
      	}
    });
  }

if (navigator.geolocation)
  var watchId = navigator.geolocation.getCurrentPosition(successCallback, null, {enableHighAccuracy:true});
else
  alert("Votre navigateur ne prend pas en compte la géolocalisation HTML5");    
 
function successCallback(position){
   lat = position.coords.latitude;
   longi = position.coords.longitude;
    $('#start').val(lat+','+longi);
	   
     $('.ok').text(lat+','+longi);

  // Déclaration d'un tableau 
	var arr = new Array("13 rue de Toul, 59000 Lille", "4 place du Marechal Leclerc, 59000 Lille", "13 bd du general de Gaulle, 92500 	Rueil-Malmaison"); 
	for (i = 0; i < arr.length; i++)
	{ 
   	calcDistance(lat,longi,arr[i]);
	}
	}


// La fonction 
function computeTotalDistance(result) {
    var total = 0;
    var myroute = result.routes[0];
    for (i = 0; i < myroute.legs.length; i++) {
        total += myroute.legs[i].distance.value;
    }
    total = total / 1000.
    document.getElementById("total").innerHTML = total + " km";
} 
 
function initialize() {
  directionsDisplay = new google.maps.DirectionsRenderer();
  var mapOptions = {
    zoom: 7,
    center: new google.maps.LatLng(lat, longi)
  };
  var map = new google.maps.Map(document.getElementById('map-canvas'),
      mapOptions);
  directionsDisplay.setMap(map);
  directionsDisplay.setPanel(document.getElementById('directions-panel'));

  var control = document.getElementById('control');
  control.style.display = 'block';
  map.controls[google.maps.ControlPosition.TOP_CENTER].push(control);
}

function calcRoute() {
  var start = document.getElementById('start').value;
  var end = document.getElementById('end').value;
  var request = {
    origin: start,
    destination: end,
    travelMode: google.maps.TravelMode.WALKING
  };
  directionsService.route(request, function(response, status) {
    if (status == google.maps.DirectionsStatus.OK) {
      directionsDisplay.setDirections(response);
	  computeTotalDistance(response);
    }
  });
}

//google.maps.event.addDomListener(window, 'load', initialize);
$(document).ready(function(){initialize();})
//});

