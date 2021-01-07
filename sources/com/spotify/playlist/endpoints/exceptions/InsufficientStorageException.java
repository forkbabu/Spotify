package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import kotlin.jvm.internal.h;

public final class InsufficientStorageException extends CosmosException {
    private static final long serialVersionUID = 3273836696118735053L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsufficientStorageException(Response response) {
        super(response, "insufficient storage");
        h.e(response, "response");
    }
}
