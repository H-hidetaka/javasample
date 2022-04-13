package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void connect() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:C:/sqlite/JTP.db";
			conn = DriverManager.getConnection(url);
			
			System.out.println("Connection to SQLite has beem established.");
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		connect();
	}
}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Connect {
//    public static void main(String[] args) {
//
//        Connection connection = null;
//        Statement statement = null;
//
//        try {
//            Class.forName("org.sqlite.JDBC");
//
//            // データベースのPATHを指定。相対パスでも絶対パスでも行けるようです
//            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
//            statement = connection.createStatement();
//            String sql = "select * from table1";
//            ResultSet rs = statement.executeQuery(sql);
//            while (rs.next()) {
//                System.out.println(rs.getString(1));
//            }
//        } catch (ClassNotFoundException e) {
//          e.printStackTrace();
//        } catch (SQLException e) {
//          e.printStackTrace();
//        } finally {
//            try {
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}