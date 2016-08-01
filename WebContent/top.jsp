<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css読み込み -->
<link rel="stylesheet" href="css/top.css">
<title>トップ | lessonWeb</title>
</head>
<body>
<h1>トップ</h1>
<s:form action="Search">
<p><s:textfield name="searchText"/><s:submit value="検索"/></p>
</s:form>

<p><a href="<s:url action="SelectChatRoom"/>"><button>チャットルーム一覧へ</button></a></p>

<s:form action="FileUp" method="post" enctype="multipart/form-data">
	<p><s:file name="file"/><p>
	<p><s:submit value="送信"/></p>
</s:form>
<s:property value="resultMsg"/>
</body>
</html>