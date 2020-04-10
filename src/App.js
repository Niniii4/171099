import React, {Component} from 'react';
import MainOptions from "./MainOptions/MainOptions";
import Informations from "./Footer/Informations";
import '../node_modules/font-awesome/css/font-awesome.min.css';
import '../node_modules/bootstrap/dist/css/bootstrap-grid.min.css';
import '../node_modules/bootstrap/dist/css/bootstrap-reboot.min.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Navbar from "./Header/Navbar";
import {BrowserRouter as Router, Redirect, Route} from 'react-router-dom';
import AllFlowers from "./Pages/Flowers/AllFlowers";
import Decorations from "./Pages/Decorations/Decorations";
import CreateFlower from "./Pages/Flowers/CreateFlower";
import Contact from "./Header/Contact";
import GiftsService from "./Axios/axios";
import UpdateFlower from "./Pages/Flowers/UpdateFlower";
import DeleteFlower from "./Pages/Flowers/DeleteFlower";
import AllWrappings from "./Pages/Wrappings/AllWrappings";
import CreateWrap from "./Pages/Wrappings/CreateWrap";
import UpdateWrap from "./Pages/Wrappings/UpdateWrap";
import DeleteWrap from "./Pages/Wrappings/DeleteWrap";
import AllOrnaments from "./Pages/Ornaments/AllOrnaments";
import CreateOrnament from "./Pages/Ornaments/CreateOrnament";
import UpdateOrnament from "./Pages/Ornaments/UpdateOrnament";
import DeleteOrnament from "./Pages/Ornaments/DeleteOrnament";
import CreateOrder from "./Pages/Orders/CreateOrder";
import About from "./Header/About";
import AllDecorations from "./Pages/Decorations/AllDecorations";
import UpdateDecoration from "./Pages/Decorations/UpdateDecoration";

class App extends Component {

    constructor(props) {
        super(props);
        this.state = {
            flowers: [],
            wrappings: [],
            ornaments: [],
            decorations: []
        }
    }
    loadFlowers = () => {
        GiftsService.loadFlowers().then((res) => {
            console.log(res);
            this.setState({
                flowers: res.data
            });
        })
    };
    createFlower = (newFlower) => {
        GiftsService.createFlower(newFlower);
    };
    deleteFlower = (id) => {
        GiftsService.deleteFlower(id);
    };
    updateFlower = (flower, id) => {
        GiftsService.updateFlower(flower, id);
    };
    loadWrappings = () => {
        GiftsService.loadWrappings().then((res) => {
            console.log(res);
            this.setState({
                wrappings: res.data
            });
        })
    };
    createWrapping = (newWrap) => {
        GiftsService.createWrapping(newWrap);
    };
    deleteWrapping = (id) => {
        GiftsService.deleteWrapping(id);
    };
    updateWrapping = (wrap, id) => {
        GiftsService.updateWrapping(wrap, id);
    };
    loadOrnaments= () => {
        GiftsService.loadOrnaments().then((res) => {
            console.log(res);
            this.setState({
                ornaments: res.data
            });
        })
    };
    createOrnament = (newOrnament) => {
        GiftsService.createOrnament(newOrnament);
    };
    deleteOrnament = (id) => {
        GiftsService.deleteOrnament(id);
    };
    updateOrnament = (wrap, id) => {
        GiftsService.updateOrnament(wrap, id);
    };
    createOrder = (order) => {
        GiftsService.createOrder(order);
    };
    loadDecorations= () => {
        GiftsService.loadDecorations().then((res) => {
            console.log(res);
            this.setState({
               decorations: res.data
            });
        })
    };
    updateDecoration = (decor, name) => {
        GiftsService.updateDecoration(decor, name);
    };
    render() {
        const routing = (
            <div>
            <Router>
                <div className="main">
                    <section id="cover" className="min-vh-100">
                    <Navbar/>
                    <Route path={"/contact"} exact render={() => <Contact/>}/>
                    <Route path={"/about"} exact render={() => <About/>}/>
                    <Route path={"/"} exact render={() => <MainOptions/>}/>
                    <Route path={"/flowers"} exact render={() => <AllFlowers onFlowerClick={this.loadFlowers()} flowers={this.state.flowers} />}/>
                    <Route path={"/flowers/create"} exact render={() => <CreateFlower onNewFlowerAdd={this.createFlower}/>}/>
                    <Route path='/flowers/update/:id' render={(props) => <UpdateFlower {...props} onFlowerUpdate={this.updateFlower}/>}/>
                    <Route path='/flowers/delete/:id' render={(props) => <DeleteFlower {...props} onFlowerDelete={this.deleteFlower}/>}/>
                    <Route path={"/wrappings"} exact render={() => <AllWrappings onWrapClick={this.loadWrappings()} wrappings={this.state.wrappings} />}/>
                    <Route path={"/wrappings/create"} exact render={() => <CreateWrap onNewWrapAdd={this.createWrapping}/>}/>
                    <Route path='/wrappings/update/:id' render={(props) => <UpdateWrap {...props} onWrapUpdate={this.updateWrapping}/>}/>
                    <Route path='/wrappings/delete/:id' render={(props) => <DeleteWrap {...props} onWrapDelete={this.deleteWrapping}/>}/>
                    <Route path={"/ornaments"} exact render={() => <AllOrnaments onOrnamentClick={this.loadOrnaments()} ornaments={this.state.ornaments} />}/>
                    <Route path={"/ornaments/create"} exact render={() => <CreateOrnament onNewOrnamentAdd={this.createOrnament}/>}/>
                    <Route path='/ornaments/update/:id' render={(props) => <UpdateOrnament {...props} onOrnamentUpdate={this.updateOrnament}/>}/>
                    <Route path='/ornaments/delete/:id' render={(props) => <DeleteOrnament {...props} onOrnamentDelete={this.deleteOrnament}/>}/>
                    <Route path="/orders/create" exact render={(props) =>  <CreateOrder {...props}  onOrderAdd={this.createOrder}/>}/>
                    <Route path={"/details"} exact render={() => <AllDecorations onDecorClick={this.loadDecorations()} decorations={this.state.decorations} />}/>
                    <Route path='/details/update/:name' render={(props) => <UpdateDecoration {...props} onDecorUpdate={this.updateDecoration}/>}/>
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
