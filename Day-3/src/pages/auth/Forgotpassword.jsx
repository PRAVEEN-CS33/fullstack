import React from "react";
import "../../assets/css/forgotpass.css";
import { IoArrowBack } from "react-icons/io5";
import logo from "../../assets/images/firework_4516211.png";

function ForgotPassword() {
  return (
    <div className="login-bg">
      <div className="login-content">
        <a href="/user/home" className="go-to-home">
          <IoArrowBack />
          Go to Home
        </a>
        <div className="logo-container">
          <img src={logo} alt="Party Management Logo" className="logo" />
          <h2 className="logo-name">PartyPro</h2>
        </div>
        <div className="login-background">
          <div className="box-container">
            <div className="wrapper">
              <form action="/login">
                <h1>Forgot Password</h1>
                <div className="input-box">
                  <input type="text" placeholder="Email" required />
                  <i class="bx bxs-envelope"></i>
                </div>
                <div className="input-box">
                  <input
                    type="password"
                    placeholder="Password"
                    required
                    minLength={4}
                    maxLength={8}
                  />
                  <i class="bx bx-lock-alt"></i>
                </div>
                <div className="input-box">
                  <input
                    type="password"
                    placeholder="Re Enter Password"
                    required
                    minLength={4}
                    maxLength={8}
                  />
                  <i className="bx bxs-lock-alt"></i>
                </div>
                <button type="submit" className="btn">
                  Reset
                </button>
                <div className="register-link">
                  <p>
                    Back to <a href="/login">Login</a>
                  </p>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
      <div className="footer-bottom">
        <p>&copy; 2024 PartyPro Event Management. All rights reserved.</p>
      </div>
    </div>
  );
}

export default ForgotPassword;
