import React, {Component} from "react";
import '../../MainOptions/MainOptions.css';
import {Link} from "react-router-dom";

class Decorations extends Component {
    render() {
        return (
            <div>
                <tr>
                    <td>{this.props.name}</td>
                    <td>{this.props.size}</td>
                    <td>{this.props.color}</td>
                    <td>{this.props.quantity}</td>
                    <Link to={{
                        pathname: '/details/update/' + this.props.name,
                        update: {
                            size: this.props.size,
                            color: this.props.color,
                            quantity: this.props.quantity
                        }
                    }} title="Промени">
                        <td><span className="btn btn-lg btn-outline-light fa fa-pencil"/></td>
                    </Link>
                </tr>
            </div>
        );
    }
}

export default Decorations;