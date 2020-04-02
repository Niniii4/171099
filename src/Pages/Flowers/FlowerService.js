import axios from 'axios';

const USER_API_BASE_URL = 'http://localhost:8080/flowers';

class FlowerService {

    getAllFlowers() {
        return axios.get(USER_API_BASE_URL);
    }

    // fetchUserById(userId) {
    //     return axios.get(USER_API_BASE_URL + '/' + userId);
    // }
    //
    deleteFlower(id) {
        return axios.delete(USER_API_BASE_URL + '/' + id);
    }
    //
    addFlower(flower) {
        return axios.post(""+USER_API_BASE_URL, flower);
    }

    editFlower(id) {
        return axios.put(USER_API_BASE_URL + '/update' + id);
    }

}

export default new FlowerService();
