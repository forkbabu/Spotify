package com.spotify.cosmos.router;

public interface ResolveCallback {
    void onError(Throwable th);

    void onResolved(Response response);
}
