package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
	    Connection conn = null;
	    try {
	        conn = DriverManager.getConnection("jdbc:sqlite:/sample/sample.db");
	        
	        final String sql = "SELECT name FROM hoge WHERE id = ?";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
	            pstmt.setInt(1, 2);

	            try (ResultSet rs = pstmt.executeQuery()) {
	                if (rs.next()) {
	                    System.out.format("name：%s", rs.getString("name"));
	                }
	            }
	        }
	    } catch (SQLException se) {
	        System.out.println(se.getMessage());
	    } finally {
	        if (conn != null) {
	            try {
	                conn.close();
	            } catch (SQLException e) {
	            }
	        }
	    }

	    try {
	        conn = DriverManager.getConnection("jdbc:sqlite:/Users/admin/test.db");
	        
	        final String sql = "SELECT name FROM hoge WHERE id = ?";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
	            pstmt.setInt(1, 2);
	 
	            try (ResultSet rs = pstmt.executeQuery()) {
	                if (rs.next()) {
	                    System.out.format("name：%s", rs.getString("name"));
	                }
	            }
	        }
	    } catch (SQLException se) {
	        System.out.println(se.getMessage());
	    } finally {
	        if (conn != null) {
	            try {
	                conn.close();
	            } catch (SQLException e) {
	            }
	        }
	    }
	}
}

//	public static void main(String[] args) {
//		DriverManager
//		// TODO 自動生成されたメソッド・スタブ
//		System.out.println("相澤");
//		System.out.println("相澤");
//		System.out.println("アイウエオ");
//		System.out.println("５３さい");
//		System.out.println("お酒が好きです。");
//		System.out.println("相澤");
//		System.out.println("相澤");
//		System.out.println("相澤");		
//		System.out.println("31 + 31の計算をします");		
//		System.out.println(31 + 31);		
//		System.out.println(31 - 31);		
//		System.out.println(-5 * 2);		
//		System.out.println(6 * 6 * 3.14);		
////		System.out.println("答えは" - 31);		
//		System.out.println("答えは" + 64);		
//		System.out.println(31 - 31);	
//		int x;
//		x = 6;
//		int age;
//		age = 20;		
//		System.out.println(x * x * 3.14);
//		System.out.println("私は" + age + "歳");
//		System.out.println("私は" + age + "歳");
//		System.out.println("私は" + age + "歳");
//	}
//}
