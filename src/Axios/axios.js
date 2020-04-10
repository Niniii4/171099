import axios from 'axios';
import qs from 'qs';

const GiftsService = {
    loadFlowers: () => {
        return axios.get('http://localhost:8080/flowers', {
            headers: {'Content-Type':'application/json',
                'Access-Control-Allow-Origin': '*'}
        })
    },
    createFlower: (newFlower) => {
        const formParams = qs.stringify(newFlower);
        return axios.post("http://localhost:8080/flowers/create", formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }
        })
    },
    updateFlower: (flower, id) => {
        let urlString = "http://localhost:8080/flowers/update/" + id;
        const formParams = qs.stringify(flower);
        return axios.patch(urlString, formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }
        })
    },
    deleteFlower: (id) => {
        let urlString="http://localhost:8080/flowers/delete/" + id;
        return axios.delete(urlString, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }});
    },
    loadWrappings: () => {
        return axios.get('http://localhost:8080/wrappings', {
            headers: {'Content-Type':'application/json',
                'Access-Control-Allow-Origin': '*'}
        })
    },
    createWrapping: (newWrap) => {
        const formParams = qs.stringify(newWrap);
        return axios.post("http://localhost:8080/wrappings/create", formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }
        })
    },
    updateWrapping: (wrap, id) => {
        let urlString = "http://localhost:8080/wrappings/update/" + id;
        const formParams = qs.stringify(wrap);
        return axios.patch(urlString, formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }
        })
    },
    deleteWrapping: (id) => {
        let urlString="http://localhost:8080/wrappings/delete/" + id;
        return axios.delete(urlString, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }});
    },
    loadOrnaments: () => {
        return axios.get('http://localhost:8080/ornaments', {
            headers: {'Content-Type':'application/json',
                'Access-Control-Allow-Origin': '*'}
        })
    },
    createOrnament: (newOrnament) => {
        const formParams = qs.stringify(newOrnament);
        return axios.post("http://localhost:8080/ornaments/create", formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }
        })
    },
    updateOrnament: (ornament, id) => {
        let urlString = "http://localhost:8080/ornaments/update/" + id;
        const formParams = qs.stringify(ornament);
        return axios.patch(urlString, formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }
        })
    },
    deleteOrnament: (id) => {
        let urlString="http://localhost:8080/ornaments/delete/" + id;
        return axios.delete(urlString, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }});
    },
    createOrder: (order) => {
        let urlString = "http://localhost:8080/orders/create";
        const formParams = qs.stringify(order);
        return axios.post(urlString, formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }
        })
    },
    loadDecorations: () => {
        return axios.get('http://localhost:8080/details', {
            headers: {'Content-Type':'application/json',
                'Access-Control-Allow-Origin': '*'}
        })
    },
    updateDecoration: (decor, name) => {
        let urlString = "http://localhost:8080/details/update/" + name;
        const formParams = qs.stringify(decor);
        return axios.patch(urlString, formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            }
        })
    },
}
export default GiftsService;
