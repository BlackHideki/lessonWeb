package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.PostDAO;
import dto.PostDTO;

/**
 * InsertChatAction
 * チャット内容の送信する為のクラス
 * @author HIDEKI KUDO
 * @since 2016/07/10
 * @version 1.0
 */
public class SelectPostAction extends ActionSupport {

	public ArrayList<PostDTO> postList;

	public String errorMsg;

	public String execute(){
		PostDAO dao = new PostDAO();
		postList = dao.select();

		if(postList.size() == 0){
			errorMsg = "チャット内容がありません";
		}

		return SUCCESS;
	}
}
