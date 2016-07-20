package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.PostDAO;

/**
 * InsertPostAction
 * チャット内容の送信する為のクラス
 * @author HIDEKI KUDO
 * @since 2016/07/10
 * @version 1.0
 */
public class InsertPostAction extends ActionSupport {

	/**
	 *
	 */
	private static final long serialVersionUID = 3419628741932614525L;

	private int id;

	private String name;

	private String pushMsgColor;

	private String msg;

	private String errorMsg;

	public String execute(){
		String result = ERROR;

		if(name != null){
			if(name.equals("")){
				name = null;
			}
		}

		if(pushMsgColor != null){
			if(pushMsgColor.equals("")){
				pushMsgColor = null;
			}
		}

		if(msg != null){
			if(msg.equals("")){
				msg = null;
			}
		}

		if(new PostDAO().insert(id, name, pushMsgColor, msg) > 0){
			result = SUCCESS;
		}else{
			errorMsg = "送信に失敗しました";
		}
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPushMsgColor() {
		return pushMsgColor;
	}

	public void setPushMsgColor(String pushMsgColor) {
		this.pushMsgColor = pushMsgColor;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
