import React, {Component} from 'react';
import './aboutMenu.css';

class AboutMenu extends Component{
    render() {
        return(
            <div>
                <nav className="menu">
                    <input type="checkbox" href="#" className="menu-open" name="menu-open" id="menu-open"/>
                    <label className="menu-open-button" htmlFor="menu-open">
                        <span className="lines line-1"/>
                        <span className="lines line-2"/>
                        <span className="lines line-3"/>
                    </label>

                    <span className="menu-item blue"> <i className="fa fa-anchor"><br/>Long <br/>Tradition</i></span>
                    <span className="menu-item green"> <i className="fa fa-coffee"><br/>Extravagant Taste</i></span>
                    <span className="menu-item red"> <i className="fa fa-heart"><br/>Loved by our Customers</i></span>
                    <span className="menu-item purple"> <i className="fa fa-microphone"><br/>Known by everyone</i></span>
                    <span className="menu-item orange"> <i className="fa fa-star"><br/>Top Rated</i></span>
                    <span className="menu-item lightblue"> <i className="fa fa-diamond"><br/>Best Quality</i></span>
                </nav>
            </div>
        )
    }
}
export default AboutMenu;