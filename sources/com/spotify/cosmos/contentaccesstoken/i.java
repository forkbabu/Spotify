package com.spotify.cosmos.contentaccesstoken;

import com.spotify.contentaccesstoken.proto.ContentAccessTokenResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ContentAccessTokenClientImpl.a((ContentAccessTokenResponse) obj);
    }
}
