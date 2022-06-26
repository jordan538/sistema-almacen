package dao;
import util.MySQLConexion;
import modelo.*; 
import java.util.*; 
import java.sql.*; 

public class DaoEmpleados {
    public List<Empleados> lisEmpleado(){
        List<Empleados>lista=new ArrayList();   
        try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="select codemp, nomemp, appemp, apmemp, dniemp, telfemp, codarea from empleado";
            PreparedStatement st=cn.prepareStatement(sql); 
            ResultSet rs=st.executeQuery(); 
            while(rs.next()){//leer filaxfila y pasarlo al arraylist 
            Empleados p=new Empleados(); 
            p.setCodEmp(rs.getString(1));
            p.setNomEmp(rs.getString(2));
            p.setAppEmp(rs.getString(3));
            p.setApmEmp(rs.getString(4));
            p.setDniEmp(rs.getString(5));
            p.setTelfEmp(rs.getString(6));
            p.setCodArea(rs.getInt(7));
            lista.add(p); 
        } 
        }catch(Exception ex){ 
        ex.printStackTrace(); 
        }   
        return lista;    
    }
    
    public List<Empleados> filEmpleado(String id) {
        List<Empleados> lista = new ArrayList<>();
        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "select codemp, nomemp, appemp, apmemp, dniemp, telfemp, codarea from empleado "
                    + "where nomemp like ? or appemp like ? or apmemp like ?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id+"%");
            st.setString(2, id+"%");
            st.setString(3, id+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Empleados p = new Empleados();
                p.setCodEmp(rs.getString(1));
                p.setNomEmp(rs.getString(2));
                p.setAppEmp(rs.getString(3));
                p.setApmEmp(rs.getString(4));
                p.setDniEmp(rs.getString(5));
                p.setTelfEmp(rs.getString(6));
                p.setCodArea(rs.getInt(7));
                lista.add(p);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public void agrEmpleado(Empleados p) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call agrEmpleado(?, ?, ?, ?, ?, ?)}";
            CallableStatement st = cn.prepareCall(sql);
  
            st.setString(1, p.getNomEmp());
            st.setString(2, p.getAppEmp());
            st.setString(3, p.getApmEmp());
            st.setString(4, p.getDniEmp());
            st.setString(5, p.getTelfEmp());
            st.setInt(6, p.getCodArea());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Empleados busEmpleado(String id) {
        Empleados p = null;
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "select codemp, nomemp, appemp, apmemp, dniemp, telfemp, codarea from empleado where codemp=?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {//leer cada fila de la tabla
                p = new Empleados();
                p.setCodEmp(rs.getString(1));
                p.setNomEmp(rs.getString(2));
                p.setAppEmp(rs.getString(3));
                p.setApmEmp(rs.getString(4));
                p.setDniEmp(rs.getString(5));
                p.setTelfEmp(rs.getString(6));
                p.setCodArea(rs.getInt(7));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return p;
    }
    
    public void actEmpleado(Empleados p) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql="update empleado set nomEmp=?, appEmp=?, apmEmp=?, dniEmp=?, telfEmp=?, codArea=? where codEmp=?"; 
            PreparedStatement st = cn.prepareStatement(sql);
            //String sql = "{call actEmpleado(?, ?, ?, ?, ?, ?, ?)}";
            //CallableStatement st = cn.prepareCall(sql);
            st.setString(7, p.getCodEmp());
            st.setString(1, p.getNomEmp());
            st.setString(2, p.getAppEmp());
            st.setString(3, p.getApmEmp());
            st.setString(4, p.getDniEmp());
            st.setString(5, p.getTelfEmp());
            st.setInt(6, p.getCodArea());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void eliEmpleado(String id) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "delete from empleado where codemp=?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
