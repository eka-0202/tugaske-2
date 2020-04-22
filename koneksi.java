/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class koneksi {
    private Connection con;
    public Connection bukakoneksi(){
        try{
       
    Class.forName("com.mysql.jdbc.Driver");
    con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/tugas","root","");
    System.out.println("berhasil");
     return con;
}
   
   catch (ClassNotFoundException | SQLException e){
       System.out.println("gagal");
       return null;
}
}
public static void main (String args[]){
new koneksi().bukakoneksi();
}
}
