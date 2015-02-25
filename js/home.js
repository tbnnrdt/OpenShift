		$(document).ready(function(){
	
	$('#afficher_menu').click(function(){
		
		$('.menu_deroule').toggle('slide');
		$('.transBG').toggle('slide');
		$('.bodytest').animate(
            {"left": "300px"},
            "fast");
		//$('.bodytest').css({"position":"relative","left":"300px"});
		
		})
	$('.transBG').click(function(){
		$('.menu_deroule').toggle('slide');
		$('.transBG').hide();
		$('.bodytest').animate(
            {"left": "0px"},
            "fast");
		})
	$('.demande_log').click(function(){
		
		$('.loggin').toggle('slide');
		$('.demande_log').toggle();
		$('#login').focus();
		})
	
	$('select').change(function() {
	var biere = $('#biere option:selected').val();
	if(biere=='autre'){
		$('.ajout_nouvelle_biere').toggle();
		$('#ajouter_biere').toggle();
		$('#ajouter_nouvelle_biere').toggle();} 
		else{
		$('.ajout_nouvelle_biere').hide();
		$('#ajouter_biere').show();
		$('#ajouter_nouvelle_biere').hide();
			}
	})
	$('#clear_input').click(function(){$('#string').val('');$("tr").removeClass("success");});
	$('.modif_biere').click(
	function(eventObject){
		var biere = $(this).parent().parent().children('td').eq(1).text();
		var degre = $(this).parent().parent().children('td').eq(3).text();
		var prix = $(this).parent().parent().children('td').eq(4).text();
		$('#Label_Modal_Modif').text('Modification : '+biere+' ('+degre+')');
		$('#ancien_prix').text(" "+prix);
		
		}
	)
	
	$('.star').click( function(){
		$('.star').removeAttr('style');
	var star = $(this).attr('id');
	star = star.split('_');
	var id = star[1];
	$('#input_star').val(id);
	
	for(var i = 1; i <= id; i++){$('#star_'+i).css('color','orange');}
	})
	
	
	});