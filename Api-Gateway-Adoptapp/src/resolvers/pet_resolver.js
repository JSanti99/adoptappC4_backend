
const petResolver = {
    Query: {
        getPetByPetId: async (_,{ petId },{ dataSources}) => {
            console.log({petId})
            return await dataSources.requestAPI.getPetByPetId(petId);
        },

        getPets: async (_,__,{dataSources}) => {
            return await dataSources.requestAPI.getPets();
        },
    },
    Mutation: {
        createPet: async (_, { petInput }, { dataSources }) => {
            const newPetInput = {
                name                    : petInput.name, 
                species                 : petInput.species,
                size                    : petInput.size,
                age                     : petInput.age,
                country                 : petInput.country,
                city                    : petInput.city,
                cohabitation_animals    : petInput.cohabitation_animals,
                cohabitation_kids       : petInput.cohabitation_kids,
                pathologies             : petInput.pathologies,
                diseases_drugs          : petInput.diseases_drugs,
                sterilized              : petInput.sterilized,
                vaccinated              : petInput.vaccinated,
                vaccines                : petInput.vaccines,
                deworming               : petInput.deworming,
                dewormer                : petInput.dewormer,
                history                 : petInput.history,
                status                  : petInput.status,
                image                   : petInput.image,
                created_at              : petInput.created_at,
                updated_at              : petInput.updated_at,
                id                      : petInput.id,
            };
            return await dataSources.requestAPI.createPet(newPetInput);
        },

        updatePet: async (_, { petInput }, { dataSources }) => {
            const updatePetInput = {
                name                    : petInput.name, 
                species                 : petInput.species,
                size                    : petInput.size,
                age                     : petInput.age,
                country                 : petInput.country,
                city                    : petInput.city,
                cohabitation_animals    : petInput.cohabitation_animals,
                cohabitation_kids       : petInput.cohabitation_kids,
                pathologies             : petInput.pathologies,
                diseases_drugs          : petInput.diseases_drugs,
                sterilized              : petInput.sterilized,
                vaccinated              : petInput.vaccinated,
                vaccines                : petInput.vaccines,
                deworming               : petInput.deworming,
                dewormer                : petInput.dewormer,
                history                 : petInput.history,
                status                  : petInput.status,
                image                   : petInput.image,
                created_at              : petInput.created_at,
                updated_at              : petInput.updated_at,
                id                      : petInput.id,
            };
            return await dataSources.requestAPI.updatePet(updatePetInput);
        },

    },
  };
  
  module.exports = petResolver;