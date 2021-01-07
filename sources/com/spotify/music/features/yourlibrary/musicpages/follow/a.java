package com.spotify.music.features.yourlibrary.musicpages.follow;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Failed to get follow data", (Throwable) obj);
    }
}
