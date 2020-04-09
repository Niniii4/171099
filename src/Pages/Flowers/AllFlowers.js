import React, {Component} from "react";
import {Link} from "react-router-dom";
import Flowers from "./Flowers";
import '../../MainOptions/MainOptions.css';

class AllFlowers extends Component {

    render() {
        return (
            <div className="container">
                <div className="row m-0">
                    {this.props.flowers.map( (flower, id) =>
                        <div key={flower.id}>
                            <Flowers
                                     onFlowerDelete={this.props.onFlowerDelete}
                                     id={flower.id}
                                     title={flower.title}
                                     description={flower.description}
                                     handmade={flower.handmade}
                                     color={flower.color}
                                     size={flower.size}
                                     family={flower.family}
                                     type={flower.type}
                                     flowerDetails={flower.flowerDetails}
                            />
                        </div>
                    )}
                </div>
                <div className="jumbotron">
                    <h1>Do you have something else imagined?<Link className="nav-link" to={"/flowers/create"}><span
                        className="badge">Do it yourself <span
                        className="fa fa-arrow-circle-o-right"/></span></Link></h1></div>
                <br/>
                <br/>
                <br/>
            </div>
        );
    }
}
export default AllFlowers;
