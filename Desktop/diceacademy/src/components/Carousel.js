import React, { useState, useEffect } from 'react';
import './Carousel.css';

const Carousel = () => {
    const [currentSlide, setCurrentSlide] = useState(1);
    const totalSlides = 9;
    const [isHovering, setIsHovering] = useState(false);

    useEffect(() => {
        let intervalId;
        
        if (!isHovering) {
            intervalId = setInterval(() => {
                setCurrentSlide(prev => prev === totalSlides ? 1 : prev + 1);
            }, 3000);
        }

        return () => clearInterval(intervalId);
    }, [isHovering]);

    const handlePrevSlide = () => {
        setCurrentSlide(prev => prev === 1 ? totalSlides : prev - 1);
    };

    const handleNextSlide = () => {
        setCurrentSlide(prev => prev === totalSlides ? 1 : prev + 1);
    };

    return (
        <div className="carousel">
            <div 
                className="carousel-container"
                onMouseEnter={() => setIsHovering(true)}
                onMouseLeave={() => setIsHovering(false)}
            >
                {/* Text Content */}
                <div className="carousel-content">
                    <span className="badge">BEST IN NCR</span>
                    <h1 className="title">
                        Thrice the <span className="blue-text">Creativity</span>.
                    </h1>
                    <h1 className="title">
                        Tripple the <span className="blue-text">Success</span>.
                    </h1>
                    <p className="subtitle">Now present at three locations.</p>
                    <button className="cta-button">
                        BOOK FREE COUNSELLING →
                    </button>
                </div>

                {/* Navigation Arrows */}
                <div className="navigation">
                    <button 
                        className="nav-button"
                        onClick={handlePrevSlide}
                    >
                        ←
                    </button>
                    <button 
                        className="nav-button"
                        onClick={handleNextSlide}
                    >
                        →
                    </button>
                </div>

                {/* Slide Counter */}
                <div className="counter">
                    {String(currentSlide).padStart(2, '0')} / {String(totalSlides).padStart(2, '0')}
                </div>
            </div>

            {/* Google Rating Section */}
            <div className="google-section">
                <img 
                    src="/api/placeholder/100/40" 
                    alt="Google Logo" 
                    className="google-logo"
                />
                <div className="rating">
                    <span className="rating-score">★ 4.7</span>
                    <div className="play-store-badge">
                        Available on Google Play
                    </div>
                </div>
            </div>
        </div>
    );
};

export default Carousel;