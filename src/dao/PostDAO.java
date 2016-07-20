package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import dto.PostDTO;
import util.MySQLConnector;

public class PostDAO {

	public int insert(int id, String name, String msgColor, String msg){
		int result = 0;

		Connection conn = new MySQLConnector().getConnection();

		String sql = "INSERT INTO post(id, msg_time, name, msg_color, msg)values(?, ?, ?, ?)";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String date = sdf.format(System.currentTimeMillis());

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, date);
			ps.setString(3, name);
			ps.setString(4, msgColor);
			ps.setString(5, msg);
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

	public ArrayList<PostDTO> select(int id){
		ArrayList<PostDTO> list = new ArrayList<PostDTO>();

		Connection con = new MySQLConnector().getConnection();

		String sql = "SELECT * FROM post WHERE id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				PostDTO dto = new PostDTO();
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
