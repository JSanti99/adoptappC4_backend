
const requestPetResolver = {

    Query: {
        getRequestPetByUserId: (_, { userId }, { dataSources, userIdToken }) => {
          if (userId == userIdToken) return dataSources.requestAPI.requestPetByUserId(userId);
          else return null;
        },
    },

    Mutation: {
        createRequestPet: async (_, { requestPetInput }, { dataSources }) => {
            const newRequestPetInput = {
                id: requestPetInput.id, 
                user: requestPetInput.user, 
                pet: requestPetInput.pet, 
                created_at: requestPetInput.created_at, 
                request_kind: requestPetInput.request_kind, 
                finalized_at: requestPetInput.finalized_at, 

            };
            return await dataSources.requestAPI.createRequestPet(newRequestPetInput);
        },
    },
  };
  
  module.exports = requestPetResolver;