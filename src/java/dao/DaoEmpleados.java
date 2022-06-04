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
            Empleados e=new Empleados(); 
            e.setCodEmp(rs.getString(1));
            e.setNomEmp(rs.getString(2));
            e.setAppEmp(rs.getString(3));
            e.setApmEmp(rs.getString(4));
            e.setDniEmp(rs.getString(5));
            e.setTelfEmp(rs.getString(6));
            e.setCodArea(rs.getInt(7));
            lista.add(e); 
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
                Empleados e = new Empleados();
                e.setCodEmp(rs.getString(1));
                e.setNomEmp(rs.getString(2));
                e.setAppEmp(rs.getString(3));
                e.setApmEmp(rs.getString(4));
                e.setDniEmp(rs.getString(5));
                e.setTelfEmp(rs.getString(6));
                e.setCodArea(rs.getInt(7));
                lista.add(e);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public void agrEmpleado(Empleados e) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call agrEmpleado(?, ?, ?, ?, ?, ?)}";
            CallableStatement st = cn.prepareCall(sql);
  
            st.setString(1, e.getNomEmp());
            st.setString(2, e.getAppEmp());
            st.setString(3, e.getApmEmp());
            st.setString(4, e.getDniEmp());
            st.setString(5, e.getTelfEmp());
            st.setInt(6, e.getCodArea());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Empleados busEmpleado(String id) {
        Empleados e = null;
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "select codemp, nomemp, appemp, apmemp, dniemp, telfemp, codarea from empleado where codemp=?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {//leer cada fila de la tabla
                e = new Empleados();
                e.setCodEmp(rs.getString(1));
                e.setNomEmp(rs.getString(2));
                e.setAppEmp(rs.getString(3));
                e.setApmEmp(rs.getString(4));
                e.setDniEmp(rs.getString(5));
                e.setTelfEmp(rs.getString(6));
                e.setCodArea(rs.getInt(7));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return e;
    }
    
    public void actEmpleado(Empleados e) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "{call actEmpleado(?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement st = cn.prepareCall(sql);
            st.setString(1, e.getCodEmp());
            st.setString(2, e.getNomEmp());
            st.setString(3, e.getAppEmp());
            st.setString(4, e.getApmEmp());
            st.setString(5, e.getDniEmp());
            st.setString(6, e.getTelfEmp());
            st.setInt(7, e.getCodArea());
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
