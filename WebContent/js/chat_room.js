$(function(){
	var blackBtn = $("#black");

	var redBtn = $("#red");

	var greenBtn = $("#green");

	var msgColor = $("#msgColor");

	var init = "■";

	var choice = "□";

	blackBtn.click(function(){
		if(blackBtn.text() == init){
			blackBtn.text(choice);
		}else{
			blackBtn.text(init);
		}
	});

	redBtn.click(function(){
		if(redBtn.text() == init){
			redBtn.text(choice);
		}else{
			redBtn.text(init);
		}
	});

	greenBtn.click(function(){
		if(greenBtn.text() == init){
			greenBtn.text(choice);
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