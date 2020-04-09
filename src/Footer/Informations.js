import React, {Component} from "react";
import '../../node_modules/font-awesome/css/font-awesome.min.css';
import '../../node_modules/bootstrap/dist/css/bootstrap-grid.min.css';
import '../../node_modules/bootstrap/dist/css/bootstrap-reboot.min.css';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './Informations.css';

class Informations extends Component{
    render() {
        return(
            <footer className="footer">
                <div className="container">
                    <div className="row">
                        <div className="col-6 footer-el mt-1">
                            <b className="footer-info mt-3 ml-4">Follow us on social media:</b>
                            <span className="mt-2 px-1">&nbsp; <span className="fa f-item fa-facebook-square"/>   &nbsp;  &nbsp;<span className="fa f-item fa-instagram"/>
                            &nbsp; &nbsp;<span className="fa f-item fa-linkedin-square"/> &nbsp; &nbsp;<span className="fa f-item fa-youtube"/> </span>
                        </div>
                        <div className="col-6 footer-el">
                            <b className="footer-info mt-3 mr-1">Our rating:</b>
                            <span className="mt-3 px-1 ml-1">&nbsp; <span className="fa f-item2 fa-star"/>&nbsp; <span className="fa f-item2 fa-star"/>&nbsp; <span className="fa f-item2 fa-star"/>&nbsp; <span className="fa f-item2 fa-star"/>&nbsp; <span className="fa f-item2 fa-star-half-full"/></span>
                        </div>
                    </div>
                </div>
            </footer>
        );
    }
}
export default Informations;