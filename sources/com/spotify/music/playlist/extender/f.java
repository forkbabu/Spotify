package com.spotify.music.playlist.extender;

import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;

public final /* synthetic */ class f implements nmf {
    public final /* synthetic */ w a;
    public final /* synthetic */ t b;
    public final /* synthetic */ int c;

    public /* synthetic */ f(w wVar, t tVar, int i) {
        this.a = wVar;
        this.b = tVar;
        this.c = i;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.i0(this.b, this.c, (Events) obj);
        return kotlin.f.a;
    }
}
