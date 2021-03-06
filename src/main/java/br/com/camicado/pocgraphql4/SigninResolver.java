package br.com.camicado.pocgraphql4;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * Contains SigninPayload sub-queries
 */
public class SigninResolver implements GraphQLResolver<SigninPayload> {

    public User user(SigninPayload payload) {
        return payload.getUser();
    }
}
