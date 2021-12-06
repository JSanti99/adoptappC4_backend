const { RESTDataSource } = require("apollo-datasource-rest");

const serverConfig = require("../server");

class RequestAPI extends RESTDataSource {

  constructor() {

    super();
    this.baseURL = serverConfig.request_api_url;
  }

  async createPet(pet) {
    pet = new Object(JSON.parse(JSON.stringify(pet)));
    return await this.post("/pet", pet);
  }

  async updatePet(pet) {
    pet = new Object(JSON.parse(JSON.stringify(pet)));
    return await this.put(`/pet/update/${pet.id}`, pet);
  }

  async getPets() {
    return await this.get(`/pet/details`);
  }

  async getPetByPetId(petId) {
    return await this.get(`/pet/detail/${petId}`);
  }

  async createRequestPet(requestPet) {
    requestPet = new Object(JSON.parse(JSON.stringify(requestPet)));
    return await this.post("/requestPet", requestPet);
  }

  async requestPetByUserId(userId) {
    return await this.get(`/requestPet/details/${userId}`);
  }
}

module.exports = RequestAPI;
