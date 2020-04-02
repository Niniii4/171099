import React, {Component} from 'react';
import MainOptions from "./Pages/MainOptions";
import Informations from "./Footer/Informations";
import '../node_modules/font-awesome/css/font-awesome.min.css';
import '../node_modules/bootstrap/dist/css/bootstrap-grid.min.css';
import '../node_modules/bootstrap/dist/css/bootstrap-reboot.min.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Navbar from "./Header/Navbar";
import './App.css';
import {BrowserRouter as Router, Redirect, Route} from 'react-router-dom';
import Wrappings from "./Pages/Wrappings";
import AllFlowers from "./Pages/Flowers/AllFlowers";
import Ornaments from "./Pages/Ornaments";
import Decorations from "./Pages/Decorations";
import Create from "./Pages/Create";
import Loading from "./Loading/Loading";
import Loading2 from "./Loading/Loading2";
import Loading3 from "./Loading/Loading3";
import AddFlower from "./Pages/Flowers/AddFlower";
import FlowerService from "./Pages/Flowers/FlowerService";

class App extends Component {

    constructor(props) {
        super(props);
        this.state = {
            flowers: [],
        }
    }

    createFlower= (newFlower) => {
        FlowerService.addFlower(newFlower).then((response)=>{
            const newFlower = response.data;
            this.setState((prevState) => {
                const newFlowers = [...prevState.flowers, newFlower];
                return {
                    "flowers": newFlowers
                }
            });
        });
    }


    render() {
        const routing = (
            <div>
            <Router>
                <div className="main">
                    <section id="cover" className="min-vh-100">
                    <Navbar/>
                    <Route path={"/"} exact render={() => <MainOptions/>}/>
                    <Route path={"/flowers"} exact render={() => <AllFlowers/>}/>
                    <Route path={"/wrappings"} exact render={() => <Wrappings/>}/>
                    <Route path={"/ornaments"} exact render={() => <Ornaments/>}/>
                    <Route path={"/decorations"} exact render={() => <Decorations/>}/>
                    <Route path={"/flowers/create"} exact render={() => <AddFlower onNewFlowerAdd={this.createFlower}/>}>
                    </Route>
                        <Informations/>
                        <Redirect to={"/"}/>
                    </section>
                </div>
            </Router>
            </div>
        );
        return (
            <div className="App">
                {routing}
            </div>
        );
    }

}

export default App;
