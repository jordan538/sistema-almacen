package dao;
import util.MySQLConexion;
import modelo.*; 
import java.util.*; 
import java.sql.*; 

public class DaoLocalizador {
    public List<Localizador> lisLocalizador(){
        List<Localizador>lista=new ArrayList();   
        try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="select codCat, nomCat from categoria";
            PreparedStatement st=cn.prepareStatement(sql); 
            ResultSet rs=st.executeQuery(); 
            while(rs.next()){//leer filaxfila y pasarlo al arraylist 
            Localizador p=new Localizador(); 
            p.setCodLoca(rs.getString(1));
            p.setDesLoca(rs.getString(2));
            lista.add(p); 
        } 
        }catch(Exception ex){ 
            ex.printStackTrace(); 
        }   
        return lista;    
    }
    
    //un metodo para filtrar empleados
    public List<Localizador> filLocalizador(String id) {
        List<Localizador> lista = new ArrayList<>();
        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "select idcat, nombre from categoria "
                    + "where nombre like ? ";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id+"%");
            ResultSet rs=st.executeQuery(); 
            while (rs.next()) {
            Localizador p=new Localizador(); 
            p.setCodLoca(rs.getString(1));
            p.setDesLoca(rs.getString(2));
            st.executeUpdate();
        } 
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    //un metodo para agregar empleados
    public void agrLocalizador(Localizador p) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call agrCategoria(?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setString(1, p.getDesLoca());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //unn metodo para buscar empleado
    public Localizador busLocalizador(String id) {
        Localizador p = null;
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {//leer cada fila de la tabla
                p = new Localizador();
                p.setCodLoca(rs.getString(1));
                p.setDesLoca(rs.getString(2));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return p;
    }
    
    //un metodo para actualizar empleado
    public void actLocalizador(Localizador p) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call actCategoria(?, ?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setString(1, p.getCodLoca());
            st.setString(2, p.getDesLoca());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //un metodo para eliminar empleado
    public void eliLocalizador(String id) {
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
