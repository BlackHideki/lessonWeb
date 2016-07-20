package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.ChatRoomDAO;
import dto.ChatRoomDTO;

public class SelectChatRoomAction extends ActionSupport{

	/**
	 *
	 */
	private static final long serialVersionUID = 1675196882545119012L;

	private ArrayList<ChatRoomDTO> chatRoomList;

	private String errorMsg;

	public String execute(){
		String result = ERROR;

		chatRoomList = new ChatRoomDAO().select();

		if(chatRoomList.size() > 0){
			result = SUCCESS;
		}else{
			errorMsg = "チャットルームは存在しません";
		}
		return result;
	}

	public ArrayList<ChatRoomDTO> getChatRoomList() {
		return chatRoomList;
	}

	public void setChatRoomList(ArrayList<ChatRoomDTO> chatRoomList) {
		this.chatRoomList = chatRoomList;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
