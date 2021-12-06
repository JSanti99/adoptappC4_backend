//Se llama al typedef (esquema) de cada submodulo
const petTypeDefs = require("./pet_type_defs");
const requestPetTypeDefs = require("./request_pet_type_defs");
const authTypeDefs = require("./auth_type_defs");

//Se unen
const schemasArrays = [authTypeDefs,petTypeDefs,requestPetTypeDefs];

//Se exportan
module.exports = schemasArrays;