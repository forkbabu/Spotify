package com.spotify.mobile.android.spotlets.appprotocol.calls;

import com.spotify.mobile.android.spotlets.appprotocol.calls.EchoEndpoint;
import java.util.concurrent.Callable;

class a implements Callable<EchoEndpoint.EchoResponse> {
    final /* synthetic */ EchoEndpoint.EchoRequest a;

    a(EchoEndpoint echoEndpoint, EchoEndpoint.EchoRequest echoRequest) {
        this.a = echoRequest;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public EchoEndpoint.EchoResponse call() {
        return new EchoEndpoint.EchoResponse(this.a.request);
    }
}
