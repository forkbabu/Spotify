package com.spotify.mobile.android.observablestates.docking;

import com.spotify.mobile.android.observablestates.localspeaker.LocalSpeakerStatus;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((LocalSpeakerStatus) obj) == LocalSpeakerStatus.CONNECTED);
    }
}
