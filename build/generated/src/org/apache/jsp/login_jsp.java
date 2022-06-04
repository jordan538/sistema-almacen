package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import dao.Negocio;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/filtro-productos.js\"></script>\n");
      out.write("        <script src=\"js/anima.js\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"h-200 gradient-form\" style=\"background-color: #eee;\">\n");
      out.write("  <div class=\"container py-5 h-200\">\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("      <div class=\"col-xl-10\">\n");
      out.write("        <div class=\"card rounded-3 text-black\">\n");
      out.write("          <div class=\"row g-0\">\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("              <div class=\"card-body p-md-5 mx-md-4\">\n");
      out.write("\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                  <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/lotus.webp\"\n");
      out.write("                    style=\"width: 185px;\" alt=\"logo\">\n");
      out.write("                  <h4 class=\"mt-1 mb-5 pb-1 titulo\">Sistema Web</h4>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <form>\n");
      out.write("                  <p class=\"logueo\">Inicie Sesión</p>\n");
      out.write("\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <label class=\"form-label\">Usuario:</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" placeholder=\"Ingrese su usuario\" />\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"form-outline mb-4\">\n");
      out.write("                    <label class=\"form-label\">Contraseña:</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"Ingrese su contraseña\"/> \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"text-center pt-1 mb-5 pb-1\">\n");
      out.write("                    <button class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-3\" type=\"button\">Log in</button>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 d-flex align-items-center gradient-custom-2\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>    \n");
      out.write("    </body> \n");
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
