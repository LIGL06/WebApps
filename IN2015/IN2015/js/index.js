$(function(){
    var _top = $(window).scrollTop();
    var _direction;
    $(window).scroll(function(){
        var _cur_top = $(window).scrollTop();
        if(_top < _cur_top)
        {
            _direction = 'down';
          $('.navbar').stop().fadeOut('fast');
        }
        else
        {
            _direction = 'up';
          $('.navbar').fadeIn('slow');
        }
        _top = _cur_top;
        console.log(_direction);
    });
});