package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShowData {
    public static void main(String[] args)throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","12345678");

        System.out.println("connection created");

        PreparedStatement pr=con.prepareStatement("select * from student");

        ResultSet rs =pr.executeQuery();
        System.out.print("Id");
        System.out.print("  ");
        System.out.print("Department");
        System.out.print("    ");
        System.out.print("email");
        System.out.print("  ");
        System.out.print("first_name");
        System.out.print("    ");
        System.out.println("last_name");

        while (rs.next()){
            int id=rs.getInt("id");
            String dept=rs.getString("department");
            String email=rs.getString("email");
            String f_name=rs.getString("first_name");
            String l_name=rs.getString("last_name");

            System.out.print(id);
            System.out.print("   ");
            System.out.print(dept);
            System.out.print("    ");
            System.out.print(email);
            System.out.print("  ");
            System.out.print(f_name);
            System.out.print("      ");
            System.out.println(l_name);




        }
    }
}
