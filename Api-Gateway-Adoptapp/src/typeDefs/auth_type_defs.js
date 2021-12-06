const { gql } = require("apollo-server");

const authTypeDefs = gql`
  type Tokens {
    refresh: String!
    access: String!
  }
  type Access {
    access: String!
  }
  input CredentialsInput {
    username: String!
    password: String!
  }
  input SignUpInput {
    name: String!
    lastname: String!
    IDKind: String!
    IDNumber: String!
    address: String!
    city: String!
    country: String!
    landline: String!
    mobilephone: String!
    jobs: String!
    company: String!
    username: String!
    email: String!
    password: String!
    rol: String!
  }
  type UserDetail {
    name: String!
    lastname: String!
    IDKind: String!
    IDNumber: String!
    address: String!
    city: String!
    country: String!
    landline: String!
    mobilephone: String!
    jobs: String!
    company: String!
    username: String!
    email: String!
    rol: String!
  }
  type Mutation {
    signUpUser(userInput: SignUpInput): Tokens!
    logIn(credentials: CredentialsInput!): Tokens!
    refreshToken(refresh: String!): Access!
  }
  type Query {
    userDetailById(userId: Int!): UserDetail!
  }
`;

module.exports = authTypeDefs;