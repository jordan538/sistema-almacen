package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Empleados</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulario Empleados</h1>\n");
      out.write("        <button type=\"button\" name=\"btn_nuevo\" id=\"btn_nuevo\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#modal_empleado\" onclick=\"limpiar()\">Nuevo</button>\n");
      out.write("        \n");
      out.write("    <div class=\"container\">\n");
      out.write("         \n");
      out.write("        <div class=\"modal fade\" id=\"modal_empleado\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("             <form action=\"sr_empleados\" method=\"post\" class=\"form-group\">\n");
      out.write("               <label for=\"lbl_id\" ><b>ID</b></label>\n");
      out.write("                <input type=\"text\" name=\"txt_id\" id=\"txt_id\" class=\"form-control\" value=\"0\"  readonly> \n");
      out.write("                <label for=\"lbl_codigo\" ><b>Codigo</b></label>\n");
      out.write("                <input type=\"text\" name=\"txt_codigo\" id=\"txt_codigo\" class=\"form-control\" placeholder=\"Ejemplo: E001\" pattern=\"[E]{1}[0-9]{3}\" required>\n");
      out.write("                <label for=\"lbl_nombres\" ><b>Nombres</b></label>\n");
      out.write("                <input type=\"text\" name=\"txt_nombres\" id=\"txt_nombres\" class=\"form-control\" placeholder=\"Ejemplo: Nombre1 Nombre2\" required>\n");
      out.write("                <label for=\"lbl_apellidos\" ><b>Apellidos</b></label>\n");
      out.write("                <input type=\"text\" name=\"txt_apellidos\" id=\"txt_apellidos\" class=\"form-control\" placeholder=\"Ejemplo: Apellido1 Apellido2\" required>\n");
      out.write("                <label for=\"lbl_direccion\" ><b>Direccion</b></label>\n");
      out.write("                <input type=\"text\"  name=\"txt_direccion\" id=\"txt_direccion\" class=\"form-control\" placeholder=\"Ejemplo: #Casa calle zona ciudad\" required>\n");
      out.write("                <label for=\"lbl_telefono\" ><b>Telefono</b></label>\n");
      out.write("                <input type=\"number\" name=\"txt_telefono\" id=\"txt_telefono\" class=\"form-control\" placeholder=\"Ejemplo: 5555555\" required>\n");
      out.write("                <label for=\"lbl_fn\" ><b>Nacimiento</b></label>\n");
      out.write("                <input type=\"date\"  name=\"txt_fn\" id=\"txt_fn\" class=\"form-control\" required>\n");
      out.write("                <label for=\"lbl_puesto\" ><b>Puesto</b></label>\n");
      out.write("                <select name=\"drop_puesto\" id=\"drop_puesto\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <button name=\"btn_agregar\" id=\"btn_agregar\"  value=\"agregar\" class=\"btn btn-primary btn-lg\">Agregar</button>\n");
      out.write("                <button name=\"btn_modificar\" id=\"btn_modificar\"  value=\"modificar\" class=\"btn btn-success btn-lg\">Modificar</button>\n");
      out.write("                <button name=\"btn_eliminar\" id=\"btn_modificar\"  value=\"eliminar\" class=\"btn btn-danger btn-lg\" onclick=\"javascript:if(!confirm('¿Desea Eliminar?'))return false\" >Eliminar</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-warning btn-lg\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           \n");
      out.write("    <table class=\"table table-striped\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>Codigo</th>\n");
      out.write("        <th>Nombres</th>\n");
      out.write("        <th>Apellidos</th>\n");
      out.write("        <th>Direccion</th>\n");
      out.write("        <th>Telefono</th>\n");
      out.write("        <th>Nacimiento</th>\n");
      out.write("        <th>Puesto</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody id=\"tbl_empleados\">\n");
      out.write("      \n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("  </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function limpiar(){\n");
      out.write("        $(\"#txt_id\").val(0);\n");
      out.write("       $(\"#txt_codigo\").val('');\n");
      out.write("       $(\"#txt_nombres\").val('');\n");
      out.write("       $(\"#txt_apellidos\").val('');\n");
      out.write("       $(\"#txt_direccion\").val('');\n");
      out.write("       $(\"#txt_telefono\").val('');\n");
      out.write("       $(\"#txt_fn\").val('');\n");
      out.write("       $(\"#drop_puesto\").val(1);\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("    $('#tbl_empleados').on('click','tr td',function(evt){\n");
      out.write("       var target,id,id_p,codigo,nombres,apellidos,direccion,telefono,nacimiento; \n");
      out.write("       target = $(event.target);\n");
      out.write("       id = target.parent().data('id');\n");
      out.write("       id_p = target.parent().data('id_p'); \n");
      out.write("       codigo = target.parent(\"tr\").find(\"td\").eq(0).html();\n");
      out.write("       nombres= target.parent(\"tr\").find(\"td\").eq(1).html();\n");
      out.write("       apellidos = target.parent(\"tr\").find(\"td\").eq(2).html();\n");
      out.write("       direccion = target.parent(\"tr\").find(\"td\").eq(3).html();\n");
      out.write("       telefono = target.parent(\"tr\").find(\"td\").eq(4).html();\n");
      out.write("       nacimiento = target.parent(\"tr\").find(\"td\").eq(5).html();\n");
      out.write("       $(\"#txt_id\").val(id);\n");
      out.write("       $(\"#txt_codigo\").val(codigo);\n");
      out.write("       $(\"#txt_nombres\").val(nombres);\n");
      out.write("       $(\"#txt_apellidos\").val(apellidos);\n");
      out.write("       $(\"#txt_direccion\").val(direccion);\n");
      out.write("       $(\"#txt_telefono\").val(telefono);\n");
      out.write("       $(\"#txt_fn\").val(nacimiento);\n");
      out.write("       $(\"#drop_puesto\").val(id_p);\n");
      out.write("       $(\"#modal_empleado\").modal('show');\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("</script>\n");
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
