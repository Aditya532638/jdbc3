package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {

    public static void main(String args[]) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","12345678");

        PreparedStatement pr=con.prepareStatement("delete from student where id='"+1+"'");

        int i=pr.executeUpdate();

        if(i>0){
            System.out.println("Data deleted");
        }
        else{
            System.out.println("error");
        }

    }
}
