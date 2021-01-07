package com.spotify.cosmos.android.util;

import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;

public interface CosmosRequestInterceptor {
    public static final CosmosRequestInterceptor NO_OP = new CosmosRequestInterceptor() {
        /* class com.spotify.cosmos.android.util.CosmosRequestInterceptor.AnonymousClass1 */

        @Override // com.spotify.cosmos.android.util.CosmosRequestInterceptor
        public void destroy() {
        }

        @Override // com.spotify.cosmos.android.util.CosmosRequestInterceptor
        public Lifetime resolve(Request request, ResolveCallback resolveCallback) {
            return Lifetime.UNRESOLVED;
        }
    };

    void destroy();

    Lifetime resolve(Request request, ResolveCallback resolveCallback);
}
