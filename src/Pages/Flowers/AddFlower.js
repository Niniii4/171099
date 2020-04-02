import React, {Component} from "react";
import '../MainOptions.css';
import axios from 'axios';
import qs from 'qs'
import {useHistory} from "react-router";
import FlowerService from "./FlowerService";

class AddFlower extends Component {
    constructor() {
        super();
        this.state = {
            flowers: [],
            id: 0,
            title: '',
            description: '',
            handmade: 0,
            color: '',
            size: '',
            family: '',
            type: '',
            flowerWrap: '',
            flowerDetails: ''
        };
        this.saveFlower = this.saveFlower.bind(this);
    }

    saveFlower = (e) => {
        e.preventDefault();
        let flower = {
            title: this.state.title,
            description: this.state.description,
            handmade: this.state.handmade,
            color: this.state.color,
            size: this.state.size,
            family: this.state.family,
            type: this.state.type,
            flowerWrap: this.state.flowerWrap,
            flowerDetails: this.state.flowerDetails};
        FlowerService.addFlower(flower)
            .then(res => {
                this.setState({message : 'Flower added successfully.'});
                this.props.history.push('/flowers');
            });
    };

    onChange = event =>{
        this.setState({title: event.target.value, description: event.target.value, handmade: event.target.value,
            color: event.target.value, size: event.target.value, family: event.target.value,
            flowerWrap: event.target.value, flowerDetails: event.target.value});
    };

    render() {
        return (
            <div className="container">
                <form className="form mt-5 mb-6 col-sm-6 text-white mx-auto text-center">
                    <div className="form-group">
                        <label htmlFor="giftName">Gift Name</label>
                        <input type="text" className="form-control" id="title"
                               aria-describedby="giftHelp" placeholder="My Gift Name" onChange={this.onChange} name={"title"}/>
                        <small id="giftHelp" className="form-text text-muted">Insert a name for the gift you're making.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Gift Description</label>
                        <input type="text" className="form-control" id="description"
                               aria-describedby="giftdHelp" placeholder="My Gift Description" onChange={this.onChange} name={"description"}/>
                        <small id="giftdHelp" className="form-text text-muted">Insert a description for the gift you're making.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Gift Color</label>
                        <input type="text" className="form-control" id="color"
                               aria-describedby="giftcHelp" placeholder="My Gift Color" onChange={this.onChange} name={"color"}/>
                        <small id="giftcHelp" className="form-text text-muted">Insert a color for the gift you're making.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Gift family</label>
                        <input type="text" className="form-control" id="family"
                               aria-describedby="giftfHelp" placeholder="My Gift Family" onChange={this.onChange} name={"family"}/>
                        <small id="giftfHelp" className="form-text text-muted">Insert the flower's family.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Wrapping</label>
                        <input type="text" className="form-control" id="flowerWrap"
                               aria-describedby="flowerWrap" placeholder="Wrapping name" onChange={this.onChange} name={"flowerWrap"}/>
                        <small id="flowerWrap" className="form-text text-muted">Fill this input if you want your flower wrapped.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Details</label>
                        <input type="text" className="form-control" id="flowerDetails"
                               aria-describedby="flowerDetails" placeholder="Details names" onChange={this.onChange} name={"flowerDetails"}/>
                        <small id="flowerDetails" className="form-text text-muted">Fill this input if you want some details.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="size">Gift Size</label>
                        <select className="form-control" id="size"  onChange={this.onChange} name={"size"}>
                            <option>Large</option>
                            <option>Medium</option>
                            <option>Small</option>
                        </select>
                    </div>
                    <div className="form-check">
                        <input type="checkbox" className="form-check-input mt-2" id="handmade" onChange={this.onChange} name={"handmade"}/>
                        <label className="form-check-label" htmlFor="handmade">Handmade</label>
                    </div>
                    <div> &nbsp; &nbsp;</div>
                    <div>
                        <button type="submit" onClick={this.saveFlower} className="btn btn-lg mb-lg-5 btn-create btn-primary btn-block font-weight-bold">CREATE</button></div>

                </form>
            </div>
        );
    }
}

export default AddFlower;