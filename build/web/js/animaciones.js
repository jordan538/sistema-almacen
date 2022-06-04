/*MENU-SCROLL*/
$( document ).ready(function() {
    $('.btn').click(function(){
    $(this).toggleClass("click");
    $('.sidebar').toggleClass("show");
    });
    $('.feat-btn').click(function(){
    $('nav ul .feat-show').toggleClass("show");
    $('nav ul .first').toggleClass("rotate");
    });
    $('.serv-btn').click(function(){
    $('nav ul .serv-show').toggleClass("show1");
    $('nav ul .second').toggleClass("rotate");
    });
    /*$('nav ul li').click(function(){
    $(this).addClass("active").siblings().removeClass("active");
    });*/
});
/*FECHA ACTUAL*/
$( document ).ready(function() {
    var now = new Date();
    var day = ("0" + now.getDate()).slice(-2);
    var month = ("0" + (now.getMonth() + 1)).slice(-2);
    var today = now.getFullYear()+"-"+(month)+"-"+(day) ;
    $("#datepicker").val(today);
}); 
/*URL-PAGINA*/
$(document).ready(function () {
    $('a[href="' + this.location.pathname + '"]').parent().addClass('active');
});