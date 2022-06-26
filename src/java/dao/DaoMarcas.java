package dao;
import util.MySQLConexion;
import modelo.*; 
import java.util.*; 
import java.sql.*; 

public class DaoMarcas {
    public List<Marcas> lisMarca(){
        List<Marcas>lista=new ArrayList();   
        try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="select codMar, nomMar from marca";
            PreparedStatement st=cn.prepareStatement(sql); 
            ResultSet rs=st.executeQuery(); 
            while(rs.next()){//leer filaxfila y pasarlo al arraylist 
            Marcas p=new Marcas(); 
            p.setCodMar(rs.getString(1));
            p.setNomMar(rs.getString(2));
            lista.add(p); 
        } 
        }catch(Exception ex){ 
            ex.printStackTrace(); 
        }   
        return lista;    
    }
    
    //un metodo para filtrar empleados
    public List<Marcas> filMarca(String id) {
        List<Marcas> lista = new ArrayList<>();
        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "select idcat, nombre from categoria "
                    + "where nombre like ? ";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id+"%");
            ResultSet rs=st.executeQuery(); 
            while (rs.next()) {
            Marcas p=new Marcas(); 
            p.setCodMar(rs.getString(1));
            p.setNomMar(rs.getString(2));
            st.executeUpdate();
        } 
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    //un metodo para agregar empleados
    public void agrMarca(Marcas m) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call agrCategoria(?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setString(1, m.getNomMar());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //unn metodo para buscar empleado
    public Marcas busMarca(String id) {
        Marcas p = null;
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {//leer cada fila de la tabla
                p = new Marcas();
                p.setCodMar(rs.getString(1));
                p.setNomMar(rs.getString(2));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return p;
    }
    
    //un metodo para actualizar empleado
    public void actMarca(Marcas p) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call actCategoria(?, ?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setString(1, p.getCodMar());
            st.setString(2, p.getNomMar());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //un metodo para eliminar empleado
    public void eliMarca(String id) {
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
