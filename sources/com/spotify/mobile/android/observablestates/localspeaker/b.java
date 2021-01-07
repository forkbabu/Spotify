package com.spotify.mobile.android.observablestates.localspeaker;

import io.reactivex.functions.c;

public final /* synthetic */ class b implements c {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return (((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue()) ? LocalSpeakerStatus.CONNECTED : LocalSpeakerStatus.NOT_CONNECTED;
    }
}
