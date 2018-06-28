package br.com.camicado.pocgraphql4;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

/**
 * Query root. Contains top-level queries.
 */
class Query implements GraphQLQueryResolver {


    public List<Link> allLinks(LinkFilter filter, Number skip, Number first) {
        return null;
    }
}
