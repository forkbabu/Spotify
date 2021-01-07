package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.z;

public interface FireAndForgetResolver {
    void detached(s<? extends Response> sVar);

    void detached(s<? extends Response> sVar, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver);

    void detached(z<? extends Response> zVar);

    void detached(z<? extends Response> zVar, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver);

    void dispose();

    void reset();

    void resolve(Request request);

    void resolve(Request request, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver);
}
