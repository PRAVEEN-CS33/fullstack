import React from "react";
import PropTypes from 'prop-types'
import Navbar from "./Navbar";
import Footer from "./Footerc";
import { Button } from 'flowbite-react';


function UserLayout({children}) {
    return (  
        <div className="user-container">
            <header>
                <Navbar />
            </header>
            <main>
                {children}

            </main>
            <footer>
                <Footer/>
            </footer>
        </div>
    );
}
UserLayout.propTypes = {
    children: PropTypes.node.isRequired
}
export default UserLayout;