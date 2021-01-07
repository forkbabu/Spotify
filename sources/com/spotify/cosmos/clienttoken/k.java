package com.spotify.cosmos.clienttoken;

import com.spotify.cosmos.clienttoken.model.ClientTokenResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class k implements l {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((ClientTokenResponse) obj).optionalClientToken();
    }
}
