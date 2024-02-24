import React from "react";
import "../../assets/css/login.css";
import logo from "../../assets/images/firework_4516211.png";
import { IoArrowBack } from "react-icons/io5";

function Login() {
  return (
    <div className="login-bg">
      <div className="login-content">
        <a href="/user/home" className="go-to-home">
          <IoArrowBack />
          Go to Home
        </a>
        <div className="logo-container">
          <img src={logo} alt="Party Management Logo" className="logo" />
          <h2 className="logo-name" >PartyPro</h2>
        </div>
        <div className="login-background">
          <div className="box-container">
            <div className="wrapper">
              <form action="/user/home">
                <h1>Login</h1>
                <div className="input-box">
                  <input type="text" placeholder="Username" required />
                  <i className="bx bxs-user"></i>
                </div>
                <div className="input-box">
                  <input
                    type="password"
                    placeholder="Password"
                    required
                    maxLength={8}
                    minLength={4}
                  />
                  <i className="bx bxs-lock-alt"></i>
                </div>
                <div className="remember-forgot">
                  <label>
                    <input type="checkbox" />
                    Remember me
                  </label>
                  <a href="/forgotpassword">Forgot Password?</a>
                </div>
                <button type="submit" className="btn">
                  Login
                </button>
                <div className="register-link">
                  <p>
                    Don't have an account? <a href="/signup">Register</a>
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

export default Login;
