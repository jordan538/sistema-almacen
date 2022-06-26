<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%@page import="dao.Negocio" %>
<%@page import="dao.DaoMarcas" %>
<%@page import="dao.DaoCategorias" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Productos</title>
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
                        <button type="button" class="btn btn-primary backing upload" name="btn_nuevo" id="btn_nuevo" data-toggle="modal" data-target="#modal_producto" onclick="limpiar()"><i class="fa fa-file-arrow-up"></i> Añadir Producto</button>
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
    <!-- Modal Guardar-->        
    <div class="modal fade" id="modal_producto" role="dialog">
        <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
            <form action="control" method="post" class="form-group">
               <div class="row">
                    <input type="hidden" name="opc" value="4">             
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Descripcion:</label>
                            <input class="form-control" type="text" name="nom_prod" placeholder="Ingrese nombre">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Stock:</label>
                            <input class="form-control" type="number" name="stock_prod" min="1" max="9999" placeholder="Ingrese stock">
                        </div>
                    </div> 
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Unidad:</label>
                            <div class="form-group">
                                <input class="form-check-input" type="radio" name="pro" value="N" checked> Nacional
                                <input class="form-check-input" type="radio" name="pro" value="P"> Extranjero
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Fecha:</label>
                            <input class="form-control" id="datepicker" type="date" name="date_prod">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Categorias:</label>
                            <select class="form-control" name="cmb_cat">
                                <option selected="selected">Elegir</option>
                                <%
                                    DaoCategorias cat=new DaoCategorias();
                                    for(Categorias x:cat.lisCategoria()){
                                        out.print("<option value="+x.getCodCat()+">"+x.getNomCat());
                                    }
                                %>
                        </select>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Marcas:</label>
                            <select class="form-control" name="cmb_mar">
                                <option selected="selected">Elegir</option>
                                <%
                                    DaoMarcas mar=new DaoMarcas();
                                    for(Marcas x:mar.lisMarca()){
                                    out.print("<option value="+x.getCodMar()+">"+x.getNomMar());
                                    }
                                %>                                          
                            </select>
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
    <div class="modal fade" id="editar_producto" role="dialog"><!-- id llamara el evento del modal-->
        <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
            <form id="frm_guardar" method="post" class="form-group">
                <input id="productoId" type="hidden">

                <div class="row">         
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Descripcion:</label>
                            <input id="desc" class="form-control" type="text" name="nom_prod">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Stock:</label>
                            <input id="stock" class="form-control" type="number" name="stock_prod" min="1" max="9999">
                        </div>
                    </div> 
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Unidad:</label>
                            <div class="form-group">
                                <input id="tipo-a" class="form-check-input" type="radio" name="pro" value="N"> Nacional
                                <input id="tipo-b" class="form-check-input" type="radio" name="pro" value="P"> Extranjero
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Fecha:</label>
                            <input class="form-control" id="dia" type="date" name="date_prod">
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Categorias:</label>
                            <select id="categorias" class="form-control" name="cbe">
                                <option selected="selected">Elegir</option>
                                <%
                                    DaoCategorias cat_edt=new DaoCategorias();
                                    for(Categorias x:cat_edt.lisCategoria()){
                                        out.print("<option value="+x.getCodCat()+">"+x.getNomCat());
                                    } 
                                %>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <label class="control-label">Marcas:</label>
                            <select id="marcas" class="form-control" name="cbe">
                                <option selected="selected">Elegir</option>
                                <%
                                    DaoMarcas mar_edt=new DaoMarcas();
                                    for(Marcas x:mar_edt.lisMarca()){
                                        out.print("<option value="+x.getCodMar()+">"+x.getNomMar());
                                    }
                                %>
                            </select>
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
        //LISTA DE PRODUCTOS AJAX Y EL BUSCADOR//
        $(document).ready(function () {
            listado();
            //capturamos el texto que buscara la consulta del buscador
            $(document).on('keyup', '#txtnom', function () {
                var valor = $(this).val();
                listado(valor);
            });
        });
        //devolvemos la para mostrar el ajax todo los productos//
        function listado(valor = '') {
            var consulta = "opc=1&termino=" + valor;

            $.get("control", consulta, (response) => {
                var misDatos = JSON.parse(response);
                var template = '';

                misDatos.forEach(midato => {
                    template += "<tr>";
                    template += "<td>" + midato.codProd + "</td>";
                    template += "<td>" + midato.desProd + "</td>";
                    template += "<td>" + midato.stockProd + "</td>";
                    template += "<td>" + midato.umProd + "</td>";
                    template += "<td>" + midato.fecProd + "</td>";     
                    //onclick editar llamara el modar editar
                    template += '<td><a onclick=editarProducto("' + midato.codProd + '")></a> | <a href="control?opc=3&cod=' + midato.codProd + '"></a>';                
                    template += "</tr>";
                });
                template += `</tbody></table>`;
                $("#tablares").html(template);
            });
        }
        
            //AJAX LLAMAMOS EL MODAL PARA MOSTRAR LA CONSULTA DEL EDITAR DEL PRODUCTO CUANDO SE HAGA CLICK AL ICONO
            const modalEditar = new bootstrap.Modal(document.getElementById('editar_producto'), {
                keyboard: false
            });
            
            //CONSULTA DEVOLVEMOS LOS PARAMETROS DE LOS ID DE LA TABLA PARA QUE DEVUELVA LA CONSULTA 
            function llenarModal(response) {
                let id = $('#productoId');
                let desc = $('#desc');
                let stock = $('#stock');
                let tipoa = $('#tipo-a');
                let tipob = $('#tipo-b');
                let datepicker = $('#dia');
                let cats = $('#categorias');
                let marcas = $('#marcas');
                //recibe los datos de la sentencia
                id.val(response.codProd);
                desc.val(response.desProd);
                
                if (response.umProd === 'N') { 
                    tipoa.attr('checked', true);
                }else{
                    tipob.attr('checked', true);
                }              
                stock.val(response.stockProd);
                datepicker.val(response.fecProd);
                cats.val(response.codCat);
                marcas.val(response.codMar);             
            }
            //LLAMAMOS EL SERVLET PARA LA CONSULTA Y LLENAR EL MODAL CON LOS DATOS DEL PROUCTO
            function editarProducto(producto) {
                $.get("control", {
                    opc: 2,
                    cod: producto
                }).done(function(res) {
                    let response = JSON.parse(res);
                    llenarModal(response);
                    modalEditar.toggle();
                });
            };
            
            //LA OTRA CONSULTA ES PARA GUARDAR EL MODAL 
            $('#frm_guardar').submit(function(e) {
                e.preventDefault();               
                let id = $('#productoId').val();
                let desc = $('#desc').val();
                let stock = $('#stock').val();
                let tipoa = $('#tipo-a');
                let tipob = $('#tipo-b');
                let datepicker = $('#dia').val();
                let cats = $('#categorias').val();
                let marcas = $('#marcas').val();
                //LLAMAMOS LA CONSULTA DEL SERLET PARA GUARDAR LOS DATOS EN LA DB
                $.post("control?opc=5", {
                    cod_prod: id,
                    nom_prod: desc,
                    stock_prod: stock,
                    pro: ((tipoa.is(':checked') ? 'P' : 'N'), tipob.is(':checked') ? 'P' : 'N'),
                    date_prod: datepicker
                }).done(function() {
                    window.location.href='Productos.jsp';
                });
            });         
    </script>

</html>
