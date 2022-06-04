package miservlet;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import dao.DaoEmpleados;

public class controlEmp extends HttpServlet {

    DaoEmpleados obj=new DaoEmpleados();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)ListarEmpleados(request, response);
        if(op==2)ConsulEmpleados(request, response);
        if(op==3)DelEmpleados(request, response);
        if(op==4)AgrEmpleados(request, response);
        if(op==5)ModEmpleados(request, response);       
    }
    
    //EMPLEADOS
    protected void ListarEmpleados(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        String termino = request.getParameter("termino");
        out.print(gson.toJson(obj.filEmpleado(termino)));
    }
    
    protected void AgrEmpleados(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Empleados p = new Empleados();
        p.setNomEmp(request.getParameter("nomemp"));
        p.setAppEmp(request.getParameter("appemp"));
        p.setApmEmp(request.getParameter("apmemp"));
        p.setDniEmp(request.getParameter("dniemp"));
        p.setTelfEmp(request.getParameter("telfemp"));
        p.setCodArea(Integer.parseInt(request.getParameter("codarea")));
        obj.agrEmpleado(p);
        response.getOutputStream().print("<script>window.location.href='pagEmpleados.jsp';</script>"); 
    }
    
    protected void ConsulEmpleados(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String nro = (request.getParameter("cod"));
        Empleados pre=obj.busEmpleado(nro);
        request.setAttribute("dato", pre);
        String pag="/modEmpleados.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void ModEmpleados(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Empleados p=new Empleados();
        p.setNomEmp(request.getParameter("nomemp"));
        p.setAppEmp(request.getParameter("appemp"));
        p.setApmEmp(request.getParameter("apmemp"));
        p.setDniEmp(request.getParameter("dniemp"));
        p.setTelfEmp(request.getParameter("telfemp"));
        p.setCodArea(Integer.parseInt(request.getParameter("codarea")));
        obj.actEmpleado(p);
        String pag="/pagEmpleados.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void DelEmpleados(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codEmp = (request.getParameter("cod"));
        obj.eliEmpleado(codEmp);
        String pag="/pagEmpleados.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
