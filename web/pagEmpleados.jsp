<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%@page import="dao.DaoEmpleados" %>
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
                        <button type="submit" class="btn btn-primary backing upload" onclick="location.href='addEmpleados.jsp'"><i class="fa fa-file-arrow-up"></i> Añadir Empleado</button>
                    </div>
                    <div class="searchform-fields">
                        <input id="txtnom" name="txtnom" placeholder="Busque empleado...">
                        <span class="button-wrap">
                            <i class="fas fa-search"></i>
			</span>
                    </div>
                <div id="tablaress" class="container">
                    <table class="table table-fixed empleado">
                        <thead>
                            <tr>
                                <th class="col-lg-2">Codigo</th>
                                <th class="col-lg-2">Nombre</th> 
                                <th class="col-lg-2">Apellido Paterno</th> 
                                <th class="col-lg-2">Apellido Materno</th>
                                <th class="col-lg-2">DNI</th> 
                                <th class="col-lg-2">Telefono</th> 
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
        $.get("controlEmp", consulta, (response) => {
            var misDatos = JSON.parse(response);
            var template = "";

            misDatos.forEach(midato => {
                template += "<tr>";
                template += "<td>" + midato.codEmp + "</td>";
                template += "<td>" + midato.nomEmp + "</td>";
                template += "<td>" + midato.appEmp + "</td>";
                template += "<td>" + midato.apmEmp + "</td>";
                template += "<td>" + midato.dniEmp + "</td>";
                template += "<td>" + midato.telfEmp + "</td>";
                template += "<td><a href='controlEmp?opc=2&cod=" + midato.codEmp + "'></a> | <a href='controlEmp?opc=3&cod=" + midato.codEmp + "'></a>";
                template += "</tr>";
            });
            template += `</tbody></table>`;

            $("#tablares").html(template);
            });
        }
    </script>
</html>
