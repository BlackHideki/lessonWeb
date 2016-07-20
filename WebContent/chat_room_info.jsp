<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css読み込み -->
<link rel="stylesheet" href="css/chat_room_info.css"/>
<link rel="stylesheet" href="css/modal.css"/>

<!-- js読み込み -->
<script src="js/jquery-3.0.0.min.js"></script>
<script src="js/jquery.leanModal.min.js"></script>
<script src="js/Modal.js"></script>
<title>チャットルーム案内 | lessonWeb</title>
</head>
<body>
<h1>チャットルーム一覧表</h1>
<table>
    <tr>
        <th>部屋名</th><th>削除</th><th>状態</th>
    </tr>
    <s:iterator value="chatRoomList">
    <tr>
    	<s:hidden name="id" value="%{id}"/>
        <td><s:property value="name"/></td><td><a href="<s:url action="DeleteChatRoom"/>"><button>削除</button></a></td><td><a href="<s:url action="SelectPost"/>"><button>入室</button></a></td>
    </tr>
    </s:iterator>
</table>
<h3 id="errorMsg"><s:property value="errorMsg"/></h3>
<p id="createChatRoomBtn"><a rel="leanModal" href="#div787"><s:submit value="チャットルーム作成"/></a></p>
<div id="div787">
	<h2>チャットルーム名</h2>
	<s:form action="CreateChatRoom">
		<s:textfield name="name" required="required"/>
		<s:submit value="作成"/>
	</s:form>
</div>
</body>
</html>