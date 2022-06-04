package dao;
import util.MySQLConexion;
import modelo.*; 
import java.util.*; 
import java.sql.*; 

public class DaoCategorias {
    public List<Categorias> lisCategoria(){
        List<Categorias>lista=new ArrayList();   
        try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="select idcat, nombre from categoria";
            PreparedStatement st=cn.prepareStatement(sql); 
            ResultSet rs=st.executeQuery(); 
            while(rs.next()){//leer filaxfila y pasarlo al arraylist 
            Categorias c=new Categorias(); 
            c.setCodCat(rs.getString(1));
            c.setNomCat(rs.getString(2));
            lista.add(c); 
        } 
        }catch(Exception ex){ 
            ex.printStackTrace(); 
        }   
        return lista;    
    }
    
    //un metodo para filtrar empleados
    public List<Categorias> filCategoria(String id) {
        List<Categorias> lista = new ArrayList<>();
        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "select idcat, nombre from categoria "
                    + "where nombre like ? ";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id+"%");
            ResultSet rs=st.executeQuery(); 
            while (rs.next()) {
            Categorias c=new Categorias(); 
            c.setCodCat(rs.getString(1));
            c.setNomCat(rs.getString(2));
            st.executeUpdate();
        } 
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    //un metodo para agregar empleados
    public void agrCategoria(Categorias c) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call agrCategoria(?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setString(1, c.getNomCat());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //unn metodo para buscar empleado
    public Categorias busCategoria(String id) {
        Categorias c = null;
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {//leer cada fila de la tabla
                c = new Categorias();
                c.setCodCat(rs.getString(1));
                c.setNomCat(rs.getString(2));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return c;
    }
    
    //un metodo para actualizar empleado
    public void actCategoria(Categorias c) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call actCategoria(?, ?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setString(1, c.getCodCat());
            st.setString(2, c.getNomCat());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //un metodo para eliminar empleado
    public void eliCategoria(String id) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
