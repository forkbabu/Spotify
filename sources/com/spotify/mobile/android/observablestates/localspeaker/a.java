package com.spotify.mobile.android.observablestates.localspeaker;

import io.reactivex.functions.n;

public final /* synthetic */ class a implements n {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((LocalSpeakerStatus) obj) != LocalSpeakerStatus.CONNECTED;
    }
}
