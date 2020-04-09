import React, {Component} from "react";
import '../../MainOptions/MainOptions.css';
import {Link} from "react-router-dom";

class Wrappings extends Component {
    render() {
        return (
            <div>
                <div className="container">
                    <div className="card border-info mx-auto mb-3">
                        <div className="card-header bg-info text-light"><h3
                            className="card-title text-light">Gift no.{this.props.id}: {this.props.title}</h3></div>
                        <div className="card-body text-info">
                            <p className="card-text"><u>Description:</u> {this.props.description}</p>
                            <p className="card-text"><u>Color:</u> {this.props.color} color</p>
                            <p className="card-text"><u>Fabric:</u> {this.props.fabric}</p>
                            <p className="card-text"><u>Shape:</u> {this.props.shape}</p>
                            <p className="card-text"><u>Size:</u> {this.props.size} size</p>
                        </div>
                        <div className="card-footer card-footer-center bg-info text-light">
                            <Link to={{
                                pathname: '/wrappings/update/' + this.props.id,
                                update: {
                                    title: this.props.title,
                                    description: this.props.description,
                                    color: this.props.color,
                                    fabric: this.props.fabric,
                                    shape: this.props.shape,
                                    size: this.props.size
                                }
                            }}
                                  title="Промени">
                                <span className="btn btn-lg btn-dark fa fa-pencil"/>
                            </Link>
                            &nbsp;&nbsp;&nbsp;
                            <Link to={{pathname: '/orders/create',update: {
                                    orderGifts: this.props.id,
                                    title: this.props.title}}} title="Купи">
                                <span className="btn btn-lg btn-success fa fa-shopping-basket"/>
                            </Link>
                            &nbsp;&nbsp;&nbsp;
                            <Link to={{
                                pathname: '/wrappings/delete/' + this.props.id,
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

export default Wrappings;