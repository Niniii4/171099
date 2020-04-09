import React, {Component} from 'react';
import {withRouter} from 'react-router-dom';

class CreateOrder extends Component{
    orderCreate = (e) => {
        e.preventDefault();
        const newOrder={
            "name": e.target.name.value,
            "surname": e.target.surname.value,
            "email": e.target.email.value,
            "address": e.target.address.value,
            "phone": e.target.phone.value,
            "numOrders": e.target.numOrders.value,
            "orderGifts": this.props.location.update.orderGifts
        };
        this.props.onOrderAdd(newOrder);
        window.setTimeout(() => {
            this.props.history.push('/')
        }, 1000)
    };
    render() {
        return (
            <div>
                <div className="container pb-4 mb-6">
                    <form onSubmit={this.orderCreate}
                          className="form mt-5 mb-1 p-4 text-white mx-auto text-center">
                        <h2>FILL IN THIS FORM</h2>
                        <h4>Enter informations in order to succesfully ship your order</h4>
                        <div className="row">
                            <div className="col">
                                <div className="row form-group mt-3">
                                    <div className="col-sm-6">
                                        <label htmlFor="Name">Name</label>
                                        <input type="text" className="form-control" id="name" name={"name"}
                                               placeholder="Enter your name">
                                        </input>
                                    </div>
                                    <div className="col-sm-6">
                                        <label htmlFor="Surname">Surname</label>
                                        <input type="text" className="form-control" id="surname"
                                               name={"surname"}
                                               placeholder="Enter your surname">
                                        </input>
                                    </div>
                                </div>
                                <div className="row form-group mt-2">
                                    <div className="col-sm-6">
                                        <label htmlFor="email">E-mail</label>
                                        <input type="text" className="form-control" id="email" name={"email"}
                                               placeholder="my_email@something.com">
                                        </input>
                                    </div>
                                    <div className="col-sm-6">
                                        <label htmlFor="address">Address</label>
                                        <input type="text" className="form-control" id="address" name={"address"}
                                               placeholder="Where should we ship your order">
                                        </input>
                                    </div>
                                </div>
                                <div className="row form-group mt-2">
                                    <div className="col-sm-6">
                                        <label htmlFor="phone">Phone number</label>
                                        <input type="text" className="form-control" id="phone" name={"phone"}
                                               placeholder="223 305">
                                        </input>
                                    </div>
                                    <div className="col-sm-6">
                                        <label htmlFor="numOrders">Quantity of orders</label>
                                        <input type="text" className="form-control" id="numOrders" name={"numOrders"}
                                               placeholder="eg.">
                                        </input>
                                    </div>

                                </div>
                                <div className="row form-group mt-2">
                                    <div className="col-sm-6">
                                    <label htmlFor="numOrders">Your order</label>
                                    <input type="text" className="form-control"
                                           placeholder={this.props.location.update.title} readOnly>
                                    </input>
                                    </div>
                                    <div className="col-sm-6 mt-3">
                                        <button type="submit"
                                                className="btn btn-lg mt-3 btn-create btn-outline-success btn-block font-weight-bold">ORDER
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                    <div> &nbsp; &nbsp;</div>
                    <br/>
                    <br/>
                </div>
            </div>
        )
    }
}export default withRouter(CreateOrder);