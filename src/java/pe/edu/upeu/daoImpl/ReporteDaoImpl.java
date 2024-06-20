
package pe.edu.upeu.daoImpl;

import pe.edu.upeu.dao.ReporteDao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import pe.edu.upeu.config.Conexion;
/**
 *
 * @author ProfCisco
 */
public class ReporteDaoImpl implements ReporteDao {
private PreparedStatement ps;
private ResultSet rs;
private Connection cx= null;
    @Override
    public Map<String, Integer> readAllReporte() {
        Map<String, Integer> map = new LinkedHashMap<>(); 
        String SQL= "SELECT *FROM reporte";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){ 
                String esc = rs.getString("escuela");
                Integer cant = rs.getInt("cantidad");
                map.put(esc,cant);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        
        return map;
    }
    
}
