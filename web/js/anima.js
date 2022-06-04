/*MENU-SCROLL*/
$('document').ready(function() {
	if (typeof window.isMinified === "undefined") {
      window.isMinified = false;
    }
	const body = $('#body');
  	$("#sidebar-toggler").on("click", function () {
  		
    	if (window.isMinified === false) {

      		localStorage.setItem('menu-closed', !$(body).hasClass("sidebar-minified"));
      		body.removeClass("sidebar-minified-out").addClass("sidebar-minified");
      		window.isMinified = true;
    	} else {
      		localStorage.setItem('menu-closed', !$(body).hasClass("sidebar-minified"));
      		body.removeClass("sidebar-minified").addClass("sidebar-minified-out");
      		window.isMinified = false;
    	}		
	});
	const state = localStorage.getItem('menu-closed');
	if (state === null) {
		$(body).removeClass('sidebar-minified');
	} else {  
		const closed = state === "true" ? true : false;
		if (!closed) {
			$(body).removeClass('sidebar-minified');
		}
	}
  setTimeout(() => {
    $('aside').addClass('sidebar-animated')    
  },300)
});
/*FECHA ACTUAL*/
$( document ).ready(function() {
    var now = new Date();
    var day = ("0" + now.getDate()).slice(-2);
    var month = ("0" + (now.getMonth() + 1)).slice(-2);
    var today = now.getFullYear()+"-"+(month)+"-"+(day) ;
    $("#datepicker").val(today);
}); 