package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ChatRoomDAO;

public class DeleteChatRoomAction extends ActionSupport{

	/**
	 *
	 */
	private static final long serialVersionUID = 8690787898319224110L;

	/**
	 *
	 */
	private int id;

	private String errorMsg;

	public String execute(){
		String result = ERROR;

		if(new ChatRoomDAO().delete(id) > 0){
			result = SUCCESS;
		}else{
			errorMsg = "削除に失敗しました";
		}

		return result;
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
