package com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol;

import com.spotify.music.nowplaying.podcast.speedcontrol.g;
import kotlin.jvm.internal.h;

public final class d implements c, g {
    private final String a;
    private final g.a b = a.a;
    private String c;
    private g.a f;
    private boolean n;
    private final g o;
    private final e2c p;

    static final class a implements g.a {
        public static final a a = new a();

        a() {
        }

        @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g.a
        public final void a() {
        }
    }

    public d(g gVar, e2c e2c) {
        h.e(gVar, "speedControlButton");
        h.e(e2c, "podcastsResourceBundle");
        this.o = gVar;
        this.p = e2c;
        String a2 = e2c.a(100);
        this.a = a2;
        this.c = a2;
        this.n = true;
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setActive(boolean z) {
        this.o.setActive(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.c
    public void setEnabled(boolean z) {
        this.n = z;
        g.a aVar = this.f;
        if (aVar != null) {
            g gVar = this.o;
            if (!z) {
                aVar = this.b;
            }
            gVar.setListener(aVar);
        }
        g gVar2 = this.o;
        boolean z2 = true;
        if (!z || !(!h.a(this.c, this.a))) {
            z2 = false;
        }
        gVar2.setActive(z2);
        this.o.setSpeed(z ? this.c : this.a);
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setListener(g.a aVar) {
        h.e(aVar, "listener");
        this.f = aVar;
        if (this.n) {
            this.o.setListener(aVar);
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setSpeed(String str) {
        h.e(str, "speed");
        this.c = str;
        this.o.setSpeed(str);
    }
}
