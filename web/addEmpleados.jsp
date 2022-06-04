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
        <script src="js/animaciones.js"></script> 
    </head>
    <body>
        <%
            /*List<Productos> lista=(ArrayList)request.getAttribute("id");
            String vianro=(String)request.getAttribute("vianro");*/
        %>
        <%@include file="include/cabecera.jsp" %>
        <div id="body" class="sidebar-initial row">
            <%@include file="include/menu.jsp" %>
            <div class="col-lg-3 row-content">
                <div class="content-box">
                    <div class="back">
                        <button type="submit" class="btn btn-primary backing" onclick="location.href='pagEmpleados.jsp'"><i class="fa fa-arrow-left"></i> Regresar</button>
                    </div>
                <div id="tablaress" class="container datos">
                    <div class="container-datos">
                        <form action="controlEmp"> 
                            <div class="row">
                                <input type="hidden" name="opc" value="4">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label">Codigo:</label>
                                        <input class="form-control" type="text" name="cod_prod" value="" disabled>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label">Nombre:</label>
                                        <input class="form-control" type="text" name="nomemp" placeholder="Ingrese nombre">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label">Apellido Paterno:</label>
                                        <input class="form-control" type="text" name="appemp" placeholder="Ingrese apellido paterno">
                                    </div>
                                </div> 
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label">Apellido Materno:</label>
                                        <input class="form-control" type="text" name="apmemp" placeholder="Ingrese apellido materno">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label">DNI:</label>
                                        <input class="form-control" type="number" name="dniemp" placeholder="Ingrese DNI">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label">Telefono:</label>
                                        <input class="form-control" type="number" name="telfemp" placeholder="Ingrese telefono">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label">Codigo de area:</label>
                                        <input class="form-control" type="number" name="codarea" placeholder="Ingrese codigo de area">
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
</html>
