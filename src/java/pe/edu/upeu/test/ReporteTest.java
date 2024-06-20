/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.test;

import com.google.gson.Gson;
import pe.edu.upeu.dao.ReporteDao;
import pe.edu.upeu.daoImpl.ReporteDaoImpl;

/**
 *
 * @author ProfCisco
 */
public class ReporteTest {
private static ReporteDao rdao = new ReporteDaoImpl();
private static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(g.toJson(rdao.readAllReporte()));
    }
    
}
