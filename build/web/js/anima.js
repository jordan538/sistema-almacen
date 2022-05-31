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