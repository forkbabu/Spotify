package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import kotlin.jvm.internal.h;

public final class NotFoundException extends CosmosException {
    private static final long serialVersionUID = -8419609754312795844L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotFoundException(Response response) {
        super(response, "not found");
        h.e(response, "response");
    }
}
