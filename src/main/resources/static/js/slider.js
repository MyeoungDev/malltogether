const slides = document.querySelectorAll(".sliderImg")
const dots = document.querySelectorAll(".slider__dots__dot");
let slideIndex = 1;
const milliseconds = 3000;

let setShowSlide = setInterval(showSlides, milliseconds);

minusSlides = () => {
    clearInterval(setShowSlide);
    if(slideIndex == 1){
        slideIndex = slides.length;
        slides[0].style.display = "none";
        slides[slideIndex -1].style.display = "block";
        for(i=0; i< dots.length; i ++){
            dots[i].classList.remove('dotFocus');
        }
        dots[slideIndex-1].classList.add('dotFocus');
    } else{              
        slideIndex -= 1  
        slides[slideIndex].style.display = "none";
        slides[slideIndex - 1].style.display = "block";
        for(i=0; i< dots.length; i ++){
            dots[i].classList.remove('dotFocus');
        }
        dots[slideIndex-1].classList.add('dotFocus');
    }
    setShowSlide = setInterval(showSlides, milliseconds);
}

plusSlides = () =>{
    clearInterval(setShowSlide);
    if(slideIndex == slides.length){
        slides[4].style.display = "none";
        slides[0].style.display = "block";
        dots[4].classList.remove('dotFocus');
        dots[0].classList.add('dotFocus');
        slideIndex = 1;
    } else{
        slideIndex += 1; // 여기서 n = 1
        slides[slideIndex - 2].style.display = "none";
        slides[slideIndex - 1].style.display = "block";
        dots[slideIndex-2].classList.remove('dotFocus');
        dots[slideIndex -1].classList.add('dotFocus');
    }
    
    setShowSlide = setInterval(showSlides, milliseconds);
}

currentSlide = (n) =>{
    clearInterval(setShowSlide);
    showSlides(slideIndex = n - 1);
    setShowSlide = setInterval(showSlides, milliseconds);
}

function showSlides(){
    if(slideIndex == slides.length){
        slideIndex = 1;
    } else if(slideIndex < 0){
        slideIndex = slides.length;
    } else{
        slideIndex ++;
    }

    for(i=0; i < slides.length; i ++){
        slides[i].style.display = "none";
    }
    for(i=0; i< dots.length; i ++){
        dots[i].classList.remove('dotFocus');
    }
    slides[slideIndex - 1].style.display = "block";
    dots[slideIndex - 1].classList.add('dotFocus');
}
