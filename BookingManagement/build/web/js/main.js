"use strict";


// Initiate the wowjs
new WOW().init();

// Spinner
function spinner() {
    setTimeout(function () {
        const spinnerElement = document.getElementById('spinner');
        if (spinnerElement) {
            spinnerElement.classList.remove('show');
        }
    }, 1);
}
spinner();

// Dropdown on mouse hover
const dropdowns = document.querySelectorAll(".dropdown");
const showClass = "show";

function handleDropdown() {
    if (window.matchMedia("(min-width: 992px)").matches) {
        dropdowns.forEach(dropdown => {
            dropdown.addEventListener('mouseenter', function() {
                this.classList.add(showClass);
                this.querySelector('.dropdown-toggle').setAttribute("aria-expanded", "true");
                this.querySelector('.dropdown-menu').classList.add(showClass);
            });
            dropdown.addEventListener('mouseleave', function() {
                this.classList.remove(showClass);
                this.querySelector('.dropdown-toggle').setAttribute("aria-expanded", "false");
                this.querySelector('.dropdown-menu').classList.remove(showClass);
            });
        });
    } else {
        dropdowns.forEach(dropdown => {
            dropdown.removeEventListener('mouseenter', null);
            dropdown.removeEventListener('mouseleave', null);
        });
    }
}

window.addEventListener('load', handleDropdown);
window.addEventListener('resize', handleDropdown);

// Back to top button
const backToTop = document.querySelector('.back-to-top');

window.addEventListener('scroll', function() {
    if (window.pageYOffset > 300) {
        backToTop.style.display = 'block';
    } else {
        backToTop.style.display = 'none';
    }
});

backToTop.addEventListener('click', function(e) {
    e.preventDefault();
    window.scrollTo({
        top: 0,
        behavior: 'smooth'
    });
});


// Facts counter
document.addEventListener('DOMContentLoaded', function() {
    const counterUpElements = document.querySelectorAll('[data-toggle="counter-up"]');
    counterUpElements.forEach(el => {
        const target = parseInt(el.textContent);
        const countUp = new CountUp(el, target, {
            duration: 2,
            separator: ',',
        });
        if (!countUp.error) {
            countUp.start();
        } else {
            console.error(countUp.error);
        }
    });
});

// Testimonials carousel
const testimonialCarousel = document.querySelector(".testimonial-carousel");
if (testimonialCarousel) {
    new Owl.Carousel(testimonialCarousel, {
        autoplay: true,
        smartSpeed: 1000,
        margin: 25,
        dots: false,
        loop: true,
        nav: true,
        navText: [
            '<i class="bi bi-arrow-left"></i>',
            '<i class="bi bi-arrow-right"></i>'
        ],
        responsive: {
            0: {
                items: 1
            },
            768: {
                items: 2
            }
        }
    });
}
