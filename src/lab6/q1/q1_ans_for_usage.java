package lab6.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class q1_ans_for_usage {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student-registration", "root", "")){

            ResultSet rs = con.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
