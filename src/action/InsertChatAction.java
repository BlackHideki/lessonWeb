package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ChatDAO;

/**
 * InsertChatAction
 * チャット内容の送信する為のクラス
 * @author HIDEKI KUDO
 * @since 2016/07/10
 * @version 1.0
 */
public class InsertChatAction extends ActionSupport {

	public String name;

	public String pushMsgColor;

	public String msg;

	public String errorMsg;

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

		int insertFlg = 0;

		ChatDAO dao = new ChatDAO();

		insertFlg = dao.insert(name, pushMsgColor, msg);

		if(insertFlg > 0){
			result = SUCCESS;
		}else{
			errorMsg = "送信に失敗しました";
		}
		return result;
	}
}
