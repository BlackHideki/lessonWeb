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

	/**
	 *
	 */
	private static final long serialVersionUID = 4666537185685793021L;

	private ArrayList<PostDTO> postList;

	private int id;

	private String errorMsg;

	public String execute(){
		PostDAO dao = new PostDAO();
		postList = dao.select(id);

		if(postList.size() == 0){
			errorMsg = "チャット内容がありません";
		}

		return SUCCESS;
	}

	public ArrayList<PostDTO> getPostList() {
		return postList;
	}

	public void setPostList(ArrayList<PostDTO> postList) {
		this.postList = postList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
