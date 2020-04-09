import React, {Component} from 'react';

class DeleteFlower extends Component {
    flowerDeleted = () => {
        this.props.onFlowerDelete(this.props.match.params.id);
        window.setTimeout(() => {
            this.props.history.push('/')
        }, 3000)
    };
    render() {
        return (
            <div className="container">
                    <form className="form mt-5 mb-1 col-sm-6 p-6 text-white mx-auto text-center" onSubmit={this.flowerDeleted}>
                        <div className="row">
                            <div className="col-sm-9 p-3">
                                <h4 className="alert-heading">Flower Deleted!</h4>
                                You successfully deleted this flower, now let's go back and see the others. Who knows?
                                Maybe we'll make a new one...
                            </div>
                            <div className="col-sm-2 p-3">
                                <button type="submit" className="btn btn-lg mt-5 btn-create btn-outline-danger rounded-pill font-weight-bold"> Go Home
                                </button>
                            </div>
                        </div>
                    </form>
            </div>
        )
    }
}
export default DeleteFlower;