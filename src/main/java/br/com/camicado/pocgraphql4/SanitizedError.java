package br.com.camicado.pocgraphql4;

import com.fasterxml.jackson.annotation.JsonIgnore;

import graphql.ExceptionWhileDataFetching;
import graphql.execution.ExecutionPath;
import graphql.language.SourceLocation;

/**
 * A simple wrapper that prevents stack traces from reaching the client 
 */
public class SanitizedError extends ExceptionWhileDataFetching {
    
    public SanitizedError(ExecutionPath arg0, Throwable arg1, SourceLocation arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    @JsonIgnore
    public Throwable getException() {
        return super.getException();
    }
}
