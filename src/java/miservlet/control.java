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
        int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)ListarProductos(request, response);
        if(op==2)ConsulProducto(request, response);
        if(op==3)DelProductos(request, response);
        if(op==4)AgrProductos(request, response);
        if(op==5)ModProducto(request, response);     
        
    }
    
    protected void ListarProductos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        String termino = request.getParameter("termino");
        out.print(gson.toJson(obj.ListaProductosFiltro(termino)));
    }
    
    protected void AgrProductos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Productos p = new Productos();
        //p.setCodProd(Integer.parseInt(request.getParameter("cod_prod")));
        p.setDesProd(request.getParameter("nom_prod"));
        p.setStockProd(Integer.parseInt(request.getParameter("stock_prod")));
        p.setUmProd(request.getParameter("pro"));
        p.setFecProd(request.getParameter("date_prod"));
        obj.AgregarProducto(p);
        /*String pag = "/pagProductos.jsp";
        request.getRequestDispatcher(pag).forward(request, response);*/
        response.getOutputStream().print("<script>window.location.href='pagProductos.jsp';</script>"); 
        //request.getRequestDispatcher(pag);
    }
    
    protected void ConsulProducto(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        //int nro=Integer.parseInt(request.getParameter("cod"));
        String nro = (request.getParameter("cod"));
        Productos pre=obj.ConsultaProducto(nro);
        request.setAttribute("dato", pre);
        String pag="/modProductos.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void ModProducto(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Productos p=new Productos();
        p.setCodProd(request.getParameter("cod_prod"));
        p.setDesProd(request.getParameter("nom_prod"));
        p.setStockProd(Integer.parseInt(request.getParameter("stock_prod")));
        p.setUmProd(request.getParameter("pro"));
        p.setFecProd(request.getParameter("date_prod"));
        obj.ModificaProducto(p);
        String pag="/pagProductos.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void DelProductos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //int codPro=Integer.parseInt(request.getParameter("cod"));
        String codPro = (request.getParameter("cod"));
        obj.BorrarProducto(codPro);
        response.getOutputStream().print("<script>window.location.href='pagProductos.jsp';</script>"); 
        //String pag="/pagProductos.jsp";
        //request.getRequestDispatcher(pag).forward(request, response);


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
