import React, {Component} from "react";
import {Link} from "react-router-dom";
import Flowers from "./Flowers";
import '../MainOptions.css';

class AllFlowers extends Component {
    constructor(props){
        super(props);
        this.state = {
            flowers: [],
            isLoading: 'false'
        };
    }

    // componentDidMount() {
    //     this.setState({isLoading:true});
    //     fetch("http://localhost:8080/flowers").then(response=>response.json).then(data=>this.setState(
    //         {flowers:data, isLoading:false}));
    // }

    render() {
        const {flowers, isLoading} = this.state;
        // if (isLoading){
        //     return (
        //         <p>Loading...</p>
        //     )
        // }
        return (
            <div className="container">
                <div className="row m-0">
                    <Flowers/>
                </div>
                <div className="jumbotron">
                    <h1>Do you have something else imagined?<Link className="nav-link" to={"/flowers/create"}><span
                        className="badge">Do it yourself <span
                        className="fa fa-arrow-circle-o-right"/></span></Link></h1></div>
            </div>


        );
    }
}

export default AllFlowers;
