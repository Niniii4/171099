import React, {Component} from "react";
import '../../MainOptions/MainOptions.css';
import {withRouter} from 'react-router-dom';

class CreateOrnament extends Component {
    ornamentCreated = (e) => {
        e.preventDefault();
        const newOrnament={
            "id": e.target.id.value,
            "title": e.target.title.value,
            "description": e.target.description.value,
            "handmade": e.target.handmade.value,
            "color": e.target.color.value,
            "size": e.target.size.value,
            "breakable": e.target.breakable.value,
            "material": e.target.material.value
        };
        this.props.onNewOrnamentAdd(newOrnament);
        window.setTimeout(() => {
            this.props.history.push('/ornaments')
        }, 1000)
    };

    render() {
        return (
            <div className="container pb-5 mb-6">
                <form onSubmit={this.ornamentCreated} className="form mt-5 mb-6 p-6 col-sm-6 text-white mx-auto text-center">
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
                        <label htmlFor="giftDescription">Material</label>
                        <input type="text" className="form-control" id="material" name={"material"}
                               aria-describedby="giftytHelp" placeholder="Material which is made of"/>
                        <small id="gifttyHelp" className="form-text text-muted">Insert a material for the gift you're making.</small>
                    </div>
                    <div className="form-group">
                        <label htmlFor="size">Breakable</label>
                        <select className="form-control" id="breakable"  name={"breakable"}>
                            <option>Yes</option>
                            <option>No</option>
                            <option>Partly</option>
                        </select>
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
export default withRouter(CreateOrnament);