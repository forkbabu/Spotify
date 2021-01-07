package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import kotlin.jvm.internal.h;

public final class ForbiddenException extends CosmosException {
    private static final long serialVersionUID = -6976061766968215129L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForbiddenException(Response response) {
        super(response, "forbidden");
        h.e(response, "response");
    }
}
