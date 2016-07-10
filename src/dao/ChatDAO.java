package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import dto.ChatDTO;
import util.MySQLConnector;

public class ChatDAO {

	public int insert(String name, String msgColor, String msg){
		int result = 0;

		Connection con = new MySQLConnector().getConnection();

		String sql = "INSERT INTO chat(msg_time, name, msg_color, msg)values(?, ?, ?, ?)";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String date = sdf.format(System.currentTimeMillis());

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, date);
			ps.setString(2, name);
			ps.setString(3, msgColor);
			ps.setString(4, msg);
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	public ArrayList<ChatDTO> select(){
		ArrayList<ChatDTO> list = new ArrayList<ChatDTO>();

		Connection con = new MySQLConnector().getConnection();

		String sql = "SELECT * FROM chat";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ChatDTO dto = new ChatDTO();
				dto.setId(rs.getInt("id"));
				dto.setMsgTime(rs.getString("msg_time"));
				dto.setName(rs.getString("name"));
				dto.setMsgColor(rs.getString("msg_color"));
				dto.setMsg(rs.getString("msg"));
				list.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return list;
	}
}
