$(function(){
	// 検索内容
	var searchText = $("#hidden").val();

	// 検索結果を表示させるコンテナを変数に格納
	var main = $("#main");

	// 検索結果に該当したデータがあるかどうか
	var searchFlg = false;

	// 検索した内容を表示しかたどうか
	var searchTextViewFlg = false;

	// jspの名前を配列に格納
	var jspNameArray = ["a", "b"];

	// jspのテキストを配列に格納
	var jspTextArray = [];

	// 配列に格納されたjspの名前の数だけjspを読み込む
	for(var i = 0; i < jspNameArray.length; i++){
		$.ajax({
			type: 'GET',
			url: jspNameArray[i] + '.jsp',
			dataType: 'html',
			success: function(data){
				jspTextArray.push($(data).filter("#main").text());
			}
		});
	}

	// 読み込みが終了したら呼び出される関数
	$(document).ajaxStop(function (){
		// 配列に格納されたjspの名前の数だけ検索内容の文字列が含まれているか調べる
		for(var i = 0; i < jspNameArray.length; i++){

			// 含まれていたらaタグにしてコンテナに追加
			if(jspTextArray[i].indexOf(searchText) != -1){
				if(!searchFlg){
					searchFlg = true;
				}

				if(!searchTextViewFlg){
					searchTextViewFlg = true;
					main.append(searchText + "の検索結果");
				}
				main.append('<p><a href="' +  jspNameArray[i] + '.jsp">'+ jspNameArray[i] +'</a></p>');
			}
		}

		// 検索内容の文字列が何も含まれていなかった場合のエラーメッセージ
		if(!searchFlg){
			main.text(searchText + "に一致する情報は見つかりませんでした。");
		}
	});
});