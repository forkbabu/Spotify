package com.spotify.cosmos.router;

public interface Router {
    void destroy();

    Lifetime resolve(Request request, ResolveCallback resolveCallback);
}
