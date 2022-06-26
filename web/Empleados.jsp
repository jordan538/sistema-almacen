<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%@page import="dao.DaoEmpleados" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Empleados</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css" integrity="sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V" crossorigin="anonymous"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
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
                        <button type="button" class="btn btn-primary backing upload" name="btn_nuevo" id="btn_nuevo" data-toggle="modal" data-target="#modal_empleado" onclick="limpiar()"><i class="fa fa-file-arrow-up"></i> Añadir Empleado</button>
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
    <!-- Modal Guardar-->        
    <div class="modal fade" id="modal_empleado" role="dialog">
        <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
            <form action="controlEmp" method="post" class="form-group">
               <div class="row">
                    <input type="hidden" name="opc" value="4">             
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Nombre:</label>
                            <input class="form-control" type="text" name="nom_emp" placeholder="Ingrese nombre">
                        </div>
                    </div> 
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Apellido Paterno:</label>
                            <input class="form-control" type="text" name="pat_emp" placeholder="Ingrese apellido paterno">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Apellido Materno:</label>
                            <input class="form-control" type="text" name="mat_emp" placeholder="Ingrese apellido materno">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Telefono:</label>
                            <input class="form-control" type="number" name="tel_emp" placeholder="Ingrese telefono">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">DNI:</label>
                            <input class="form-control" type="number" name="dni_emp" placeholder="Ingrese DNI">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Codigo de area:</label>
                            <input class="form-control" type="number" name="cod_area" placeholder="Ingrese codigo de area">
                        </div>
                    </div>   
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary save" ><i class="fa fa-floppy-disk"></i> Guardar</button>
                        <button type="button" class="btn btn-warning btn-lg" data-dismiss="modal">Cerrar</button>
                    </div> 
                </div>
            </form>
        
            </div>
        </div>
        </div>     
    </div>
    <!-- Modal Editar-->    
    <div class="modal fade" id="editar_empleado" role="dialog"><!-- id llamara el evento del modal-->
        <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
            <form id="frm_guardar" method="post" class="form-group">
                <input id="empleadoId" type="hidden">

                <div class="row">         
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Nombre:</label>
                            <input id="nombre" class="form-control" type="text" name="nom_emp">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Apellido Paterno:</label>
                            <input id="paterno" class="form-control" type="text" name="pat_emp">
                        </div>
                    </div> 
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Apellido Materno:</label>
                            <input id="materno" class="form-control" type="text" name="mat_emp">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Telefono:</label>
                            <input id="tel" class="form-control" type="number" name="tel_emp">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">DNI:</label>
                            <input id="dni" class="form-control" type="number" name="dni_emp">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Codigo de area:</label>
                            <input id="area" class="form-control" type="number" name="cod_area">
                        </div>
                    </div>    
                    <div class="form-group">
                        <button id="guardar" type="submit" class="btn btn-primary save" ><i class="fa fa-floppy-disk"></i> Guardar</button>
                        <button type="button" class="btn btn-warning btn-lg" data-dismiss="modal">Cerrar</button>
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
                template += '<td><a onclick=editarEmpleado("' + midato.codEmp + '")></a> | <a href="controlEmp?opc=3&cod=' + midato.codEmp + '"></a>'; 
                template += "</tr>";
            });
            template += `</tbody></table>`;

            $("#tablares").html(template);
            });
        }
        //AJAX LLAMAMOS EL MODAL PARA MOSTRAR LA CONSULTA DEL EDITAR DEL PRODUCTO CUANDO SE HAGA CLICK AL ICONO
            const modalEditar = new bootstrap.Modal(document.getElementById('editar_empleado'), {
                keyboard: false
            });
            
            //CONSULTA DEVOLVEMOS LOS PARAMETROS DE LOS ID DE LA TABLA PARA QUE DEVUELVA LA CONSULTA 
            function llenarModal(response) {
                let id = $('#empleadoId');
                let nom = $('#nombre');
                let paterno = $('#paterno');
                let materno = $('#materno');
                let tel = $('#tel');
                let dni = $('#dni');
                let area = $('#area');
                //recibe los datos de la sentencia
                id.val(response.codEmp);//codEmp pone el nombre de la fila de la tabla de la bd
                nom.val(response.nomEmp);
                paterno.val(response.appEmp);
                materno.val(response.apmEmp);
                tel.val(response.telfEmp);
                dni.val(response.dniEmp);
                area.val(response.codArea);              ;             
            }
            //LLAMAMOS EL SERVLET PARA LA CONSULTA Y LLENAR EL MODAL CON LOS DATOS DEL PROUCTO
            function editarEmpleado(empleado) {
                $.get("controlEmp", {
                    opc: 2,
                    cod: empleado
                }).done(function(res) {
                    let response = JSON.parse(res);
                    llenarModal(response);
                    modalEditar.toggle();
                });
            };
            
            //LA OTRA CONSULTA ES PARA GUARDAR EL MODAL 
            $('#frm_guardar').submit(function(e) {
                e.preventDefault(); 
                let id = $('#empleadoId').val();
                let nom = $('#nombre').val();
                let paterno = $('#paterno').val();
                let materno = $('#materno').val();
                let tel = $('#tel').val();
                let dni = $('#dni').val();
                let area = $('#area').val();
                //LLAMAMOS LA CONSULTA DEL SERLET PARA GUARDAR LOS DATOS EN LA DB
                $.post("controlEmp?opc=5", {
                    cod_emp: id,
                    nom_emp: nom,
                    pat_emp: paterno,
                    mat_emp: materno,
                    dni_emp: dni,
                    tel_emp: tel,
                    cod_area: area
                }).done(function() {
                    window.location.href='Empleados.jsp';
                });
            });     
    </script>
</html>
