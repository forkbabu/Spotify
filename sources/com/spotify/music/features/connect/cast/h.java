package com.spotify.music.features.connect.cast;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Active scan failed", (Throwable) obj);
    }
}
