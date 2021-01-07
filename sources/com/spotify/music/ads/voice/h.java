package com.spotify.music.ads.voice;

import com.spotify.voice.api.model.j;

public final class h implements fjf<j> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final h a = new h();
    }

    public static h a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        j.a a2 = j.a();
        a2.a("/v2/voice-ad/");
        return a2.build();
    }
}
