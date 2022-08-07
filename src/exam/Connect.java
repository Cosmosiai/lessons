package exam;

import java.sql.*;
import java.util.Scanner;

public class Connect {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "2003";
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
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
    public void newNews(){
        System.out.println("write title");
        scan.nextLine();
        String title =scan.nextLine();
        if (title.length()>100){
            System.out.println("too much letters. try new one");
            title=scan.nextLine();

        }
        System.out.println("text of news");

        String text = scan.nextLine();
        System.out.println("date dd-mm-yyyy");
        String date = scan.nextLine();
        String SQL = "INSERT INTO exam.news(title,news_text,pubdate) values ('"+title+"','"+text+"','"+date+"');";

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();) {
            stmt.executeUpdate(SQL);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        menu.menu();
    }

    public void deleteByID(){
        System.out.println("add id of news");
        int id=scan.nextInt();
        String SQL = "DELETE FROM exam.news WHERE id = "+id+";";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();) {
            stmt.executeUpdate(SQL);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        menu.menu();
    }

    public void showByID(){
        System.out.println("add id of news");
        int id=scan.nextInt();
        String SQL = "SELECT title, news_text FROM exam.news WHERE id = '"+id+"';";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            displayActor(rs);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        menu.menu();
    }


    private void displayActor(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString("title") + "\n"
                    + rs.getString("text") + "\n"
                    + rs.getString("date"));

        }
        menu.menu();
    }

    public void changeNews(){
        System.out.println("add id of news");
        int id=scan.nextInt();
        System.out.println("new title");
        scan.nextLine();
        String title = scan.nextLine();
        System.out.println("new text");
        String text = scan.nextLine();
        String SQL = "UPDATE exam.news set title = '"+title+"', news_text='"+text+"' where id = '"+id+"';";


        try (Connection conn = connect();
             Statement stmt = conn.createStatement();) {
            System.out.println(stmt.executeUpdate(SQL));
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        menu.menu();
    }

}

