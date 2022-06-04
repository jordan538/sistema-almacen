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
        <header>
        <nav>
            <div class="container">
                <ul class="nav-list">
                    <li class="nav-logo">
                        <div class="logo">
                        <i class="fab fa-sass"></i>
                        </div>
                    </li>     
                    <li class="nav-link">Sistema de Almacen - <a>Admin</a>
                    </li>   
                    <li class="nav-link">
                        <button id="sidebar-toggler" class="sidebar-toggle btn">
                        <span class="fas fa-bars"></span>
                        </button>
                    </li> 
                </ul>
            </div>
        </nav>
        </header>      
    </body>
</html>
