const usersResolver = {
    Query: {
      userDetailById: (_, { userId }, { dataSources, userIdToken }) => {
        if (userId == userIdToken) return dataSources.authAPI.getUser(userId);
        else return null;
      },
    },
    Mutation: {
      signUpUser: async (_, { userInput }, { dataSources }) => {
        const authInput = {
            name        :userInput.name,
            lastname    :userInput.lastname,
            IDKind      :userInput.IDKind,
            IDNumber    :userInput.IDNumber,
            address     :userInput.address,
            city        :userInput.city,
            country     :userInput.country,
            landline    :userInput.landline,
            mobilephone :userInput.mobilephone,
            jobs        :userInput.jobs,
            company     :userInput.company,
            username    :userInput.username,
            email       :userInput.email,
            password    :userInput.password,
            rol         :userInput.rol,
        };
        return await dataSources.authAPI.createUser(authInput);
      },
      logIn: (_, { credentials }, { dataSources }) =>
        dataSources.authAPI.authRequest(credentials),
      refreshToken: (_, { refresh }, { dataSources }) =>
        dataSources.authAPI.refreshToken(refresh),
    },
  };
  
  module.exports = usersResolver;