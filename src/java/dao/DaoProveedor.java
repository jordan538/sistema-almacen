package dao;
import util.MySQLConexion;
import modelo.*; 
import java.util.*; 
import java.sql.*; 

public class DaoProveedor {
    public List<Proveedor> lisProveedor(){
        List<Proveedor>lista=new ArrayList();   
        try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="select codCat, nomCat from categoria";
            PreparedStatement st=cn.prepareStatement(sql); 
            ResultSet rs=st.executeQuery(); 
            while(rs.next()){//leer filaxfila y pasarlo al arraylist 
            Proveedor p=new Proveedor(); 
            p.setCodProv(rs.getString(1));
            p.setRucProv(rs.getInt(2));
            p.setRazonProv(rs.getString(3));
            p.setDirProv(rs.getString(4));          
            p.setTelProv(rs.getString(5));
            lista.add(p); 
        } 
        }catch(Exception ex){ 
            ex.printStackTrace(); 
        }   
        return lista;    
    }
    
    //un metodo para filtrar empleados
    public List<Proveedor> filProveedor(String id) {
        List<Proveedor> lista = new ArrayList<>();
        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "select idcat, nombre from categoria "
                    + "where nombre like ? ";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id+"%");
            ResultSet rs=st.executeQuery(); 
            while (rs.next()) {
            Proveedor p=new Proveedor(); 
            p.setCodProv(rs.getString(1));
            p.setRucProv(rs.getInt(2));
            p.setRazonProv(rs.getString(3));
            p.setDirProv(rs.getString(4));          
            p.setTelProv(rs.getString(5));
            st.executeUpdate();
        } 
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    //un metodo para agregar empleados
    public void agrProveedor(Proveedor p) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call agrCategoria(?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setInt(1, p.getRucProv());
            st.setString(2, p.getRazonProv());
            st.setString(3, p.getDirProv());
            st.setString(4, p.getTelProv());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //unn metodo para buscar empleado
    public Proveedor busProveedor(String id) {
        Proveedor p = null;
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {//leer cada fila de la tabla
                p = new Proveedor();
                p.setCodProv(rs.getString(1));
                p.setRucProv(rs.getInt(2));
                p.setRazonProv(rs.getString(3));
                p.setDirProv(rs.getString(4));          
                p.setTelProv(rs.getString(5));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return p;
    }
    
    //un metodo para actualizar empleado
    public void actProveedor(Proveedor p) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call actCategoria(?, ?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setString(1, p.getCodProv());
            st.setInt(2, p.getRucProv());
            st.setString(3, p.getRazonProv());
            st.setString(4, p.getDirProv());
            st.setString(5, p.getTelProv());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //un metodo para eliminar empleado
    public void eliProveedor(String id) {
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
