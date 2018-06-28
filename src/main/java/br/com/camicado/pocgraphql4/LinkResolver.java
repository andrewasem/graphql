package br.com.camicado.pocgraphql4;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * Contains Link sub-queries
 */
public class LinkResolver implements GraphQLResolver<Link> {

    public User postedBy(Link link) {
        if (link.getUserId() == null) {
            return null;
        }
        return null;
    }
}
