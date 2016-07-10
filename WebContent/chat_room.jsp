<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css読み込み -->
<link rel="stylesheet" href="css/chat_room.css"/>

<!-- jQuery読み込み -->
<script src="js/jquery-3.0.0.min.js"></script>

<!-- js読み込み -->
<script src="js/chat_room.js"></script>
<title>Top | lessonWeb</title>
</head>
<body>
<h1>チャットルーム</h1>
<div id="main">
<fieldset>
	<s:if test="errorMsg == null">
		<table>
			<s:iterator value="chatList">
				<tr>
					<th><s:property value="msgTime"/>　<s:property value="name"/>様</th>
				</tr>
				<tr>
					<td><s:property value="msgTime"/></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	<s:else>
		<s:property value="errorMsg"/>
	</s:else>
</fieldset>

<fieldset>
	<s:form action="InsertChat">
		<p>名前<p>
		<p><s:textfield name="name"/></p>
		<p>内容</p>
		<p><s:textarea cols="30" rows="10" name="msg"/></p>
		<p>
			<span id="black">■</span><span id="red">■</span><span id="green">■</span>
		</p>
		<s:hidden id="msgColor" name="msgColor"/>
		<p><s:submit value="送信"/></p>
	</s:form>
	<a href="<s:url action="SelectChat"/>"><button>更新</button></a>
</fieldset>
</div>
</body>
</html>