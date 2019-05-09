/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cohortes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Chachou
 */
public class ConnectBD {
    
    static Connexion cnx;
    static Statement st;
    static ResultSet rst;
    
    
    public static void main (String args[]) 
    {
        System.out.println("bonjur");
        ConnectDb();
  
    }
    
    private static Connection ConnectDb()
    {
        try{
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@iutdoua-oracle.univ-lyon1.fr:1521:orcl","p1812282","375141");
            System.out.println("ConnexionReussi");
            return con;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
                  System.out.println("ECHEC");
        }
        return null;
        
    }
}
