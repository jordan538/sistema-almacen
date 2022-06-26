package dao;
import util.MySQLConexion;
import modelo.*; 
import java.util.*; 
import java.sql.*;

public class DaoProductos {
    public List<Productos> listaProducto(){ 
        List<Productos>lista=new ArrayList();   
        try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="select codProd, desProd, stockProd, umProd, fecProd from producto";
            PreparedStatement st=cn.prepareStatement(sql); 
            ResultSet rs=st.executeQuery(); 
            while(rs.next()){//leer filaxfila y pasarlo al arraylist 
            Productos p=new Productos(); 
            p.setCodProd(rs.getString(1));
            p.setDesProd(rs.getString(2));
            p.setStockProd(rs.getInt(3)); 
            p.setUmProd(rs.getString(4)); 
            p.setFecProd(rs.getString(5)); 
            lista.add(p); 
        } 
        }catch(Exception ex){ 
        ex.printStackTrace(); 
        }   
        return lista;    
    }
    
    public List<Productos> ListaProductosFiltro(String termino) {
        List<Productos> lista = new ArrayList<>();
        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "select codProd ,desProd, stockProd, umProd, fecProd "
                    + "from producto "
                    + "where desProd like ? ";
                    //+ "order by desProd";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, "%" + termino + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Productos p = new Productos();
                p.setCodProd(rs.getString(1));
                p.setDesProd(rs.getString(2));
                p.setStockProd(rs.getInt(3)); 
                p.setUmProd(rs.getString(4)); 
                p.setFecProd(rs.getString(5)); 
                lista.add(p);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
     public void AgregarProducto(Productos p) {
        Connection cn = MySQLConexion.getConexion();
        try {
            //String sql="insert into producto(desProd, stockProd, umProd, fecProd) values(?,?,?,?)"; 
            //PreparedStatement st=cn.prepareStatement(sql); 
            String sql="{call ProdAdicion(?,?,?,?)}";  
            CallableStatement st=cn.prepareCall(sql);
            //st.setInt(1, p.getCodProd());
            st.setString(1, p.getDesProd());
            st.setInt(2, p.getStockProd());
            st.setString(3, p.getUmProd());
            st.setString(4, p.getFecProd());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
     public Productos ConsultaProducto(String nro){
        Productos p=null;
        try{
            Connection cn=MySQLConexion.getConexion();
            String sql="select codProd, desProd, stockProd, umProd, fecProd from producto where codProd=?";
            //codigo para saber llamar iner join a partir de ante del where el iiner
            //SELECT producto.codProd, producto.desProd, producto.stockProd, producto.codLoca, producto.umProd, categoria.Nombre as catNombre FROM producto inner join categoria on categoria.idCat = producto.idCat where producto.codProd = 1;
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, nro);
            ResultSet rs=st.executeQuery();
        if(rs.next()){
            p=new Productos();
            p.setCodProd(rs.getString(1));
            p.setDesProd(rs.getString(2));
            p.setStockProd(rs.getInt(3)); 
            p.setUmProd(rs.getString(4)); 
            p.setFecProd(rs.getString(5)); 
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return p;
    }
    
     public void ModificaProducto(Productos p){ 
        try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="update producto set desProd=?, stockProd=?, umProd=?, fecProd=? where codProd=?"; 
            //String sql="update ventas set cliente=?, tipdep=?, tanos=? where nrovent=?"; 
            PreparedStatement st=cn.prepareStatement(sql); 
            //relacione cada ? con su valor 
            st.setString(1, p.getDesProd());
            st.setInt(2, p.getStockProd());
            st.setString(3, p.getUmProd());
            st.setString(4, p.getFecProd());
            st.executeUpdate(); 
        }catch(Exception ex){ 
            ex.printStackTrace(); 
        }     
    }
    
    public void BorrarProducto(String id){ 
        try{ 
            Connection cn=MySQLConexion.getConexion(); 
            String sql="delete from producto where codProd=?"; 
            PreparedStatement st=cn.prepareStatement(sql); 
            st.setString(1, id); 
            st.executeUpdate(); 
        }catch(Exception ex){ 
            ex.printStackTrace(); 
        }     
    }
}
