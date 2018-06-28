package br.com.camicado.pocgraphql4;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * Contains vote sub-queries
 */
public class VoteResolver implements GraphQLResolver<Vote> {
    public User user(Vote vote) {
        return new User("ads", "sadfasd","asfasd", "aasdfas");
    }
    
    public Link link(Vote vote) {
        return new Link("ads", "sadfasd","asfasd", "aasdfas");
    }
}