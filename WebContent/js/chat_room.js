$(function(){
	var chatListSize = $("#chatListSize").val();

	var msgColor = $(".msgColor");

	var blackBtn = $("#black");

	var redBtn = $("#red");

	var greenBtn = $("#green");

	var chat = $(".chat");

	var pushMsgColor = $("#pushMsgColor");

	var updateBtn = $("#updateBtn");

	var init = "■";

	var choice = "□";

	pushMsgColor.val("black");

	blackBtn.text(choice);

	for(var i = 0; i < chatListSize; i++){
		if(msgColor.eq(i).val() == "black"){
			chat.eq(i).css("color", "black");
		}else if(msgColor.eq(i).val() == "red"){
			chat.eq(i).css("color", "red");
		}else{
			chat.eq(i).css("color", "green");
		}
	}

	blackBtn.click(function(){
		blackBtnPush();
		if(blackBtn.text() == init){
			blackBtn.text(choice);
			pushMsgColor.val("black");
		}else{
			blackBtn.text(init);
		}
	});

	redBtn.click(function(){
		redBtnPush();
		if(redBtn.text() == init){
			redBtn.text(choice);
			pushMsgColor.val("red");
		}else{
			redBtn.text(init);
		}
	});

	greenBtn.click(function(){
		greenBtnPush();
		if(greenBtn.text() == init){
			greenBtn.text(choice);
			pushMsgColor.val("green");
		}else{
			greenBtn.text(init);
		}
	});

	function blackBtnPush(){
		redBtn.text(init);
		greenBtn.text(init);
	}

	function redBtnPush(){
		blackBtn.text(init);
		greenBtn.text(init);
	}

	function greenBtnPush(){
		blackBtn.text(init);
		redBtn.text(init);
	}


});