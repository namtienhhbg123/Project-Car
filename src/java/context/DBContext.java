/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class DBContext {
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    
    /*Insert your other code right after this comment*/
   
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "localhost";
    private final String dbName = "CarWeb";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "sa";
    
    
    public static void main(String[] args) {
         try {
             Connection conn = new DBContext().getConnection();
             if(conn!=null){
                 System.out.println("Connect successfuly");
             }else{
                 System.out.println("Connect falied");
             }
         } catch (Exception ex) {
             System.out.println("Some thing when wrong");
         }
    }
}
