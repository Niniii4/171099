import React, {Component} from "react";
import '../../MainOptions/MainOptions.css';
import {Link} from "react-router-dom";

class Ornaments extends Component {
      render() {
        return (
            <div>
                <div className="container">
                    <div className="card mx-auto mb-3">
                        <div className="card-header card-h "><h3
                            className="card-title text-white"> {this.props.title}</h3></div>
                        <div className="card-body">
                            <p className="card-text"><u>Description:</u> {this.props.description}</p>
                            <p className="card-text"><u>Color:</u> {this.props.color} color</p>
                            <p className="card-text"><u>Breakable:</u> {this.props.breakable}</p>
                            <p className="card-text"><u>Material:</u> {this.props.shape}</p>
                            <p className="card-text"><u>Size:</u> {this.props.size} size</p>
                        </div>
                        <div className="card-footer card-footer-center card-h">
                            <Link to={{
                                pathname: '/ornaments/update/' + this.props.id,
                                update: {
                                    title: this.props.title,
                                    description: this.props.description,
                                    color: this.props.color,
                                    breakable: this.props.breakable,
                                    material: this.props.material,
                                    size: this.props.size
                                }
                            }}
                                  title="Промени">
                                <span className="btn btn-lg btn-info fa fa-pencil"/>
                            </Link>
                            &nbsp;&nbsp;&nbsp;
                            <Link to={{pathname: '/orders/create',update: {
                                    orderGifts: this.props.id,
                                    title: this.props.title}}} title="Купи">
                                <span className="btn btn-lg btn-success fa fa-shopping-basket"/>
                            </Link>
                            &nbsp;&nbsp;&nbsp;
                            <Link to={{
                                pathname: '/ornaments/delete/' + this.props.id,
                            }} title="Избриши">
                                <span className="btn btn-lg btn-danger fa fa-trash"/>
                            </Link>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Ornaments;