package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import kotlin.jvm.internal.h;

public final class NotLoggedInException extends CosmosException {
    private static final long serialVersionUID = -4422015840523359698L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotLoggedInException(Response response) {
        super(response, "not logged in");
        h.e(response, "response");
    }
}
