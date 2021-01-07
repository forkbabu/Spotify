package com.spotify.voice.api;

import com.spotify.http.wg.WebgateTokenProvider;
import io.reactivex.functions.n;

public final /* synthetic */ class f implements n {
    public final /* synthetic */ WebgateTokenProvider a;

    public /* synthetic */ f(WebgateTokenProvider webgateTokenProvider) {
        this.a = webgateTokenProvider;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return o.b(this.a, (Throwable) obj);
    }
}
