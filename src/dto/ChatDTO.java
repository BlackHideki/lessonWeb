package dto;

public class ChatDTO {

	private int id;

	private String msgTime;

	private String name;

	private String msgColor;

	private String msg;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return msgTime
	 */
	public String getMsgTime() {
		return msgTime;
	}

	/**
	 * @param msgTime セットする msgTime
	 */
	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return msgColor
	 */
	public String getMsgColor() {
		return msgColor;
	}

	/**
	 * @param msgColor セットする msgColor
	 */
	public void setMsgColor(String msgColor) {
		this.msgColor = msgColor;
	}

	/**
	 * @return msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg セットする msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
