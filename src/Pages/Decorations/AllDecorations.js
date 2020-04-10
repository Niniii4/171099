import React, {Component} from "react";
import '../../MainOptions/MainOptions.css';
import Decorations from "./Decorations";

class AllDecorations extends Component {
    render() {
        return (
            <div className="container">
                <div className="row m-0">
                    <table className="table table-hover table-danger">
                        <thead>
                            <th scope="col">
                                <td>Name </td>
                                <td>Size</td>
                                <td>Color</td>
                                <td>Quantity</td>
                                <td>Edit</td>

                            </th>

                        </thead>
                        <tbody>
                        {this.props.decorations.map((decor) =>
                            <tr key={decor.name}>
                                <Decorations
                                    name={decor.name}
                                    size={decor.size}
                                    color={decor.color}
                                    quantity={decor.quantity}
                                />
                            </tr>
                        )}
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default AllDecorations;
