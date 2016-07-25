package action;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {

	/**
	 *
	 */
	private static final long serialVersionUID = -4675197887580564459L;

	/**
	 * 検索内容
	 */
	private String searchText;

	/**
	 * 実行メソッド
	 */
	public String execute(){
		return SUCCESS;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
}
