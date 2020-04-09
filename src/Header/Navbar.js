import React, {Component} from "react";
import '../../node_modules/font-awesome/css/font-awesome.min.css';
import '../../node_modules/bootstrap/dist/css/bootstrap-grid.min.css';
import '../../node_modules/bootstrap/dist/css/bootstrap-reboot.min.css';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './Navbar.css';
import {Link} from "react-router-dom";

class Navbar extends Component{
    render() {
        return(
            <div className="container">
                <div className="bc-icons">
                    <nav aria-label="breadcrumb">
                        <ol className="breadcrumb pink lighten-2">
                            <li className="breadcrumb-item"> <Link to="/" className="white-text fa fa-home">
                                &nbsp; <b>HOME</b>
                            </Link>
                            </li>
                            <li className="breadcrumb-item"> <Link to="/orders" className="white-text fa fa-shopping-basket">
                                &nbsp; <b>MY BASKET</b>
                            </Link>
                            </li>
                            <li className="breadcrumb-item"> <Link to="/about" className="white-text fa fa-address-book">
                                &nbsp; <b>ABOUT US</b>
                            </Link>
                            </li>
                            <li className="breadcrumb-item"> <Link to="/contact" className="white-text fa fa-envelope">
                                &nbsp; <b>CONTACT</b>
                            </Link>
                            </li>
                        </ol>

                    </nav>
                </div>
            </div>
        );
    }
}
export default Navbar;