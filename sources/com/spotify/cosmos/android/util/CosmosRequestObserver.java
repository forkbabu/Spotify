package com.spotify.cosmos.android.util;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;

public interface CosmosRequestObserver {
    public static final CosmosRequestObserver NO_OP = new CosmosRequestObserver() {
        /* class com.spotify.cosmos.android.util.CosmosRequestObserver.AnonymousClass1 */

        @Override // com.spotify.cosmos.android.util.CosmosRequestObserver
        public void onError(String str, Throwable th) {
        }

        @Override // com.spotify.cosmos.android.util.CosmosRequestObserver
        public void onRequest(String str, Request request) {
        }

        @Override // com.spotify.cosmos.android.util.CosmosRequestObserver
        public void onResponse(String str, Response response) {
        }
    };

    void onError(String str, Throwable th);

    void onRequest(String str, Request request);

    void onResponse(String str, Response response);
}
