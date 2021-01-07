package com.spotify.music.features.eventshub.eventshub;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str = EventsHubFragment.x0;
        Assertion.i("Connection state error", (Throwable) obj);
    }
}
