package lessons.lesson40;

import java.sql.*;

public class Connect {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "2003";

    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("db successfully connected");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public int getCoachCount(){
        String SQL = "SELECT count(*) FROM lessons.coach;";
        int count = 0;

        try (
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            count = rs.getInt(1);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }
}
