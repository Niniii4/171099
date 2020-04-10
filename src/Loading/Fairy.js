import React, {Component} from 'react';
import './fairy.css';

class Fairy extends Component{
    render() {
        return(
            <div className="fairy">
                <div className="wings"/>
                <div className="glow">
                    <div className="sparkle"/>
                    <div className="sparkle"/>
                    <div className="sparkle"/>
                    <div className="sparkle"/>
                    <div className="sparkle"/>
                </div>
            </div>
        )
    }
}export default Fairy;