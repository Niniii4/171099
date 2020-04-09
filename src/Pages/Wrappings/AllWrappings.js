import React, {Component} from "react";
import {Link} from "react-router-dom";
import '../../MainOptions/MainOptions.css';
import Wrappings from "./Wrappings";

class AllWrappings extends Component {

    render() {
        return (
            <div className="container">
                <div className="row m-0">
                    {this.props.wrappings.map( (wrap, id) =>
                        <div key={wrap.id}>
                            <Wrappings
                                onWrapDelete={this.props.onWrapDelete}
                                id={wrap.id}
                                title={wrap.title}
                                description={wrap.description}
                                handmade={wrap.handmade}
                                color={wrap.color}
                                size={wrap.size}
                                fabric={wrap.fabric}
                                shape={wrap.shape}
                                wrappingDetails={wrap.wrappingDetails}
                            />
                        </div>
                    )}
                </div>
                <div className="jumbotron">
                    <h1>Do you have something else imagined?<Link className="nav-link" to={"/wrappings/create"}><span
                        className="badge">Do it yourself <span
                        className="fa fa-arrow-circle-o-right"/></span></Link></h1></div>
                <br/>
                <br/>
                <br/>
            </div>
        );
    }
}
export default AllWrappings;
