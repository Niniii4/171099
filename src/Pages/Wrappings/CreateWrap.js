import React, {Component} from "react";
import '../../MainOptions/MainOptions.css';
import {withRouter} from 'react-router-dom';

class CreateWrap extends Component {
    wrapCreated = (e) => {
        e.preventDefault();
        const newWrap={
            "id": e.target.id.value,
            "title": e.target.title.value,
            "description": e.target.description.value,
            "handmade": e.target.handmade.value,
            "color": e.target.color.value,
            "size": e.target.size.value,
            "fabric": e.target.fabric.value,
            "shape": e.target.shape.value,
            "wrappingDetails": e.target.wrappingDetails.value
        };
        this.props.onNewWrapAdd(newWrap);
        window.setTimeout(() => {
            this.props.history.push('/wrappings')
        }, 1000)
    };

    render() {
        return (
            <div className="container pb-5 mb-6">
                <form onSubmit={this.wrapCreated} className="form mt-5 mb-6 p-6 col-sm-6 text-white mx-auto text-center">
                    <div className="form-group">
                        <label htmlFor="giftName">Gift Name</label>
                        <input type="text" className="form-control" id="title" name={"title"}
                               aria-describedby="giftHelp" placeholder="My Gift Name"/>
                        <small id="giftHelp" className="form-text text-muted">Insert a name for the gift you're making.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Gift Description</label>
                        <input type="text" className="form-control" id="description" name={"description"}
                               aria-describedby="giftdHelp" placeholder="My Gift Description"/>
                        <small id="giftdHelp" className="form-text text-muted">Insert a description for the gift you're making.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Gift Color</label>
                        <input type="text" className="form-control" id="color" name={"color"}
                               aria-describedby="giftcHelp" placeholder="My Gift Color"/>
                        <small id="giftcHelp" className="form-text text-muted">Insert a color for the gift you're making.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Gift fabric</label>
                        <input type="text" className="form-control" id="fabric" name={"fabric"}
                               aria-describedby="giftfHelp" placeholder="My Gift Fabric"/>
                        <small id="giftfHelp" className="form-text text-muted">Insert the wrapping's fabric.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Wrapping shape</label>
                        <input type="text" className="form-control" id="shape" name={"shape"}
                               aria-describedby="giftytHelp" placeholder="Envelope, heart, box shape or similar"/>
                        <small id="gifttyHelp" className="form-text text-muted">Insert a shape for the gift you're making.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="giftDescription">Details</label>
                        <input type="text" className="form-control" id="wrappingDetails" name={"wrappingDetails"}
                               aria-describedby="wrappingDetails" placeholder="Details names"/>
                        <small id="wrappingDetails" className="form-text text-muted">Fill this input if you want some details.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="size">Gift Size</label>
                        <select className="form-control" id="size"  name={"size"}>
                            <option>Large</option>
                            <option>Medium</option>
                            <option>Small</option>
                        </select>
                    </div>
                    <div className="form-check">
                        <input type="checkbox" className="form-check-input mt-2" id="handmade" name={"handmade"}/>
                        <label className="form-check-label" htmlFor="handmade">Handmade</label>
                    </div>
                    <div> &nbsp; &nbsp;</div>
                    <div>
                        <button type="submit" className="btn btn-lg mb-2 btn-create btn-primary btn-block font-weight-bold">CREATE</button></div>
                </form>
                <div> &nbsp; &nbsp;</div>
                <br/>
                <br/>
            </div>
        );
    }
}
export default withRouter(CreateWrap);