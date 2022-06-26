package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import dao.Negocio;
import java.util.*;
import modelo.*;
import dao.Negocio;
import modelo.*;
import dao.Negocio;

public final class modDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Editar Producto</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.13.0/css/all.css\" integrity=\"sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V\" crossorigin=\"anonymous\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/animaciones.js\"></script>  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>function back(){history.go(-1);}</script>\n");
      out.write("        ");

            Productos p=(Productos) request.getAttribute("dato");
        
      out.write("\n");
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
      out.write("                        <button type=\"submit\" class=\"btn btn-primary backing\" onclick=\"location.href='pagProductos.jsp'\"><i class=\"fa fa-arrow-left\"></i> Regresar</button>\n");
      out.write("                    </div>\n");
      out.write("                <div id=\"tablaress\" class=\"container datos\">\n");
      out.write("                    <div class=\"container-datos\">\n");
      out.write("                        <form action=\"control\" name=\"fr1\"> \n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <input type=\"hidden\" name=\"opc\" value=\"5\">\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label\">Codigo:</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"cod_prod\" value=\"");
      out.print(p.getCodProd());
      out.write("\" disabled>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-9\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label\">Producto:</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"nom_prod\" value=\"");
      out.print(p.getDesProd());
      out.write("\" placeholder=\"Ingrese nombre\" >\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label\">Stock:</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"number\" name=\"stock_prod\" min=\"1\" max=\"9999\" value=\"");
      out.print(p.getStockProd());
      out.write("\" placeholder=\"Ingrese stock\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label\">Unidad:</label>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"pro\" value=\"N\" checked> Nacional\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"pro\" value=\"P\"> Extranjero\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label\">Fecha:</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"date\" name=\"date_prod\" value=\"");
      out.print(p.getFecProd());
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>                          \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary save\" ><i class=\"fa fa-floppy-disk\"></i> Guardar</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>    \n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
