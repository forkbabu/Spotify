package com.spotify.podcast.endpoints.exceptions;

import com.spotify.cosmos.router.Response;

public class NotFoundException extends CosmosException {
    private static final long serialVersionUID = 6508134751766469336L;

    public NotFoundException(String str, Response response) {
        super(str, response, "not found");
    }
}
