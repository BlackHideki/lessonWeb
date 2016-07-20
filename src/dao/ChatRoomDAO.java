package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.ChatRoomDTO;
import util.MySQLConnector;

public class ChatRoomDAO {

	public ArrayList<ChatRoomDTO> select(){
		ArrayList<ChatRoomDTO> list = new ArrayList<ChatRoomDTO>();

		Connection conn = new MySQLConnector().getConnection();

		String sql = "SELECT * FROM chat_room";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ChatRoomDTO dto = new ChatRoomDTO();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				list.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return list;
	}

	public int insert(String name){
		int result = 0;

		Connection conn = new MySQLConnector().getConnection();

		String sql = "INSERT INTO chat_room(name)VALUES(?)";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return result;
	}


	public int delete(int id){
		int result = 0;

		Connection conn = new MySQLConnector().getConnection();

		String sql = "DELETE FROM chat_room WHERE id=?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return result;
	}
}
