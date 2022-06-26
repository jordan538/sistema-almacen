package miservlet;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import dao.DaoMarcas;

public class controlMar extends HttpServlet {

    DaoMarcas obj=new DaoMarcas();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)ListarMarcas(request, response);
        if(op==2)ConsulMarcas(request, response);
        if(op==3)DelMarcas(request, response);
        if(op==4)AgrMarcas(request, response);
        if(op==5)ModMarcas(request, response);
    }
    
    //CATEGORIAS
    protected void ListarMarcas(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        String termino = request.getParameter("termino");
        out.print(gson.toJson(obj.filMarca(termino)));
    }
    
    protected void AgrMarcas(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Marcas p = new Marcas();
        p.setNomMar(request.getParameter(""));
        obj.agrMarca(p);
        response.getOutputStream().print("<script>window.location.href='';</script>"); 
    }
    
    protected void ConsulMarcas(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String nro = (request.getParameter("cod"));
        Marcas pre=obj.busMarca(nro);
        request.setAttribute("dato", pre);
        String pag="/.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void ModMarcas(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Marcas p=new Marcas();
        p.setCodMar(request.getParameter(""));
        p.setNomMar(request.getParameter(""));;
        obj.actMarca(p);
        String pag="/.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void DelMarcas(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codMar = (request.getParameter("cod"));
        obj.eliMarca(codMar);
        String pag="/.jsp";
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
