package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import dao.Negocio;

public final class pag_002dproductos_002dA_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.13.0/css/all.css\" integrity=\"sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V\" crossorigin=\"anonymous\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/estilos_a.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/filtro-productos.js\"></script>\n");
      out.write("        <script src=\"js/animaciones.js\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body>      \n");
      out.write("        ");

            /*Negocio obj=new Negocio();*/
        
      out.write("\n");
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
      out.write("                        <button id=\"sidebar-toggler\" class=\"sidebar-toggle btn\">\n");
      out.write("                        <span class=\"fas fa-bars\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </li> \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("        <div id=\"body\" class=\"sidebar-initial row\">\n");
      out.write("            <div class=\"col-lg-9 sidebar\">\n");
      out.write("            <nav class=\"menu-sidebar\">\n");
      out.write("                <ul>\n");
      out.write("                <li><a href=\"#\" class=\"\"><i class=\"fa fa-layer-group\"></i> Escritorio</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"\"><i class=\"fa fa-pen-to-square\"></i> Almacen</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"\"><i class=\"fa fa-users\"></i> Empleados</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"\"><i class=\"fa fa-location-dot\"></i> Localización</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"\"><i class=\"fa fa-cart-flatbed\"></i> Orden</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"nav-item-bottom\" id=\"logoutbtn\" onclick=\"logoutcomfirm()\"><i class=\"fa fa-xmark\"></i> Cerrar Sesión</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"close-menu\"><i class=\"fa fa-caret-left\"></i></div>    \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 row-content\">\n");
      out.write("                <div class=\"content-box\">\n");
      out.write("                    <div class=\"searchform-fields\">\n");
      out.write("                        <input id=\"txtnom\" name=\"busca\" placeholder=\"ingrese apellido\">\n");
      out.write("                        <span class=\"button-wrap\">\n");
      out.write("                            <i class=\"fas fa-search\"></i>\n");
      out.write("\t\t\t</span>\n");
      out.write("                    </div>\n");
      out.write("                <div id=\"tablaress\" class=\"container\">\n");
      out.write("                    <table class=\"table table-fixed producto\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"col-xs-3\">Codigo</th>\n");
      out.write("                            <th class=\"col-xs-3\">Nombre</th> \n");
      out.write("                            <th class=\"col-xs-6\">Alumnos</th> \n");
      out.write("                        </tr>        \n");
      out.write("                    </thead>   \n");
      out.write("                        ");

                        /*for(Productos x:obj.listaProducto()){
                        out.print("<tr>");
                        out.print("<td>"+x.getCoda()+"</td>");
                        out.print("<td>"+x.getApe()+"</td>");
                        out.print("<td>"+x.getNoma()+"</td>");
                        out.print("</tr>");
                        }*/      
                        
      out.write("    \n");
      out.write("                    </table>\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"bg-dark text-white\">\n");
      out.write("                        <th>Codigo<th>Nombre<th>Telefono<th>Ver\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody id=\"tablares\"></tbody>\n");
      out.write("                    </table>    \n");
      out.write("                </div> \n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        listado(\"\");\n");
      out.write("        $(document).on('keyup', '#txtnom', function () {\n");
      out.write("            var valor = $(this).val();\n");
      out.write("            listado(valor);\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function listado(valor) {\n");
      out.write("\n");
      out.write("        var consulta = \"op=1&termino=\" + valor;\n");
      out.write("        $.get(\"control\", consulta, (response) => {\n");
      out.write("            var misDatos = JSON.parse(response);\n");
      out.write("            var template = \"\";\n");
      out.write("\n");
      out.write("            misDatos.forEach(midato => {\n");
      out.write("                template += \"<tr>\";\n");
      out.write("                template += \"<td> \" + midato.coda + \"</td>  \";\n");
      out.write("                template += \"<td>\" + midato.noma + \"</td>  \";\n");
      out.write("                template += \"<td>\" + midato.ape + \"</td> \";\n");
      out.write("                template += \"</tr>\";\n");
      out.write("            });\n");
      out.write("            template += `</tbody></table>`;\n");
      out.write("\n");
      out.write("            $(\"#tablares\").html(template);\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    </script>\n");
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
