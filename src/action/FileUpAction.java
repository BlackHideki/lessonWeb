package action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class FileUpAction extends ActionSupport {

	/**
	 *
	 */
	private static final long serialVersionUID = -7178422655716037878L;

	public String file;

	public String resultMsg;

	public String execute(){
		String result = ERROR;
		String path = new File(".").getAbsoluteFile().getParent();
        System.out.println("currentdirectory = " + path);

		File file1 = new File(file);
		File file2 = new File("lessonWeb/WebContent/text/upload_1a6ba3c7_3f0c_4b11_9364_ddd9222c5020_00000000.tmp");
		try {
		    if (file1.renameTo(file2)) {
		    	resultMsg = "移動成功";
		        System.out.println("移動成功");
		    } else {
		    	resultMsg = "移動失敗";
		    	System.out.println("移動失敗");
		    }
		} catch (SecurityException e) {
		    System.out.println("例外が発生しました。");
		    System.out.println(e);
		} catch (NullPointerException e) {
		    System.out.println("例外が発生しました。");
		    System.out.println(e);
		}

		return result;
	}

}
