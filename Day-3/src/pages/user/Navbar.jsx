import React from "react";
import "../../assets/css/navbar.css";
// import logo from "../../assets/images/logor.png";
import logo from "../../assets/images/firework_4516211.png";
import profile from "../../assets/images/profile.jpeg";

const Navbar = () => {
  return (
    <div className="navbar">
      <div className="logo-container">
        <img src={logo} alt="Party Management Logo" className="logo" />
        <h1 className="logo-name">PartyPro</h1>
      </div>
      <div className="nav-links">
        <a href="#">Home</a>
        <a href="#">Events</a>
        <a href="#">Venues</a>
        <a href="#">Calendar</a>
        <a href="#">Invitations</a>
      </div>
      <div className="profile-section">
        <a href="/login" className="Login-btn">Login</a>
        <img src={profile} alt="Profile" className="profile-pic" />
      </div>
    </div>
  );
};

export default Navbar;
