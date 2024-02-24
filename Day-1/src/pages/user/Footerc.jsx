import React from "react";
import "../../assets/css/footer.css";
import logo from "../../assets/images/firework_4516211.png";
import {
  FaInstagram,
  FaFacebook,
  FaSquareXTwitter,
  FaYoutube,
} from "react-icons/fa6";

function Footerc() {
  return (
    <div className="main-footer">
      <div className="container">
        <div className="footer-content">
          <div className="footer-column">
            <div className="logo-container">
              <img src={logo} alt="Party Management Logo" className="logo" />
              <h2>PartyPro</h2>
            </div>
            <p>
            "ParyPro" streamlines party planning with budgeting, vendor management, and guest coordination tools, empowering users to effortlessly organize events of any scale.
            </p>
          </div>
          <div className="footer-column footer-column2">
            <h2>Quick Links</h2>
            <ul>
              <li>
                <a href="#">Home</a>
              </li>
              <li>
                <a href="#">Events</a>
              </li>
              <li>
                <a href="#">Venues</a>
              </li>
              <li>
                <a href="#">Guests</a>
              </li>
            </ul>
          </div>
          <div className="footer-column">
            <h2>Contact Us</h2>
            <p>123 Party St, Cityville, USA</p>
            <p>Email: info@partpro.com</p>
            <p>Phone: 123-456-7890</p>
            <div className="social">
              <a href="#">
                <FaInstagram />
              </a>
              <a href="#">
                <FaFacebook />
              </a>
              <a href="#">
                <FaSquareXTwitter />
              </a>
              <a href="#">
                <FaYoutube />
              </a>
            </div>
          </div>
        </div>
        <div className="footer-bottom">
          <p>&copy; 2024 PartyPro Event Management. All rights reserved.</p>
        </div>
      </div>
    </div>
  );
}

export default Footerc;
