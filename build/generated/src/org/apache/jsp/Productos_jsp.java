package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import dao.Negocio;
import dao.DaoMarcas;
import dao.DaoCategorias;
import java.util.*;
import modelo.*;
import dao.Negocio;
import modelo.*;
import dao.Negocio;

public final class Productos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/include/cabecera.jsp");
    _jspx_dependants.add("/include/menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de Productos</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.13.0/css/all.css\" integrity=\"sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V\" crossorigin=\"anonymous\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/animaciones.js\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de Productos</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.13.0/css/all.css\" integrity=\"sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V\" crossorigin=\"anonymous\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul class=\"nav-list\">\n");
      out.write("                    <li class=\"nav-logo\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                        <i class=\"fab fa-sass\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </li>     \n");
      out.write("                    <li class=\"nav-link\">Sistema de Almacen - <a>Admin</a>\n");
      out.write("                    </li>   \n");
      out.write("                    <li class=\"nav-link\">\n");
      out.write("                        <button id=\"sidebar-toggler\" class=\"sidebar-toggle btna\">\n");
      out.write("                        <span class=\"fas fa-bars\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </li> \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div id=\"body\" class=\"sidebar-initial row\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de Productos</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.13.0/css/all.css\" integrity=\"sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V\" crossorigin=\"anonymous\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"col-lg-9 sidebar\">\n");
      out.write("            <nav class=\"menu-sidebar\">\n");
      out.write("                <ul>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-layer-group\"></i> Escritorio</a></li>\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pagProductos.jsp\"><i class=\"fa fa-pen-to-square\"></i> Almacen</a></li>\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pagEmpleados.jsp\"><i class=\"fa fa-users\"></i> Empleados</a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-location-dot\"></i> Localización</a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-cart-flatbed\"></i> Orden</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"nav-item-bottom\" id=\"logoutbtn\" onclick=\"logoutcomfirm()\"><i class=\"fa fa-xmark\"></i> Cerrar Sesión</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"close-menu\"><i class=\"fa fa-caret-left\"></i></div>    \n");
      out.write("            </div>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-3 row-content\">\n");
      out.write("                <div class=\"content-box\">\n");
      out.write("                    <div class=\"back\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary backing upload\" name=\"btn_nuevo\" id=\"btn_nuevo\" data-toggle=\"modal\" data-target=\"#modal_producto\" onclick=\"limpiar()\"><i class=\"fa fa-file-arrow-up\"></i> Añadir Producto</button>\n");
      out.write("                    </div>   \n");
      out.write("                    <div class=\"searchform-fields\">\n");
      out.write("                        <input id=\"txtnom\" name=\"txtnom\" placeholder=\"Busque producto...\">\n");
      out.write("                        <span class=\"button-wrap\">\n");
      out.write("                            <i class=\"fas fa-search\"></i>\n");
      out.write("\t\t\t</span>\n");
      out.write("                    </div>\n");
      out.write("                <div id=\"tablaress\" class=\"container\">\n");
      out.write("                    <table class=\"table table-fixed producto\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th class=\"col-lg-2\">Codigo</th>\n");
      out.write("                                <th class=\"col-lg-2\">Producto</th> \n");
      out.write("                                <th class=\"col-lg-2\">Stock</th> \n");
      out.write("                                <th class=\"col-lg-2\">Unidad</th> \n");
      out.write("                                <th class=\"col-lg-2\">Fecha</th> \n");
      out.write("                                <th class=\"col-lg-2\">Opciones</th> \n");
      out.write("                            </tr>        \n");
      out.write("                        </thead>   \n");
      out.write("                            <tbody id=\"tablares\"></tbody>\n");
      out.write("                    </table>                                                          \n");
      out.write("                </div>                   \n");
      out.write("                </div>        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <!-- Modal Guardar-->        \n");
      out.write("    <div class=\"modal fade\" id=\"modal_producto\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("            <form action=\"control\" method=\"post\" class=\"form-group\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                    <input type=\"hidden\" name=\"opc\" value=\"4\">             \n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Descripcion:</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"nom_prod\" placeholder=\"Ingrese nombre\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Stock:</label>\n");
      out.write("                            <input class=\"form-control\" type=\"number\" name=\"stock_prod\" min=\"1\" max=\"9999\" placeholder=\"Ingrese stock\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Unidad:</label>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"radio\" name=\"pro\" value=\"N\" checked> Nacional\n");
      out.write("                                <input class=\"form-check-input\" type=\"radio\" name=\"pro\" value=\"P\"> Extranjero\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Fecha:</label>\n");
      out.write("                            <input class=\"form-control\" id=\"datepicker\" type=\"date\" name=\"date_prod\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Categorias:</label>\n");
      out.write("                            <select class=\"form-control\" name=\"cmb_cat\">\n");
      out.write("                                <option selected=\"selected\">Elegir</option>\n");
      out.write("                                ");

                                    DaoCategorias cat=new DaoCategorias();
                                    for(Categorias x:cat.lisCategoria()){
                                        out.print("<option value="+x.getCodCat()+">"+x.getNomCat());
                                    }
                                
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Marcas:</label>\n");
      out.write("                            <select class=\"form-control\" name=\"cmb_mar\">\n");
      out.write("                                <option selected=\"selected\">Elegir</option>\n");
      out.write("                                ");

                                    DaoMarcas mar=new DaoMarcas();
                                    for(Marcas x:mar.lisMarca()){
                                    out.print("<option value="+x.getCodMar()+">"+x.getNomMar());
                                    }
                                
      out.write("                                          \n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary save\" ><i class=\"fa fa-floppy-disk\"></i> Guardar</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning btn-lg\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>     \n");
      out.write("    </div> \n");
      out.write("    <!-- Modal Editar-->    \n");
      out.write("    <div class=\"modal fade\" id=\"editar_producto\" role=\"dialog\"><!-- id llamara el evento del modal-->\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("            <form id=\"frm_guardar\" method=\"post\" class=\"form-group\">\n");
      out.write("                <input id=\"productoId\" type=\"hidden\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">         \n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Descripcion:</label>\n");
      out.write("                            <input id=\"desc\" class=\"form-control\" type=\"text\" name=\"nom_prod\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Stock:</label>\n");
      out.write("                            <input id=\"stock\" class=\"form-control\" type=\"number\" name=\"stock_prod\" min=\"1\" max=\"9999\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Unidad:</label>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input id=\"tipo-a\" class=\"form-check-input\" type=\"radio\" name=\"pro\" value=\"N\"> Nacional\n");
      out.write("                                <input id=\"tipo-b\" class=\"form-check-input\" type=\"radio\" name=\"pro\" value=\"P\"> Extranjero\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Fecha:</label>\n");
      out.write("                            <input class=\"form-control\" id=\"dia\" type=\"date\" name=\"date_prod\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Categorias:</label>\n");
      out.write("                            <select id=\"categorias\" class=\"form-control\" name=\"cbe\">\n");
      out.write("                                <option selected=\"selected\">Elegir</option>\n");
      out.write("                                ");

                                    DaoCategorias cat_edt=new DaoCategorias();
                                    for(Categorias x:cat_edt.lisCategoria()){
                                        out.print("<option value="+x.getCodCat()+">"+x.getNomCat());
                                    } 
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label\">Marcas:</label>\n");
      out.write("                            <select id=\"marcas\" class=\"form-control\" name=\"cbe\">\n");
      out.write("                                <option selected=\"selected\">Elegir</option>\n");
      out.write("                                ");

                                    DaoMarcas mar_edt=new DaoMarcas();
                                    for(Marcas x:mar_edt.lisMarca()){
                                        out.print("<option value="+x.getCodMar()+">"+x.getNomMar());
                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button id=\"guardar\" type=\"submit\" class=\"btn btn-primary save\" ><i class=\"fa fa-floppy-disk\"></i> Guardar</button>\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning btn-lg\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </form>       \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>     \n");
      out.write("    </div>             \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        //LISTA DE PRODUCTOS AJAX Y EL BUSCADOR//\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            listado();\n");
      out.write("            //capturamos el texto que buscara la consulta del buscador\n");
      out.write("            $(document).on('keyup', '#txtnom', function () {\n");
      out.write("                var valor = $(this).val();\n");
      out.write("                listado(valor);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        //devolvemos la para mostrar el ajax todo los productos//\n");
      out.write("        function listado(valor = '') {\n");
      out.write("            var consulta = \"opc=1&termino=\" + valor;\n");
      out.write("\n");
      out.write("            $.get(\"control\", consulta, (response) => {\n");
      out.write("                var misDatos = JSON.parse(response);\n");
      out.write("                var template = '';\n");
      out.write("\n");
      out.write("                misDatos.forEach(midato => {\n");
      out.write("                    template += \"<tr>\";\n");
      out.write("                    template += \"<td>\" + midato.codProd + \"</td>\";\n");
      out.write("                    template += \"<td>\" + midato.desProd + \"</td>\";\n");
      out.write("                    template += \"<td>\" + midato.stockProd + \"</td>\";\n");
      out.write("                    template += \"<td>\" + midato.umProd + \"</td>\";\n");
      out.write("                    template += \"<td>\" + midato.fecProd + \"</td>\";     \n");
      out.write("                    //onclick editar llamara el modar editar\n");
      out.write("                    template += '<td><a onclick=editarProducto(\"' + midato.codProd + '\")></a> | <a href=\"control?opc=3&cod=' + midato.codProd + '\"></a>';                \n");
      out.write("                    template += \"</tr>\";\n");
      out.write("                });\n");
      out.write("                template += `</tbody></table>`;\n");
      out.write("                $(\"#tablares\").html(template);\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("            //AJAX LLAMAMOS EL MODAL PARA MOSTRAR LA CONSULTA DEL EDITAR DEL PRODUCTO CUANDO SE HAGA CLICK AL ICONO\n");
      out.write("            const modalEditar = new bootstrap.Modal(document.getElementById('editar_producto'), {\n");
      out.write("                keyboard: false\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            //CONSULTA DEVOLVEMOS LOS PARAMETROS DE LOS ID DE LA TABLA PARA QUE DEVUELVA LA CONSULTA \n");
      out.write("            function llenarModal(response) {\n");
      out.write("                let id = $('#productoId');\n");
      out.write("                let desc = $('#desc');\n");
      out.write("                let stock = $('#stock');\n");
      out.write("                let tipoa = $('#tipo-a');\n");
      out.write("                let tipob = $('#tipo-b');\n");
      out.write("                let datepicker = $('#dia');\n");
      out.write("                let cats = $('#categorias');\n");
      out.write("                let marcas = $('#marcas');\n");
      out.write("                //recibe los datos de la sentencia\n");
      out.write("                id.val(response.codProd);\n");
      out.write("                desc.val(response.desProd);\n");
      out.write("                \n");
      out.write("                if (response.umProd === 'N') { \n");
      out.write("                    tipoa.attr('checked', true);\n");
      out.write("                }else{\n");
      out.write("                    tipob.attr('checked', true);\n");
      out.write("                }              \n");
      out.write("                stock.val(response.stockProd);\n");
      out.write("                datepicker.val(response.fecProd);\n");
      out.write("                cats.val(response.codCat);\n");
      out.write("                marcas.val(response.codMar);             \n");
      out.write("            }\n");
      out.write("            //LLAMAMOS EL SERVLET PARA LA CONSULTA Y LLENAR EL MODAL CON LOS DATOS DEL PROUCTO\n");
      out.write("            function editarProducto(producto) {\n");
      out.write("                $.get(\"control\", {\n");
      out.write("                    opc: 2,\n");
      out.write("                    cod: producto\n");
      out.write("                }).done(function(res) {\n");
      out.write("                    let response = JSON.parse(res);\n");
      out.write("                    llenarModal(response);\n");
      out.write("                    modalEditar.toggle();\n");
      out.write("                });\n");
      out.write("            };\n");
      out.write("            \n");
      out.write("            //LA OTRA CONSULTA ES PARA GUARDAR EL MODAL \n");
      out.write("            $('#frm_guardar').submit(function(e) {\n");
      out.write("                e.preventDefault();               \n");
      out.write("                let id = $('#productoId').val();\n");
      out.write("                let desc = $('#desc').val();\n");
      out.write("                let stock = $('#stock').val();\n");
      out.write("                let tipoa = $('#tipo-a');\n");
      out.write("                let tipob = $('#tipo-b');\n");
      out.write("                let datepicker = $('#dia').val();\n");
      out.write("                let cats = $('#categorias').val();\n");
      out.write("                let marcas = $('#marcas').val();\n");
      out.write("                //LLAMAMOS LA CONSULTA DEL SERLET PARA GUARDAR LOS DATOS EN LA DB\n");
      out.write("                $.post(\"control?opc=5\", {\n");
      out.write("                    cod_prod: id,\n");
      out.write("                    nom_prod: desc,\n");
      out.write("                    stock_prod: stock,\n");
      out.write("                    pro: ((tipoa.is(':checked') ? 'P' : 'N'), tipob.is(':checked') ? 'P' : 'N'),\n");
      out.write("                    date_prod: datepicker\n");
      out.write("                }).done(function() {\n");
      out.write("                    window.location.href='Productos.jsp';\n");
      out.write("                });\n");
      out.write("            });         \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
