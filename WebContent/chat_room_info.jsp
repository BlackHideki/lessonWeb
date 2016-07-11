<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css読み込み -->
<link rel="stylesheet" href="css/chat_room_info.css"/>
<title>チャットルーム一覧 | lessonWeb</title>
</head>
<body>
<h1>チャットルーム一覧表</h1>
<table>
    <tr>
        <th>部屋名</th><th>コメント</th><th>人数</th><th>削除</th><th>状態</th>
    </tr>
    <tr>
        <td>テスト</td><td>テスト</td><td>テスト</td><td><a href="<s:url action="SelectChat"/>"><button>削除</button></a></td><td><a href="<s:url action="SelectChat"/>"><button>入室</button></a></td>
    </tr>
</table>
</body>
</html>