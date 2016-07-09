<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css読み込み -->
<link rel="stylesheet" href="css/top.css"/>
<title>Top | lessonWeb</title>
</head>
<body>
<h1>チャットルーム</h1>
<div id="main">
	<fieldset>
	<p>名前<p>
	<p><s:textfield name="name"/></p>
	<p>内容</p>
	<p><s:textarea cols="30" rows="10" name="msg"/></p>
	</fieldset>
</div>
</body>
</html>