package miservlet;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import dao.DaoCategorias;


public class controlCat extends HttpServlet {

    DaoCategorias obj=new DaoCategorias();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)ListarCategorias(request, response);
        if(op==2)ConsulCategorias(request, response);
        if(op==3)DelCategorias(request, response);
        if(op==4)AgrCategorias(request, response);
        if(op==5)ModCategorias(request, response);
    }
    
    //CATEGORIAS
    protected void ListarCategorias(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        String termino = request.getParameter("termino");
        out.print(gson.toJson(obj.filCategoria(termino)));
    }
    
    protected void AgrCategorias(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Categorias p = new Categorias();
        p.setNomCat(request.getParameter(""));
        obj.agrCategoria(p);
        response.getOutputStream().print("<script>window.location.href='';</script>"); 
    }
    
    protected void ConsulCategorias(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String nro = (request.getParameter("cod"));
        Categorias pre=obj.busCategoria(nro);
        request.setAttribute("dato", pre);
        String pag="/.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void ModCategorias(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Categorias p=new Categorias();
        p.setCodCat(request.getParameter(""));
        p.setNomCat(request.getParameter(""));;
        obj.actCategoria(p);
        String pag="/.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void DelCategorias(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codCat = (request.getParameter("cod"));
        obj.eliCategoria(codCat);
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
