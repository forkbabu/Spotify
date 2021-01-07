package com.spotify.music.features.queue.v2;

import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.repeat.c;
import com.spotify.player.options.RepeatMode;
import com.spotify.ubi.specification.factories.m3;
import kotlin.jvm.internal.h;

public final class i implements e, d, com.spotify.nowplaying.ui.components.controls.previous.d, c, com.spotify.nowplaying.ui.components.shuffle.c {
    private final ere a;
    private final m3 b;

    public i(ere ere, m3 m3Var) {
        h.e(ere, "ubiLogger");
        h.e(m3Var, "eventFactory");
        this.a = ere;
        this.b = m3Var;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        h.e(str, "trackUri");
        this.a.a(this.b.c().b().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.repeat.c
    public void k(String str, RepeatMode repeatMode) {
        h.e(str, "trackUri");
        h.e(repeatMode, "newRepeatMode");
        m3.c.b c = this.b.c().c();
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            this.a.a(c.a());
        } else if (ordinal == 1) {
            this.a.a(c.b());
        } else if (ordinal == 2) {
            this.a.a(c.c());
        } else {
            throw new IllegalArgumentException("Unsupported RepeatMode " + repeatMode);
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.d
    public void o(String str) {
        h.e(str, "trackUri");
        this.a.a(this.b.c().f().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.shuffle.c
    public void p(String str, boolean z) {
        h.e(str, "trackUri");
        m3.c.C0486c d = this.b.c().d();
        if (z) {
            this.a.a(d.a());
        } else {
            this.a.a(d.b());
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        h.e(str, "trackUri");
        this.a.a(this.b.c().b().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        h.e(str, "currentTrackUri");
        h.e(str2, "nextTrackUri");
        this.a.a(this.b.c().e().a(str));
    }
}
