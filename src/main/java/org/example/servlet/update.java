package org.example.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class update {
    static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Bhargav@2418");
            System.out.println("Connected to database successfully");
            Statement st=con.createStatement();
            String sql="update cse set marks=50 where id=101";
            PreparedStatement pst=con.prepareStatement(sql);
            int rows = pst.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Data updated successfully");
            } else {
                System.out.println("No record found with ID 101");
            }

            st.close();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
