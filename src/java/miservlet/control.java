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
import dao.DaoCategorias;

public class control extends HttpServlet {
    
    Negocio obj=new Negocio();
    DaoCategorias objcat=new DaoCategorias();

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
        p.setDesProd(request.getParameter("nom_prod"));
        p.setStockProd(Integer.parseInt(request.getParameter("stock_prod")));
        p.setUmProd(request.getParameter("pro"));
        p.setFecProd(request.getParameter("date_prod"));
        p.setCodCat(request.getParameter("cmb_cat"));
        p.setCodMar(request.getParameter("cmb_mar"));
        obj.AgregarProducto(p);
        response.getOutputStream().print("<script>window.location.href='Productos.jsp';</script>"); 
    }
    //AJAX
    protected void ConsulProducto(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        String nro = (request.getParameter("cod"));
        Productos producto = obj.ConsultaProducto(nro);
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        out.print(gson.toJson(producto));
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
    }

    
    protected void DelProductos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codPro = (request.getParameter("cod"));
        obj.BorrarProducto(codPro);
        response.getOutputStream().print("<script>window.location.href='Productos.jsp';</script>"); 
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
