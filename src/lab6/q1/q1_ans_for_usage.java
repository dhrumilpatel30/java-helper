package lab6.q1;

import java.sql.*;

public class q1_ans_for_usage {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student-registration", "root", "")){
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = s.executeQuery("select * from student");

//            q1_ans.print_from_database(con);

            rs.afterLast();//following will not work due to rs at end of dataset
            try{System.out.println(rs.getInt(6));}
            catch (Exception e){e.printStackTrace();}

            rs.beforeFirst();//following will not work due to rs at start of dataset not initialised
            try{System.out.println(rs.getInt(6));}
            catch (Exception e){e.printStackTrace();}

            rs.first();//will show id of first row
            try{System.out.println(rs.getInt(6));}
            catch (Exception e){e.printStackTrace();}

            System.out.println(rs.isFirst());

            System.out.println(rs.isLast());

            rs.last();
            try{System.out.println(rs.getInt(6));}
            catch (Exception e){e.printStackTrace();}

            rs.previous();
            try{System.out.println(rs.getInt(6));}
            catch (Exception e){e.printStackTrace();}

            rs.next();
            try{System.out.println(rs.getInt(6));}
            catch (Exception e){e.printStackTrace();}

            rs.relative(1);//shift row position
            try{System.out.println(rs.getInt(6));}
            catch (Exception e){e.printStackTrace();}

            //to view data in database
            q1_ans.print_from_database(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
