/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.or.register;
import java.sql.*;

/**
 *
 * @author Sunil
 */
public class DbConnect {
    public static Connection getConnetion()
    {
     Connection cn =null;
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","password");
         // cn.setAutoCommit(true);
     }catch(Exception e){
      e.printStackTrace();
     }
     return cn;
    }
    /*public static void main(String []args)
    {
        Connection cn1=getConnetion();
        if(cn1!=null)
        {
          System.out.println("Connected");
        }else{
            System.err.println("Not Connected");
        }*/
    
    }

   /* static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    

