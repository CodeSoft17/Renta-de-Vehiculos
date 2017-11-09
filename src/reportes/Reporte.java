/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;
import conexion.Conexion;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author ULISES
 */
public class Reporte {
    public String generarReporte(){
        Conexion con = new Conexion();
        Connection cn;
        String  resul = null;
        try{
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(),con.getUsuario(), con.getClave());
            JasperReport rp = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reporteCliente.jasper"));
            JasperPrint pr = JasperFillManager.fillReport(rp,null,cn);
            JasperViewer view = new JasperViewer(pr);
            view.setVisible(true);
            resul="Reporte enerado exitosamente";
        }catch(Exception e){
            resul = e.toString();
        }
        return resul;
    }
}
