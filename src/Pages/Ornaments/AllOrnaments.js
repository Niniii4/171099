import React, {Component} from "react";
import {Link} from "react-router-dom";
import '../../MainOptions/MainOptions.css';
import Ornaments from "./Ornaments";

class AllOrnaments extends Component {
    render() {
        return (
            <div className="container">
                <div className="row m-0">
                    {this.props.ornaments.map( (ornament, id) =>
                        <div key={ornament.id}>
                            <Ornaments
                                onOrnamentDelete={this.props.onOrnamentDelete}
                                id={ornament.id}
                                title={ornament.title}
                                description={ornament.description}
                                handmade={ornament.handmade}
                                color={ornament.color}
                                size={ornament.size}
                                breakable={ornament.breakable}
                                material={ornament.material}
                            />
                        </div>
                    )}
                </div>
                <div className="jumbotron">
                    <h1>Do you have something else imagined?<Link className="nav-link" to={"/ornaments/create"}><span
                        className="badge">Do it yourself <span
                        className="fa fa-arrow-circle-o-right"/></span></Link></h1></div>
                <br/>
                <br/>
                <br/>
            </div>
        );
    }
}
export default AllOrnaments;
