package org.example.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class create {
    static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Bhargav@2418");
            System.out.println("Connected to database successfully");
            Statement st=con.createStatement();
            String sql="create table cseg(id int,name varchar(20),marks int,dept varchar(20))";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.executeUpdate(sql);
            System.out.println("Table created successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
