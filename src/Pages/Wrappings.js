import React, {Component} from "react";
import './MainOptions.css';
class Wrappings extends Component{
    render() {
        return(
            <div>
                <div className="container">
                    <div className="card border-info mb-3">
                        <div className="card-header bg-transparent border-info">Header</div>
                        <div className="card-body text-info">
                            <h5 className="card-title">Success card title</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the
                                bulk of the card's
                                content.</p>
                        </div>
                        <div className="card-footer bg-transparent border-info"> <span
                            className="btn btn-info fa fa-pencil"/> <span
                            className="btn btn-danger fa fa-trash"/> <span
                            className="btn btn-success fa fa-shopping-basket"/></div>
                    </div>
                </div>
            </div>
        );
    }
}
export default Wrappings;