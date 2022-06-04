<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%@page import="dao.Negocio" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Productos</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css" integrity="sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V" crossorigin="anonymous"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
            <div class="col-lg-9 sidebar">
            <nav class="menu-sidebar">
                <ul>
                <li><a href="#"><i class="fa fa-layer-group"></i> Escritorio</a></li>
                <li><a href="<%=request.getContextPath()%>/pagProductos.jsp"><i class="fa fa-pen-to-square"></i> Almacen</a></li>
                <li><a href="<%=request.getContextPath()%>/pagEmpleados.jsp"><i class="fa fa-users"></i> Empleados</a></li>
                <li><a href="#"><i class="fa fa-location-dot"></i> Localización</a></li>
                <li><a href="#"><i class="fa fa-cart-flatbed"></i> Orden</a></li>
                <li><a href="#" class="nav-item-bottom" id="logoutbtn" onclick="logoutcomfirm()"><i class="fa fa-xmark"></i> Cerrar Sesión</a></li>
                </ul>
            </nav>
            <div class="close-menu"><i class="fa fa-caret-left"></i></div>    
            </div>  
    </body>
</html>
