$(document).ready(function(){
	
	$('#afficher_menu').click(function(){
		
		$('.menu_deroule').toggle('slide');
		})
	$('.demande_log').click(function(){
		
		$('.loggin').toggle('slide');
		$('.demande_log').toggle();
		$('#login').focus();
		})
	
	})