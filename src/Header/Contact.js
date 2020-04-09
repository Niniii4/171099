import React, {Component} from 'react';
import Carousel from 'react-bootstrap/Carousel';
import {Image} from "react-bootstrap";

class Contact extends Component{
    render() {
        return (
            <div className="container">
                <Carousel>
                    <Carousel.Item>
                        <Image
                            className="mx-auto d-block w-75"
                            src="https://i.pinimg.com/originals/06/d9/fe/06d9fea41a8d8897a1c898f8edf479d1.jpg"
                            alt="First slide" rounded thumbnail
                        />
                        <Carousel.Caption>
                            <h3 className="bg-light rounded-pill text-danger">CONTACT US IN MACEDONIA</h3>
                            <p className="bg-light rounded-pill text-danger">
                            Our phone numbers are +389 74 223 305  |  +389 73 333 305
                            </p>
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <Image
                            className="mx-auto d-block w-75"
                            src="https://i.pinimg.com/564x/72/47/8e/72478ee1fd0f3a0d9629a6888dd5827b.jpg"
                            alt="Second Slide" rounded thumbnail
                        />

                        <Carousel.Caption>
                            <h3 className="bg-light rounded-pill text-danger">OFFICE</h3>
                            <p className="bg-light rounded-pill text-danger">Our office in Macedonia is located in Skopje on street address: Roosevelt no.3</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <Image
                            className="mx-auto d-block w-75"
                            src="https://i.pinimg.com/originals/0b/06/f0/0b06f0025081946fb9615c438141c687.jpg"
                            alt="Third slide" rounded thumbnail
                        />

                        <Carousel.Caption>
                            <h3 className="bg-light rounded-pill text-danger">CONTACT US IN COLOMBIA</h3>
                            <p className="bg-light rounded-pill text-danger">Our phone numbers are +30828 225 48 48 62  |  +30828 056 69 96 36</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <Image
                            className="mx-auto d-block w-75"
                            src="https://i.pinimg.com/564x/8e/7e/52/8e7e5257b9f41f4f6c7faf6822320de1.jpg"
                            alt="Fourth slide" rounded thumbnail
                        />
                        <Carousel.Caption>
                            <h3 className="bg-light rounded-pill text-danger">OFFICE</h3>
                            <p className="bg-light rounded-pill text-danger">Our office in Columbia is located in Bogota on street address: Carrera 57a</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                </Carousel>
            </div>
    );
    }
    }
    export default Contact;