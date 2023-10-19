/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplicationmety;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author randr
 */
public class DatabaseConnection {
    private Connection con;
    private static DatabaseConnection dbc;
    private DatabaseConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gestionVoitures", "postgres", "1234");
            System.out.println("Database Connected");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static DatabaseConnection getDatabaseConnection(){
        if(dbc==null){
                dbc = new DatabaseConnection();
        }
        return dbc;
    }
    public  Connection getConnection(){
        return con;
    }  
//    public static void main(String[] args)
//    {
//        DatabaseConnection p = new DatabaseConnection();
//        p.getConnection();
//    }
}
