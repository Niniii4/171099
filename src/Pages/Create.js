// import React, {Component} from "react";
// import './MainOptions.css';
// import axios from '../Axios/axios'
// import qs from 'qs'
//
// class Create extends Component {
//     constructor() {
//         super();
//         this.state = {
//             flowers: [],
//             id: 0,
//             title: '',
//             description: '',
//             handmade: 0,
//             color: '',
//             size: '',
//             family: '',
//             type: '',
//             flowerWrap: '',
//             flowerDetails: ''
//         }
//         this.onCreate = this.onCreate.bind(this);
//     }
//
//     onCreate = event => {
//         event.preventDefault();
//         const flower = {
//             title: this.state.title,
//             description: this.state.description,
//             handmade: this.state.handmade,
//             color: this.state.color,
//             size: this.state.size,
//             family: this.state.family,
//             type: this.state.type,
//             flowerWrap: this.state.flowerWrap,
//             flowerDetails: this.state.flowerDetails
//         };
//         axios.post('http://localhost:3000/flowers/create', {flower}).then(res=>{
//             console.log(res);
//             console.log(res.data);
//         })
//     };
//
//     onChange = event =>{
//         this.setState({title: event.target.value, description: event.target.value, handmade: event.target.value,
//                             color: event.target.value, size: event.target.value, family: event.target.value,
//                             flowerWrap: event.target.value, flowerDetails: event.target.value});
//     }
//     render() {
//         return (
//             <div className="container">
//                 <form onSubmit={this.onCreate} className="form mt-5 mb-6 p-6 col-sm-6 text-white mx-auto text-center">
//                     <div className="form-group">
//                         <label htmlFor="giftName">Gift Name</label>
//                         <input type="text" className="form-control" id="title"
//                                aria-describedby="giftHelp" placeholder="My Gift Name" onChange={this.onChange}/>
//                             <small id="giftHelp" className="form-text text-muted">Insert a name for the gift you're making.</small>
//                     </div>
//                     <div className="form-group">
//                         <label htmlFor="giftDescription">Gift Description</label>
//                         <input type="text" className="form-control" id="description"
//                                aria-describedby="giftdHelp" placeholder="My Gift Description" onChange={this.onChange}/>
//                         <small id="giftdHelp" className="form-text text-muted">Insert a description for the gift you're making.</small>
//                     </div>
//                     <div className="form-group">
//                         <label htmlFor="giftDescription">Gift Color</label>
//                         <input type="text" className="form-control" id="color"
//                                aria-describedby="giftcHelp" placeholder="My Gift Color" onChange={this.onChange}/>
//                         <small id="giftcHelp" className="form-text text-muted">Insert a color for the gift you're making.</small>
//                     </div>
//                     <div className="form-group">
//                         <label htmlFor="giftDescription">Gift family</label>
//                         <input type="text" className="form-control" id="family"
//                                aria-describedby="giftfHelp" placeholder="My Gift Family" onChange={this.onChange}/>
//                         <small id="giftfHelp" className="form-text text-muted">Insert the flower's family.</small>
//                     </div>
//                     <div className="form-group">
//                         <label htmlFor="giftDescription">Wrapping</label>
//                         <input type="text" className="form-control" id="flowerWrap"
//                                aria-describedby="flowerWrap" placeholder="Wrapping name" onChange={this.onChange}/>
//                         <small id="flowerWrap" className="form-text text-muted">Fill this input if you want your flower wrapped.</small>
//                     </div>
//                     <div className="form-group">
//                         <label htmlFor="giftDescription">Details</label>
//                         <input type="text" className="form-control" id="flowerDetails"
//                                aria-describedby="flowerDetails" placeholder="Details names" onChange={this.onChange}/>
//                         <small id="flowerDetails" className="form-text text-muted">Fill this input if you want some details.</small>
//                     </div>
//                     <div className="form-group">
//                         <label htmlFor="size">Gift Size</label>
//                         <select className="form-control" id="size"  onChange={this.onChange}>
//                             <option>Large</option>
//                             <option>Medium</option>
//                             <option>Small</option>
//                     </select>
//                     </div>
//                     <div className="form-check">
//                         <input type="checkbox" className="form-check-input mt-2" id="handmade" onChange={this.onChange}/>
//                         <label className="form-check-label" htmlFor="handmade">Handmade</label>
//                     </div>
//                     <div> &nbsp; &nbsp;</div>
//                     <div>
//                     <button type="submit" className="btn btn-lg mb-6 btn-create btn-primary btn-block font-weight-bold">CREATE</button></div>
//
//                 </form>
//             </div>
//         );
//     }
// }
//
// export default Create;