$(function($) {
    //窗口大小
	var headerH = $("#header-navbar").height();
	var toolbarH = $(".fixed-top").height();
	var resizeMainContent = function()
    {
		
		var contentH = $(window).height() - headerH;
		var sidebarH = $(window).height() - headerH;
		var formH = $(window).height() - headerH ;
		$(".sidebar-flow").css('height', formH);
		//$('.main_body').css('height', contentH);
		//$('#mod_col_form').css('height', formH);
		
    };
    resizeMainContent();
    $(window).resize(resizeMainContent);
	$('.fixed-top').stalker({
		stalkerStyle:'fixed-toolbar-bottom'
		});
	$('.sidebar-flow').stalker({
		offset:90
		});
	$('input[data-toggle=tooltip]').mouseover(function() {  $(this).tooltip('show');   });
	$('a[data-toggle=popover]').click(function() {  $(this).popover('show');   }) 
	setTimeout(function() {
        $('#content-wrapper > .row').css({
            opacity: 1
        });
    },
    200);
    $('#sidebar-nav .dropdown-toggle').on('click',
    function(e) {
        e.preventDefault();
        var $item = $(this).parent();
        if (!$item.hasClass('open')) {
            $item.parent().find('.open .submenu').slideUp('fast');
            $item.parent().find('.open').toggleClass('open');
        }
        $item.toggleClass('open');
        if ($item.hasClass('open')) {
            $item.children('.submenu').slideDown('fast');
        } else {
            $item.children('.submenu').slideUp('fast');
        }
    });
    $('body').on('mouseenter', '#page-wrapper.nav-small #sidebar-nav .dropdown-toggle',
    function(e) {
        var $sidebar = $(this).parents('#sidebar-nav');
        if ($(document).width() >= 992) {
            var $item = $(this).parent();
            $item.addClass('open');
            $item.children('.submenu').slideDown('fast');
        }
    });
    $('body').on('mouseleave', '#page-wrapper.nav-small #sidebar-nav > .nav-pills > li',
    function(e) {
        var $sidebar = $(this).parents('#sidebar-nav');
        if ($(document).width() >= 992) {
            var $item = $(this);
            if ($item.hasClass('open')) {
                $item.find('.open .submenu').slideUp('fast');
                $item.find('.open').removeClass('open');
                $item.children('.submenu').slideUp('fast');
            }
            $item.removeClass('open');
        }
    });
    $('#make-small-nav').click(function(e) {
        $('#page-wrapper').toggleClass('nav-small');
    });
    $(window).smartresize(function() {
        if ($(document).width() <= 991) {
            $('#page-wrapper').removeClass('nav-small');
        }
    });
    $('.mobile-search').click(function(e) {
        e.preventDefault();
        $('.mobile-search').addClass('active');
        $('.mobile-search form input.form-control').focus();
    });
    $(document).mouseup(function(e) {
        var container = $('.mobile-search');
        if (!container.is(e.target) && container.has(e.target).length === 0) {
            container.removeClass('active');
        }
    });
    /*$('.fixed-leftmenu #col-left').nanoScroller({
        alwaysVisible: true,
        iOSNativeScrolling: false,
        preventPageScrolling: true,
        contentClass: 'col-left-nano-content'
    });*/
	$("html,#col-left").niceScroll();
    $("[data-toggle='tooltip']").each(function(index, el) {
        $(el).tooltip({
            placement: $(this).data("placement") || 'top'
        });
    });
});
$.fn.removeClassPrefix = function(prefix) {
    this.each(function(i, el) {
        var classes = el.className.split(" ").filter(function(c) {
            return c.lastIndexOf(prefix, 0) !== 0;
        });
        el.className = classes.join(" ");
    });
    return this;
}; (function($, sr) {
    var debounce = function(func, threshold, execAsap) {
        var timeout;
        return function debounced() {
            var obj = this,
            args = arguments;
            function delayed() {
                if (!execAsap) func.apply(obj, args);
                timeout = null;
            };
            if (timeout) clearTimeout(timeout);
            else if (execAsap) func.apply(obj, args);
            timeout = setTimeout(delayed, threshold || 100);
        };
    }
    jQuery.fn[sr] = function(fn) {
        return fn ? this.bind('resize', debounce(fn)) : this.trigger(sr);
    };
})(jQuery, 'smartresize');

(function() {
	var lastTime = 0;
    var vendors = ['ms', 'moz', 'webkit', 'o'];
    for(var x = 0; x < vendors.length && !window.requestAnimationFrame; ++x) {
        window.requestAnimationFrame = window[vendors[x]+'RequestAnimationFrame'];
        window.cancelAnimationFrame = window[vendors[x]+'CancelAnimationFrame']
            || window[vendors[x]+'CancelRequestAnimationFrame'];
    }

    if (!window.requestAnimationFrame)
        window.requestAnimationFrame = function(callback, element) {
            var currTime = new Date().getTime();
            var timeToCall = Math.max(0, 16 - (currTime - lastTime));
            var id = window.setTimeout(function() { callback(currTime + timeToCall); },
                timeToCall);
            lastTime = currTime + timeToCall;
            return id;
        };

    if (!window.cancelAnimationFrame)
        window.cancelAnimationFrame = function(id) {
            clearTimeout(id);
        };
	//开始
    var width, height, largeHeader, canvas, ctx, circles, target, animateHeader = true;

    // Main
    //initHeader();
    addListeners();
/*
    function initHeader() {
        width = 600;
        height = 210;
        target = {x: 0, y: height};

        largeHeader = document.getElementById('large-header');
        largeHeader.style.height = height+'px';

        canvas = document.getElementById('demo-canvas');
        canvas.width = width;
        canvas.height = height;
        ctx = canvas.getContext('2d');

        // create particles
        circles = [];
        for(var x = 0; x < width*0.5; x++) {
            var c = new Circle();
            circles.push(c);
        }
        animate();
    }*/

    // Event handling
    function addListeners() {
        window.addEventListener('scroll', scrollCheck);
        window.addEventListener('resize', resize);
    }

    function scrollCheck() {
        if(document.body.scrollTop > height) animateHeader = false;
        else animateHeader = true;
    }

    function resize() {
        width = 600;
        height = 210;
        largeHeader.style.height = height+'px';
        canvas.width = width;
        canvas.height = height;
    }

    function animate() {
        if(animateHeader) {
            ctx.clearRect(0,0,width,height);
            for(var i in circles) { 
                circles[i].draw();
            }
        }
        requestAnimationFrame(animate);
    }

    // Canvas manipulation
    function Circle() {
        var _this = this;

        // constructor
        (function() {
            _this.pos = {};
            init();
            console.log(_this);
        })();

        function init() {
            _this.pos.x = Math.random()*width;
            _this.pos.y = height+Math.random()*100;
            _this.alpha = 0.1+Math.random()*0.3;
            _this.scale = 0.1+Math.random()*0.3;
            _this.velocity = Math.random();
        }

        this.draw = function() {
            if(_this.alpha <= 0) {
                init();
            }
            _this.pos.y -= _this.velocity;
            _this.alpha -= 0.0008;
            ctx.beginPath();
            ctx.arc(_this.pos.x, _this.pos.y, _this.scale*10, 0, 2 * Math.PI, false);
            ctx.fillStyle = 'rgba(255,255,255,'+ _this.alpha+')';
            ctx.fill();
        };
    }

})();