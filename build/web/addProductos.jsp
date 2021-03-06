<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%@page import="dao.DaoMarcas" %>
<%@page import="dao.DaoCategorias" %>
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
        <script>
            $( document ).ready(function() {
                var now = new Date();
                var day = ("0" + now.getDate()).slice(-2);
                var month = ("0" + (now.getMonth() + 1)).slice(-2);
                var today = now.getFullYear()+"-"+(month)+"-"+(day) ;
                $("#datepicker").val(today);
            });
        </script>
        <%
            /*Negocio obj=new Negocio();*/
        %>
        <%@include file="include/cabecera.jsp" %>
        <div id="body" class="sidebar-initial row">
            <%@include file="include/menu.jsp" %>
            <div class="col-lg-3 row-content">
                <div class="content-box">
                    <div class="back">
                        <button type="submit" class="btn btn-primary backing" onclick="location.href='pagProductos.jsp'"><i class="fa fa-arrow-left"></i> Regresar</button>
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
                                        <input class="form-check-input" type="radio" name="pro" value="N" checked> Nacional
                                        <input class="form-check-input" type="radio" name="pro" value="P"> Extranjero
                                        </div>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="form-group">
                                        <label class="control-label">Fecha:</label>
                                        <input class="form-control" id="datepicker" type="date" name="date_prod">
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="form-group">
                                        <label class="control-label">Categorias:</label>
                                        <select class="form-control" name="cbe">
                                            <option selected="selected">Elegir</option>
                                            <%
                                                DaoCategorias cat=new DaoCategorias();
                                                for(Categorias x:cat.lisCategoria()){
                                                out.print("<option value="+x.getCodCat()+" selected>"+x.getNomCat());
                                                }
                                            %>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="form-group">
                                        <label class="control-label">Marcas:</label>
                                        <select class="form-control" name="cbe">
                                            <option selected="selected">Elegir</option>
                                            <%
                                                DaoMarcas mar=new DaoMarcas();
                                                for(Marcas x:mar.lisMarca()){
                                                out.print("<option value="+x.getCodMar()+" selected>"+x.getNomMar());
                                                }
                                            %>                                          
                                        </select>
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
