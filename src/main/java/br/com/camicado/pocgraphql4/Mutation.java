package br.com.camicado.pocgraphql4;

import java.time.Instant;
import java.time.ZoneOffset;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import graphql.GraphQLException;
import graphql.schema.DataFetchingEnvironment;

/**
 * Mutation root
 */
public class Mutation implements GraphQLMutationResolver {
   

    public Link createLink(String url, String description, DataFetchingEnvironment env) {
        AuthContext context = env.getContext();
        Link newLink = new Link(url, description, context.getUser().getId());
        return newLink;
    }
    
    public User createUser(String name, AuthData auth) {
        User newUser = new User(name, auth.getEmail(), auth.getPassword());
        return newUser;
    }

    public SigninPayload signinUser(AuthData auth) {
        User user = new User("Teste", auth.getEmail(), auth.getPassword());
        if (user.getPassword().equals(auth.getPassword())) {
            return new SigninPayload(user.getId(), user);
        }
        throw new GraphQLException("Invalid credentials");
    }
    
    public Vote createVote(String linkId, String userId) {
        return new Vote(Instant.now().atZone(ZoneOffset.UTC), userId, linkId);
    }
}
