package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","12345678");

        System.out.println("Connection created");

        int id=2;
        String dep="CSE";

        PreparedStatement pr= con.prepareStatement("update student set department='"+dep+"'where id='"+id+"'");

        int i=pr.executeUpdate();

        if(i>0){
            System.out.println("data updated");
        }
        else {
            System.out.println("error");
        }
    }
}
