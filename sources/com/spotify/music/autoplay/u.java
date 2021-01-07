package com.spotify.music.autoplay;

import io.reactivex.functions.c;

public final /* synthetic */ class u implements c {
    public static final /* synthetic */ u a = new u();

    private /* synthetic */ u() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        RadioSeedBundle radioSeedBundle = (RadioSeedBundle) obj2;
        return RadioSeedBundle.create((String) obj, radioSeedBundle.getPlaybackId(), radioSeedBundle.getPlayOrigin());
    }
}
