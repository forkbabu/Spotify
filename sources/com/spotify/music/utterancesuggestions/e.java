package com.spotify.music.utterancesuggestions;

import io.reactivex.l;
import kotlin.jvm.internal.h;

public final class e implements g {
    private final l<f> a;

    public e(String str) {
        h.e(str, "staticText");
        l<f> k = l.k(new f(str));
        h.d(k, "Maybe.just(Utterance(staticText))");
        this.a = k;
    }

    @Override // com.spotify.music.utterancesuggestions.g
    public l<f> a() {
        return this.a;
    }
}
