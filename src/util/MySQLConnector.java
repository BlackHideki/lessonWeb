package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {

	/**
	 * 取得メソッド
	 * MySQLに接続する為のコネクションを取得
	 * @author HIDEKI KUDO
	 * @return con 取得するコネクション
	 */
	public Connection getConnection(){
		String driverName = "com.mysql.jdbc.Driver";

		String url = "jdbc:mysql://localhost/lesson_web";

		String user = "root";

		String pass = "mysql";

		Connection con = null;

		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,pass);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
