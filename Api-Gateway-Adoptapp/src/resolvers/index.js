const petResolver = require('./pet_resolver');
const requestPetResolver = require('./request_pet_resolver');
const authResolver = require('./auth_resolver');

const lodash = require('lodash');

const resolvers = lodash.merge(authResolver,petResolver,requestPetResolver);

module.exports = resolvers;