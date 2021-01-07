package com.spotify.remoteconfig.client.network;

import com.spotify.ucs.proto.v0.UcsResponseWrapper;
import kotlin.jvm.internal.h;
import retrofit2.v;

public final class UcsRequestFailedException extends Exception {
    private final v<UcsResponseWrapper> response;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UcsRequestFailedException(String str, v<UcsResponseWrapper> vVar) {
        super(str);
        h.f(str, "msg");
        h.f(vVar, "response");
        this.response = vVar;
    }

    public final v<UcsResponseWrapper> a() {
        return this.response;
    }
}
