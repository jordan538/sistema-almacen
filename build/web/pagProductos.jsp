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
        <script src="js/animaciones.js"></script> 
    </head>
    <body>
        <%@include file="include/cabecera.jsp" %>
        <div id="body" class="sidebar-initial row">
            <%@include file="include/menu.jsp" %>
            <div class="col-lg-3 row-content">
                <div class="content-box">
                    <div class="back">
                        <button type="submit" class="btn btn-primary backing upload" onclick="location.href='addProductos.jsp'"><i class="fa fa-file-arrow-up"></i> Añadir Producto</button>
                    </div>
                    <div class="searchform-fields">
                        <input id="txtnom" name="txtnom" placeholder="Busque producto...">
                        <span class="button-wrap">
                            <i class="fas fa-search"></i>
			</span>
                    </div>
                <div id="tablaress" class="container">
                    <table class="table table-fixed producto">
                        <thead>
                            <tr>
                                <th class="col-lg-2">Codigo</th>
                                <th class="col-lg-2">Producto</th> 
                                <th class="col-lg-2">Stock</th> 
                                <th class="col-lg-2">Unidad</th> 
                                <th class="col-lg-2">Fecha</th> 
                                <th class="col-lg-2">Opciones</th> 
                            </tr>        
                        </thead>   
                            <tbody id="tablares"></tbody>
                    </table>                                                          
                </div> 
                </div>    
            </div>
        </div>
    </body>
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script>
        $(document).ready(function () {
            listado("");
            $(document).on('keyup', '#txtnom', function () {
            var valor = $(this).val();
            listado(valor);
            });
        });

        function listado(valor) {

        var consulta = "opc=1&termino=" + valor;
        $.get("control", consulta, (response) => {
            var misDatos = JSON.parse(response);
            var template = "";

            misDatos.forEach(midato => {
                template += "<tr>";
                template += "<td>" + midato.codProd + "</td>";
                template += "<td>" + midato.desProd + "</td>";
                template += "<td>" + midato.stockProd + "</td>";
                template += "<td>" + midato.umProd + "</td>";
                template += "<td>" + midato.fecProd + "</td>";
                template += "<td><a href='control?opc=2&cod=" + midato.codProd + "'></a> | <a href='control?opc=3&cod=" + midato.codProd + "'></a>";
                template += "</tr>";
            });
            template += `</tbody></table>`;

            $("#tablares").html(template);
            });
        }
    </script>
</html>
