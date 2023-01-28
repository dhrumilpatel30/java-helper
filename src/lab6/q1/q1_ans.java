package lab6.q1;

import java.sql.*;
import java.text.*;
import java.util.Scanner;

public class q1_ans {//Student Registration form
    private static Scanner sc = new Scanner(System.in);
    public static void print_from_database(Connection con) throws SQLException {
        Statement s = con.createStatement();
        String selectQuery = "select * from `student`";
        ResultSet rs;
        rs = s.executeQuery(selectQuery);
        System.out.println("Printing the Information from Database");
        while (rs.next()) {
            System.out.println("........................");
            System.out.println("Auto id: " + rs.getInt(6));
            System.out.println("First Name: " + rs.getString(1));
            System.out.println("Last Name: " + rs.getString(2));
            System.out.println("Branch: " + rs.getString(3));
            System.out.println("Username: " + rs.getString(4));
            System.out.println("Password: " + rs.getString(5));
            System.out.println("........................");
        }
    }

    public static void Insert_in_database(Connection con) throws SQLException{
        System.out.println("\n\nInsertion of a Row Started....\nGive proper Inputs");

        try {
            System.out.print("Enter the First Name: ");
            String fname = sc.nextLine();
            System.out.print("Enter the Last Name: ");
            String lname = sc.nextLine();
            System.out.print("Enter the Branch: ");
            String branch = sc.nextLine();
            System.out.print("Enter the Username: ");
            String username = sc.nextLine();
            System.out.print("Enter the password: ");
            String password = sc.nextLine();
            PreparedStatement ps=con.prepareStatement("insert into student(`fname`, `lname`, `branch`, `username`, `password`) values(?,?,?,?,?)");
            ps.setString(1,fname);
            ps.setString(2,lname);
            ps.setString(3,branch);
            ps.setString(4,username);
            ps.setString(5,password);

			ps.executeUpdate();
            ps = con.prepareStatement("select * from student where username=?");
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            rs.next();
			System.out.println("row inserted, the given auto id to student is: "+rs.getInt(6));
        }
        catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.out.println("Try again with different Username please");
            Insert_in_database(con);
        }
        catch (Exception e){
            System.out.println("Unknown Error occurred");
            e.printStackTrace();
        }
    }

    public static void Update_in_database(Connection con) throws SQLException{
        System.out.print("Update of row started...\nEnter the id for update: ");
        int id = sc.nextInt();
        sc.nextLine();
        Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = s.executeQuery("select * from student where id="+id);
        System.out.println("Enter new Details..");
        rs.next();
        System.out.print("Enter the First Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter the Last Name: ");
        String lname = sc.nextLine();
        System.out.print("Enter the Branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter the Username: ");
        String username = sc.nextLine();
        System.out.print("Enter the password: ");
        String password = sc.nextLine();
        rs.updateString(1,fname);
        rs.updateString(2,lname);
        rs.updateString(3,branch);
        rs.updateString(4,username);
        rs.updateString(5,password);
        rs.updateRow();
        System.out.println("Row successfully updated..");
    }

    public static void Delete_from_database(Connection con) throws SQLException{
        System.out.print("Delete of row started...\nEnter the id for Delete");
        int id = sc.nextInt();
        sc.nextLine();
        Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = s.executeQuery("select * from student where id="+id);
        rs.absolute(id);
        rs.deleteRow();
        System.out.println("Row successfully deleted");
    }
    public static void selector(Connection con) throws SQLException {
        //Giving User to choose the option for manipulation of data
            System.out.println("Give your key according to choice.");
            System.out.println("View the data : 0");
            System.out.println("Insert a Row.: 1");
            System.out.println("Update a Row.: 2");
            System.out.println("Delete a Row.: 3");
            System.out.print("Multiple Insertion.: 4\nkey: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if(0 == choice)print_from_database(con);
            if(1 == choice)Insert_in_database(con);
            if(2 == choice)Update_in_database(con);
            if(3 == choice)Delete_from_database(con);
            if(4 == choice) {
                while (0 == choice--) {
                    Insert_in_database(con);
                }
            }
    }

    public static void main(String args[]) {
        //setting up database
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student-registration", "root", "")) {
            //initially showing information already present in database
            print_from_database(con);
            //starting selections
            selector(con);
            while(true){
                System.out.print("Do you want to exit (y/n): ");
                String s = sc.nextLine();
                if(s.equals("y"))break;
                selector(con);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}