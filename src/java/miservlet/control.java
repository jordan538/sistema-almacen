package miservlet;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import dao.Negocio;


public class control extends HttpServlet {
    
    Negocio obj=new Negocio();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)ListarProductos(request, response);
        if(op==3)DelClientes(request, response);
    }
    
    protected void ListarProductos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        String termino = request.getParameter("termino");
        out.print(gson.toJson(obj.ListaProductosFiltro(termino)));
    }
    
    protected void DelClientes(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int codPro=Integer.parseInt(request.getParameter("cod"));
        obj.BorrarProducto(codPro);
        String pag="/pagProductos.jsp";
        request.getRequestDispatcher(pag).forward(request, response);


        /*String codCli = request.getParameter("code");
        
        request.setAttribute("dato", obj.FacturasPorCliente(codCli));
        String pag = "/Pregunta02_1.jsp";
        request.getRequestDispatcher(pag).forward(request, response);*/
    }
    
    /*protected void buscaProductos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cod=request.getParameter("consulta");         
        PrintWriter out = response.getWriter(); 
        Gson gs=new Gson(); 
        out.println(gs.toJson(obj.filtraProducto(cod))); 
    }*/
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
