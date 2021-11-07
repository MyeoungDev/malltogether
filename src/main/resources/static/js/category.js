var dropBtn = document.querySelector('.categoryBar__columns__menu');
var menu = document.querySelector('.dropdown');

dropBtn.addEventListener('click', function(){
    if(menu.classList.contains('activeCategory')){
        menu.classList.remove('activeCategory');
    } else {
        menu.classList.add('activeCategory');
    }
})
