// JavaScript Document
//共用js,Author:ChenCixu

$(function(){
 	//列表斑马线
	$(".list_s tr,.record_list li,.price_history li,.auction_lobby2 li").mouseover(function(){ 
		 $(this).addClass("on_color");}).mouseout(function(){ 
		 $(this).removeClass("on_color");
	}); 
	$(".list_s tr:even,.record_list li:even,.price_history li:even,.auction_lobby2 li:even").addClass("over_color");
	$(".pro_list dl").hover(function(){
				$(this).addClass("on_color")
				}, function(){
					$(this).removeClass("on_color")
			});
	$(".pro_list dl:even").addClass("over_color");
	
	$(".price_history2 li:odd").addClass("over_color"); 

	
	$(".img_pic").hover(function(){
				$(this).children('.img_info').animate({bottom:'0px'}, 300)
				}, function(){
					$(this).children('.img_info').animate({bottom:'-70px'}, 300)
			});
	$(".pic li").hover(function(){
				$(this).find('.pic_info').animate({bottom:'0px'}, 300)
				}, function(){
					$(this).find('.pic_info').animate({bottom:'-45px'}, 300)
			});
	//输入框
            $("#login .input_text").each(function () {
                var thisVal = $(this).val();
                //判断文本框的值是否为空，有值的情况就隐藏提示语，没有值就显示
                if (thisVal != "") {
                    $(this).siblings("span").hide();
                } else {
                    $(this).siblings("span").show();
                }
                //聚焦型输入框验证 
                $(this).focus(function () {
                    $(this).siblings("span").hide();
                }).blur(function () {
                    var val = $(this).val();
                    if (val != "") {
                        $(this).siblings("span").hide();
                    } else {
                        $(this).siblings("span").show();
                    }
                });
            })
 });