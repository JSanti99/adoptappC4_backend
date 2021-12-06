const { gql } = require("apollo-server");

const petTypeDefs = gql`

    enum Sizes {
        LG
        MD
        SM
    }

    enum Status {
        RG
        RQ
        AP
        RT
    }

  type Pet {
    name:String!
    species:String!
    size:Sizes!
    age:Int!
    country:String!
    city:String!
    cohabitation_animals:Boolean!
    cohabitation_kids:Boolean!
    pathologies:Boolean!
    diseases_drugs:String!
    sterilized:Boolean!
    vaccinated:Boolean!
    vaccines:String!
    deworming:Boolean!
    dewormer:String!
    history:String!
    status:Status!
    image:String!
    created_at:String
    updated_at:String
    id:String
  }

  input PetInput {
    name:String!
    species:String!
    size:Sizes!
    age:Int!
    country:String!
    city:String!
    cohabitation_animals:Boolean!
    cohabitation_kids:Boolean!
    pathologies:Boolean!
    diseases_drugs:String!
    sterilized:Boolean!
    vaccinated:Boolean!
    vaccines:String!
    deworming:Boolean!
    dewormer:String!
    history:String!
    status:Status!
    image:String!
    created_at:String
    updated_at:String
    id:String
  }

  input UpdatePetInput{
    id: String!
    name:String!
    species:String!
    size:Sizes!
    age:Int!
    country:String!
    city:String!
    cohabitation_animals:Boolean!
    cohabitation_kids:Boolean!
    pathologies:Boolean!
    diseases_drugs:String!
    sterilized:Boolean!
    vaccinated:Boolean!
    vaccines:String!
    deworming:Boolean!
    dewormer:String!
    history:String!
    status:Status!
    image:String!
    created_at:String
    updated_at:String
  }
  
  type Mutation {
    createPet(petInput: PetInput): Pet!
    updatePet(petInput: UpdatePetInput): Pet!
  }

  extend type Query {
    getPets: [Pet]
  }

  extend type Query {
    getPetByPetId(petId: String!): Pet
  }
`;

module.exports = petTypeDefs;