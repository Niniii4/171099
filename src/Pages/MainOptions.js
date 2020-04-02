import React, {Component} from "react";
import './MainOptions.css';
import {Link, Route} from 'react-router-dom';
import Loading2 from "../Loading/Loading2";
import Loading3 from "../Loading/Loading3";
import Loading from "../Loading/Loading";

class MainOptions extends Component {
    render() {
        const routing = (
                <div className="container MainOptions">
                   <Loading3/>
                    <Link className="nav-link" to={"/flowers"}>
                        <button type="button" role="button" className="btn btn-lg fa fa-certificate" aria-pressed="true">
                            <div>Flowers</div>
                        </button>
                    </Link>
                    &nbsp; &nbsp; &nbsp; &nbsp;
                    <Link className="nav-link" to={"/wrappings"}>
                        <button type="button" role="button" className="btn btn-lg fa fa-gift" aria-pressed="true">
                            <div>Wrappings</div>
                        </button>
                    </Link>
                    <Loading/>
                    &nbsp; &nbsp; &nbsp; &nbsp;
                    <Link className="nav-link" to={"/ornaments"}>
                        <button type="button" role="button" className="btn btn-lg fa fa-diamond" aria-pressed="true">
                            <div>Ornaments</div>
                        </button>
                    </Link>
                    &nbsp; &nbsp; &nbsp; &nbsp;
                    <Link className="nav-link" to={"/decorations"}>
                        <button type="button" role="button" className="btn btn-lg fa fa-asl-interpreting" aria-pressed="true">
                            <div>Decorations</div>
                        </button>
                    </Link>
                    <Loading2/>
                </div>

        );
        return (
            <div className="MainOptions">
                {routing}
            </div>
        );
    }
}

export default MainOptions;