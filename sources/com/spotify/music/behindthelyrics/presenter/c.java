package com.spotify.music.behindthelyrics.presenter;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        cq1 cq1 = (cq1) obj;
        Logger.b("BTL: Playback State Changed: playing(%s), paused(%s), speed(%s), position(%s)", Boolean.valueOf(cq1.a()), Boolean.valueOf(cq1.c()), Double.valueOf(cq1.b()), Long.valueOf(cq1.e()));
    }
}
