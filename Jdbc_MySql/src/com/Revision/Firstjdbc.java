package com.Revision;
import java.sql.*;

public class Firstjdbc {
    public static void main(String[] args){
        //0. write code in try catch or use throws

        try{
        //1. Loading class dynamically //com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        //2. Making connection with database
            Connection con = DriverManager.getConnection("jdbc:mysql:///revision","root","root");
        //3. Creating Statement to run query
            Statement s = con.createStatement();
        //4. Running query on statement
            s.executeUpdate("insert into accounts values('monukd','Monu Kumar','admin','What colour is yours?','nhi hai')");
        }catch(Exception e){
            e.printStackTrace();
        }



    }
}
