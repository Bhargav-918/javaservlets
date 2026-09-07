package org.example.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insert {
    static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Bhargav@2418");
            System.out.println("Connected to database successfully");
            Statement st=con.createStatement();
            String sql="insert into cse(id,name,marks) values (?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,101);
            pst.setString(2,"Bhargav");
            pst.setInt(3,45);
            int rows=pst.executeUpdate();
            if(rows>0){
                System.out.println("inserted successfully");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
