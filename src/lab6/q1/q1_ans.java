package lab6.q1;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class q1_ans {
    public static void main(String args[]) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbctry", "root", "")) {
            Statement s;
            s = con.createStatement();
            String date = "2021-01-01";

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            java.util.Date dateStr = formatter.parse(date);
            java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());
            String insertQuery = "INSERT INTO `student1`(`name`, `dob`,`city`)VALUES('sonal mehta', '" + dateDB + "', 'Nadiad' )";
            int i = s.executeUpdate(insertQuery);
            System.out.println(i + "rows inserted");
            String selectQuery = "select * from `student`";
            ResultSet rs;
            rs = s.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("........................");
                System.out.println("Auto id: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("DoB: " + rs.getDate(3));
                System.out.println("City: " + rs.getString(4));
            }
            String updateQuery = "UPDATE `student1` SET `city`='Anand' WHERE `id`=1 ";

            int u = s.executeUpdate(updateQuery);
            System.out.println(u + "rows updated");
            rs = s.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("........................");
                System.out.println("Auto id: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("DoB: " + rs.getDate(3));
                System.out.println("City: " + rs.getString(4));
            }
            String deleteQuery = "DELETE FROM `student1` WHERE `id`=3";
            int d = s.executeUpdate(deleteQuery);
            System.out.println(d + "rows deleted");

            rs = s.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("........................");
                System.out.println("Auto id: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("DoB: " + rs.getDate(3));
                System.out.println("City: " + rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
}