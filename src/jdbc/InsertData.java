package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String args[]) throws Exception, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mySql://localhost:3306/studentmanagement","root","12345678");

        System.out.println("Connection created succesfully");

        int id=3;
        String department="Civil";
        String email="adityac@gmail.com";
        String first_name="jan";
        String last_name="Dev";

        PreparedStatement pr=con.prepareStatement("insert into student values ('"+id+"','"+department+"','"+email+"','"+first_name+"','"+last_name+"')");

        int i=pr.executeUpdate();

        if(i>0){

            System.out.println("Data inserted succesfuly");
        }else{
            System.out.println("error");
        }

    }
}
