package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.ChatDAO;
import dto.ChatDTO;

/**
 * InsertChatAction
 * チャット内容の送信する為のクラス
 * @author HIDEKI KUDO
 * @since 2016/07/10
 * @version 1.0
 */
public class SelectChatAction extends ActionSupport {

	public ArrayList<ChatDTO> chatList;

	public String errorMsg;

	public String execute(){
		ChatDAO dao = new ChatDAO();
		chatList = dao.select();

		if(chatList.size() == 0){
			errorMsg = "チャット内容がありません";
		}

		return SUCCESS;
	}
}
