import React, {Component} from "react";
import '../MainOptions.css';
import {Link} from "react-router-dom";
import FlowerService from "./FlowerService";
import axios from "axios";
import Loading from "../../Loading/Loading";
import Loading2 from "../../Loading/Loading2";
import Loading3 from "../../Loading/Loading3";

class Flowers extends Component {

    constructor(props){
        super(props);
        this.state = {
            flowers: [],
            title: '',
            description: '',
            handmade: '',
            color: '',
            size: '',
            family: '',
            type: '',
            flowerWrap: '',
            flowerDetails: '',
            isLoading: 'false'
        };
        this.deleteFlower = this.deleteFlower.bind(this);
        this.editFlower = this.editFlower.bind(this);
    }

    componentDidMount() {
        this.reloadUserList();
    }

    reloadUserList() {
        FlowerService.getAllFlowers()
            .then((res) => {
                this.setState({flowers: res.data.result})
            });
    }

    // componentDidMount() {
    //     this.setState({isLoading:true});
    //     fetch("http://localhost:8080/flowers").then(response=>response.json).then(data=>this.setState(
    //         {flowers:data, isLoading:false}));
    // }

    deleteFlower(id) {
        FlowerService.deleteFlower(id)
            .then(res => {
                this.setState({message : 'Flower deleted successfully.'});
                this.setState({flowers: this.state.flowers.filter(flower => flower.id !== id)});
            })

    }
    editFlower(id) {
        window.localStorage.setItem("id", id);
        this.props.history.push('/update');
    }

    render() {
        const {flowers, isLoading} = this.state;
        // if (isLoading){
        //     return (
        //         <p>Loading...</p>
        //     )
        // }
        return (
            <div>
                <div className="container">
                        {this.state.flowers.map(item => {
                                return (
                                    <div className="card border-info mx-auto mb-3">
                                        <div className="card-header bg-transparent border-info text-info"><h3
                                            className="card-title text-info" key={this.item.id}>{this.item.title}</h3></div>
                                        <div className="card-body text-info">
                                            <p className="card-text">{this.item.description}</p>
                                            <p className="card-text">{this.item.unique}</p>
                                        </div>
                                        <div className="card-footer bg-transparent border-info">
                                            <a onClick={() => this.props.editFlower(this.props.id)} title="Промени">
                                            <span className="btn btn-info fa fa-pencil"/>
                                            </a>
                                            <a onClick={() => this.props.deleteFlower(this.props.id)} title="Избриши">
                                                <span className="btn btn-success fa fa-trash"/>
                                            </a>
                                            <span className="btn btn-success fa fa-shopping-basket"/></div>
                                    </div>
                                );
                            }
                        )}
                </div>
            </div>

        );
    }
}

export default Flowers;