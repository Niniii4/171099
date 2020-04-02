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
                    <b> Info about us</b>
                </div>
            </footer>
        );
    }
}
export default Informations;