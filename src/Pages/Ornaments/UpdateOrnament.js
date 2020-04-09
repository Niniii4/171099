import React, {Component} from "react";
import '../../MainOptions/MainOptions.css';
import Diamond from "../../Loading/Diamond";

class UpdateOrnament extends Component {
    ornamentUpdated = (e) => {
        e.preventDefault();
        const updatedOrnament = {
            "title": e.target.title.value,
            "description": e.target.description.value,
            "color": e.target.color.value,
            "size": e.target.size.value,
            "breakable": e.target.breakable.value,
            "material": e.target.material.value
        };
        this.props.onOrnamentUpdate(updatedOrnament, this.props.match.params.id);
        window.setTimeout(() => {
            this.props.history.push('/ornaments')
        }, 1000)
    };

    render() {
        return (
            <div>
                <div className="container pb-4 mb-6">
                    <form onSubmit={this.ornamentUpdated}
                          className="form mt-5 mb-1 p-4 text-white mx-auto text-center">
                        <h2>UPDATE YOUR ORNAMENT</h2>
                        <h4>Rewrite what you like, rename what you don't</h4>
                        <div className="row">
                            <div className="col-sm-7">
                                <div className="row form-group mt-3">
                                    <div className="col-sm-6">
                                        <label htmlFor="giftName">Gift Name</label>
                                        <input type="text" className="form-control" id="title" name={"title"}
                                               aria-describedby="giftHelp"
                                               placeholder={this.props.location.update.title}>
                                        </input>
                                    </div>
                                    <div className="col-sm-6">
                                        <label htmlFor="giftDescription">Gift Description</label>
                                        <input type="text" className="form-control" id="description"
                                               name={"description"} aria-describedby="giftdHelp"
                                               placeholder={this.props.location.update.description}>
                                        </input>
                                    </div>
                                </div>
                                <div className="row form-group mt-2">
                                    <div className="col-sm-6">
                                        <label htmlFor="giftColor">Gift Color</label>
                                        <input type="text" className="form-control" id="color" name={"color"}
                                               aria-describedby="giftcHelp"
                                               placeholder={this.props.location.update.color}>
                                        </input>
                                    </div>
                                    <div className="col-sm-6">
                                        <label htmlFor="giftMaterial">Gift material</label>
                                        <input type="text" className="form-control" id="material" name={"material"}
                                               aria-describedby="giftfHelp"
                                               placeholder={this.props.location.update.material}>
                                        </input>
                                    </div>
                                </div>
                                <div className="row form-group mt-2">
                                    <div className="col-sm-6">
                                        <label htmlFor="size">Gift Size</label>
                                        <select className="form-control" id="size" name={"size"}>
                                            <option>Large</option>
                                            <option>Medium</option>
                                            <option>Small</option>
                                        </select>
                                    </div>
                                    <div className="col-sm-6">
                                        <label htmlFor="breakable">Breakable</label>
                                        <select className="form-control" id="breakable" name={"breakable"}>
                                            <option>Yes</option>
                                            <option>No</option>
                                            <option>Partly</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="row form-group mt-2">
                                    <div className="col">
                                        <button type="submit"
                                                className="btn btn-lg mt-3 btn-create btn-outline-warning btn-block font-weight-bold">UPDATE
                                        </button>
                                    </div>
                                </div>
                            </div>
                            <div className="col-sm-5">
                                <Diamond/>
                            </div>
                        </div>
                    </form>
                    <div> &nbsp; &nbsp;</div>
                    <br/>
                    <br/>
                </div>
            </div>
        );
    }
}
export default UpdateOrnament;