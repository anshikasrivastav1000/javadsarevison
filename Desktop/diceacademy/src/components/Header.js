import React from "react";
import "./Header.css";

const Header = () => {
  return (
    <header>
      {/* Top Bar */}
      <div className="top-bar">
        <p>ISO Certified</p>
        <div className="top-bar-right">
          <p>It’s a corporate training center.</p>
          <p>Upcoming batches |</p>
          <p>Branch Locator</p>
          <p>LMS Login / Signup</p>
        </div>
      </div>

      {/* Main Navbar */}
      <nav className="navbar">
        <div className="logo">
          <h1>
            DiCE <span>ACADEMY</span>
          </h1>
        </div>
        <ul className="nav-links">
          <li>Portfolio</li>
          <li>Placement</li>
          <li>Courses</li>
          <li className="highlight">Hire From Us</li>
          <li>Contact</li>
        </ul>
        <div className="nav-actions">
          <p>
            <i className="phone-icon">📞</i> 9508222111{" "}
          </p>
          <button className="register-btn">REGISTER NOW</button>
          <i className="search-icon">🔍</i>
          <i className="menu-icon">≡</i>
        </div>
      </nav>
    </header>
  );
};

export default Header;
