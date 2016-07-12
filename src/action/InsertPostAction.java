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

		PostDAO dao = new PostDAO();

		insertFlg = dao.insert(name, pushMsgColor, msg);

		if(insertFlg > 0){
			result = SUCCESS;
		}else{
			errorMsg = "送信に失敗しました";
		}
		return result;
	}
}
