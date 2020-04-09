import React, {Component} from 'react';
import './giftBox.css';

class GiftBox extends Component{
    render() {
        return(
            <div>
                <section className="wrap">
                    <section className="gift pr-5">
                        <div className="giftcard">Nini says
                            <br/>Hi!
                        </div>
                        <section className="gift_top">
                            <div className="ribbon_right"/>
                            <div className="ribbon_left"/>
                            <div className="gift_box_top"/>
                            <div className="gift_ribbon_left"/>
                        </section>
                        <div className="gift_ribbon_center"/>
                        <div className="gift_box_bottom_top"/>
                        <div className="gift_box_bottom">
                            <div className="gift_box_bottom_ribbon" id="ribbon1"/>
                            <div className="gift_box_bottom_ribbon" id="ribbon2"/>
                            <div className="gift_box_bottom_ribbon" id="ribbon3"/>
                            <div className="gift_box_bottom_ribbon" id="ribbon4"/>
                        </div>
                    </section>
                </section>
            </div>
        )
    }
}export default GiftBox;