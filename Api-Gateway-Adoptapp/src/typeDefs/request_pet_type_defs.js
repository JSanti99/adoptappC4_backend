const { gql } = require("apollo-server");

const requestPetTypeDefs = gql`

    enum RequestKind {
        AD
        HD
    }

  type RequestPet {
    id:String
    user:Int!
    pet:String!
    created_at:String
    request_kind:RequestKind!
    finalized_at:String
  }

  input RequestPetInput{
    id:String
    user:Int!
    pet:String!
    created_at:String
    request_kind:RequestKind!
    finalized_at:String
  }

  type Mutation {
    createRequestPet(requestPetInput: RequestPetInput): RequestPet!
  }

  extend type Query {
    getRequestPetByUserId(userId: Int!): [RequestPet]!
  }
`;

module.exports = requestPetTypeDefs;