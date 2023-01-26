package lab6.q1;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class q1_ans {//Student Registration form
    private static Scanner sc = new Scanner(System.in);
    public static void print_from_database(Statement s) throws SQLException {
        String selectQuery = "select * from `student`";
        ResultSet rs;
        rs = s.executeQuery(selectQuery);
        System.out.println("Printing the Information from Database");
        while (rs.next()) {
            System.out.println("........................");
            System.out.println("Auto id: " + rs.getInt(1));
            System.out.println("First Name: " + rs.getString(2));
            System.out.println("Last Name: " + rs.getString(3));
            System.out.println("Branch: " + rs.getString(4));
            System.out.println("Username: " + rs.getString(5));
            System.out.println("Password: " + rs.getString(6));
        }
    }
    public static void Insert_in_database(Statement s) throws SQLException{
        System.out.println("Insertion of a Row Started....\nGive proper Inputs");

        try {
            System.out.println("Enter the First Name");
            String fname = sc.nextLine();
            System.out.println("Enter the Last Name");
            String lname = sc.nextLine();
            System.out.println("Enter the Branch");
            String branch = sc.nextLine();
            System.out.println("Enter the Username");
            String username = sc.nextLine();
            System.out.println("Enter the password");
            String password = sc.nextLine();
            String insertQuery = "INSERT INTO `student` VALUES("+ fname +","+ lname +"," +
                    ""+ branch +","+ username +","+ password +")";
			s.executeUpdate(insertQuery);
			System.out.println("row inserted, the given auto id to student is: "+);
        }
        catch (Exception e){
            System.out.println("Unknown Error occurred");
            e.printStackTrace();
        }
    }
    public static void Update_in_database(Statement s) throws SQLException{

    }
    public static void Delete_from_database(Statement s) throws SQLException{

    }
    public static void main(String args[]) {
        //setting up database
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student-registration", "root", "")) {
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            //initially showing information already present in database
            print_from_database(s);

            //Giving User to choose the option for manipulation of data

            System.out.println("Give your key according to choice.");
            System.out.println("Insert a Row.: 1");
            System.out.println("Update a Row.: 2");
            System.out.println("Delete a Row.: 3");
            System.out.println("Multiple Insertion.: 4");

            String insertQuery = "INSERT INTO `student`(`name`, `dob`,`city`)VALUES('sonal mehta', '"  + "', 'Nadiad' )";
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
            String deleteQuery = "DELETE FROM `student` WHERE `id`=3";
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
        }
    }
}