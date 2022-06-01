<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%@page import="dao.Negocio" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Productos</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css" integrity="sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V" crossorigin="anonymous"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <script src="js/filtro-productos.js"></script>
        <script src="js/anima.js"></script> 
    </head>
    <body>
        <%
            /*List<Productos> lista=(ArrayList)request.getAttribute("id");
            String vianro=(String)request.getAttribute("vianro");*/
        %>
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
                        <i class="fa fa-bars"></i>
                        </button>
                    </li> 
                </ul>
            </div>
        </nav>
        </header>
        <div id="body" class="sidebar-initial row">
            <div class="left-sidebar sidebar-animated col-lg-9">
            <nav class="sidebar">
                <ul>
                <li><a href="#" class=""><i class="fa fa-layer-group"></i> Escritorio</a></li>
                <li><a href="#" class=""><i class="fa fa-pen-to-square"></i> Almacen</a></li>
                <li><a href="#" class=""><i class="fa fa-users"></i> Empleados</a></li>
                <li><a href="#" class=""><i class="fa fa-location-dot"></i> Localización</a></li>
                <li><a href="#" class=""><i class="fa fa-cart-flatbed"></i> Orden</a></li>
                <li><a href="#" class="nav-item-bottom" id="logoutbtn" onclick="logoutcomfirm()"><i class="fa fa-xmark"></i> Cerrar Sesión</a></li>
                </ul>
            </nav>
            </div>
            <div class="col-lg-3 row-content">
                <div class="content-box">
                    <div class="back">
                        <button type="submit" class="btn btn-primary backing" ><i class="fa fa-arrow-left"></i> Regresar</button>
                    </div>
                    <div class="searchform-fields">
                        <input id="txtnom" name="busca" placeholder="Buscador....">
                        <span class="button-wrap">
                            <i class="fas fa-search"></i>
			</span>
                    </div>
                <div id="tablaress" class="container datos">
                    <div class="container-datos">
                        <form action="control"> 
                            <div class="row">
                                <input type="hidden" name="opc" value="4">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label">Codigo:</label>
                                        <input class="form-control" type="text" name="cod_prod" value="" disabled>
                                    </div>
                                </div>
                                <div class="col-md-9">
                                    <div class="form-group">
                                        <label class="control-label">Descripcion:</label>
                                        <input class="form-control" type="text" name="nom_prod" placeholder="Ingrese nombre">
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="form-group">
                                        <label class="control-label">Stock:</label>
                                        <input class="form-control" type="number" name="stock_prod" min="1" max="9999" placeholder="Ingrese stock">
                                    </div>
                                </div> 
                                <div class="col-6">
                                    <div class="form-group">
                                        <label class="control-label">Unidad:</label>
                                        <div class="form-group">
                                        <input class="form-check-input" type="radio" name="pro" value="N" checked> Modelo A
                                        <input class="form-check-input" type="radio" name="pro" value="P"> Modelo B
                                        </div>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="form-group">
                                        <label class="control-label">Fecha:</label>
                                        <input class="form-control" type="date" name="date_prod" value="2018-07-22" min="2018-01-01" max="2018-12-31">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary save" ><i class="fa fa-floppy-disk"></i> Guardar</button>
                                </div>   
                            </div>
                        </form>                 
                    </div>
                </div> 
            </div>    
        </div>
    </body>
    <script>
    $(document).ready(function () {
        listado("");
        $(document).on('keyup', '#txtnom', function () {
            var valor = $(this).val();
            listado(valor);
        });
    });

    function listado(valor) {

        var consulta = "op=1&termino=" + valor;
        $.get("control", consulta, (response) => {
            var misDatos = JSON.parse(response);
            var template = "";

            misDatos.forEach(midato => {
                template += "<tr>";
                template += "<td> " + midato.coda + "</td>  ";
                template += "<td>" + midato.noma + "</td>  ";
                template += "<td>" + midato.ape + "</td> ";
                template += "</tr>";
            });
            template += `</tbody></table>`;

            $("#tablares").html(template);
        });
    }
    </script>
</html>
