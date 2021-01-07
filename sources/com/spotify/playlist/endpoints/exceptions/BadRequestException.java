package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import kotlin.jvm.internal.h;

public final class BadRequestException extends CosmosException {
    private static final long serialVersionUID = 9197801368173466988L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadRequestException(Response response) {
        super(response, "bad request");
        h.e(response, "response");
    }
}
