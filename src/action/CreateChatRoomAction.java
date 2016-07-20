package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ChatRoomDAO;

public class CreateChatRoomAction extends ActionSupport {

	/**
	 *
	 */
	private static final long serialVersionUID = 6438361306862753338L;

	private String name;

	private String errorMsg;

	public String execute(){
		String result = ERROR;

		if(new ChatRoomDAO().insert(name) > 0){
			result = SUCCESS;
		}else{
			errorMsg = "チャットルーム作成に失敗しました";
		}

		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
