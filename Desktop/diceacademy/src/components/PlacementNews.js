import React, { useEffect, useRef } from "react";
import "./PlacementNews.css";

const PlacementNews = () => {
  const scrollRef = useRef(null);

  useEffect(() => {
    const interval = setInterval(() => {
      const { current } = scrollRef;
      if (current) {
        // Scroll by the width of one card
        current.scrollBy({
          left: 300, // Adjust this value according to card width
          behavior: "smooth",
        });

        // If we reach the end, reset to the beginning
        if (
          current.scrollLeft + current.offsetWidth >=
          current.scrollWidth
        ) {
          current.scrollTo({ left: 0, behavior: "smooth" });
        }
      }
    }, 3000); // 3 seconds interval

    return () => clearInterval(interval);
  }, []);

  const placements = [
    { id: 1, name: "Mr Inayat", company: "Carzonerent", image: "inayat.jpg" },
    { id: 2, name: "Ms Diksha", company: "BSC Interior", image: "diksha.jpg" },
    { id: 3, name: "Mr Deepak", company: "Spyne.ai", image: "deepak.jpg" },
    { id: 4, name: "Mr Bhanu", company: "Spyne.ai", image: "bhanu.jpg" },
    { id: 5, name: "Ms Riya", company: "TechCorp", image: "riya.jpg" }, // Added more
    { id: 6, name: "Mr Arjun", company: "Creative Studios", image: "arjun.jpg" },
    // Add more cards here
  ];

  return (
    <div className="placement-news">
      <h2>
        <span className="live-update">● Live Update</span> Placement News
      </h2>
      <div className="placement-container" ref={scrollRef}>
        {placements.map((placement) => (
          <div key={placement.id} className="placement-card">
            <img
              src={placement.image}
              alt={placement.name}
              className="placement-image"
            />
            <h3>{placement.name}</h3>
            <p>
              <strong>Placed in</strong> <br />
              {placement.company}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default PlacementNews;
