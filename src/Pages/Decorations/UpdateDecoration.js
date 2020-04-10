import React, {Component} from "react";
import '../../MainOptions/MainOptions.css';
import Fairy from "../../Loading/Fairy";

class UpdateDecoration extends Component {
    decorUpdated = (e) => {
        e.preventDefault();
        const updatedDecor = {
            "name": e.target.name.value,
            "size": e.target.size.value,
            "color": e.target.color.value,
            "quantity": e.target.quantity.value,
        };
        this.props.onDecorUpdate(updatedDecor, this.props.match.params.name);
        window.setTimeout(() => {
            this.props.history.push('/details')
        }, 1000)
    };

    render() {
        return (
            <div>
                <div className="container pb-4 mb-6">
                    <form onSubmit={this.decorUpdated}
                          className="form mt-5 mb-1 p-4 text-white mx-auto text-center">
                        <h2>UPDATE THIS DECORATION</h2>
                        <h4>Rewrite what you like, rename what you don't</h4>
                        <div className="row">
                            <div className="col-sm-9">
                                <div className="row form-group mt-3">
                                    <div className="col-sm-6">
                                        <label htmlFor="giftName">Name</label>
                                        <input type="text" className="form-control" id="name" name={"name"}
                                               aria-describedby="decorname"
                                               placeholder={this.props.match.params.name} readOnly>
                                        </input>
                                    </div>
                                    <div className="col-sm-6">
                                        <label htmlFor="giftDescription">Color</label>
                                        <input type="text" className="form-control" id="color"
                                               name={"color"} aria-describedby="decorcolor"
                                               placeholder={this.props.location.update.color}>
                                        </input>
                                    </div>
                                </div>
                                <div className="row form-group mt-2">
                                    <div className="col-sm-6">
                                        <label htmlFor="giftDescription">Size</label>
                                        <input type="text" className="form-control" id="size" name={"size"}
                                               aria-describedby="decorsize"
                                               placeholder={this.props.location.update.size}>
                                        </input>
                                    </div>
                                    <div className="col-sm-6">
                                        <label htmlFor="giftDescription">Quantity</label>
                                        <input type="text" className="form-control" id="quantity" name={"quantity"}
                                               aria-describedby="decorquantity"
                                               placeholder={this.props.location.update.quantity}>
                                        </input>
                                    </div>
                                </div>
                                <div className="row form-group mt-2">
                                    <div className="col">
                                        <button type="submit"
                                                className="btn btn-lg mt-3 btn-create btn-outline-success btn-block font-weight-bold">UPDATE
                                        </button>
                                    </div>
                                </div>
                            </div>
                            <div className="col-sm-3">
                                <Fairy/>
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
export default UpdateDecoration;