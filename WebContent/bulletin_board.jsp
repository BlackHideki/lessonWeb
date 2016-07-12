<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css読み込み -->
<link rel="stylesheet" href="css/bulletin_board.css"/>

<!-- jQuery読み込み -->
<script src="js/jquery-3.0.0.min.js"></script>

<!-- js読み込み -->
<script src="js/bulletin_board.js"></script>
<title>掲示板 | lessonWeb</title>
</head>
<body>
<s:hidden id="postListSize" name="postList.size()"/>
<h1>チャットルーム</h1>
<div id="main">
<fieldset>
	<s:if test="errorMsg == null">
		<table>
			<s:iterator value="postList">
				<tr>
					<th class="post">
						<s:hidden class="msgColor" name="msgColor"/>
						<p><s:property value="msgTime"/>　<s:property value="name"/>様&nbsp;：&emsp;<s:property value="msg"/></p>
					</th>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	<s:else>
		<s:property value="errorMsg"/>
	</s:else>
</fieldset>

<fieldset>
	<s:form action="InsertPost">
		<p>名前<p>
		<p><s:textfield name="name"/></p>
		<p>内容</p>
		<p><s:textarea cols="30" rows="10" name="msg"/></p>
		<p>
			<span id="black">■</span><span id="red">■</span><span id="green">■</span>
		</p>
		<s:hidden id="pushMsgColor" name="pushMsgColor"/>
		<p><s:submit value="送信"/></p>
	</s:form>
	<a href="<s:url action="SelectPost"/>"><button id="update">更新</button></a>
</fieldset>
</div>
</body>
</html>