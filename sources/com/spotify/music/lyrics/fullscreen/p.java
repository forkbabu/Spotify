package com.spotify.music.lyrics.fullscreen;

import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.ubi.specification.factories.q1;

public final class p implements d, h {
    private final ere a;
    private final q1 b;

    public p(ere ere, q1 q1Var) {
        kotlin.jvm.internal.h.e(ere, "userBehaviourEventLogger");
        kotlin.jvm.internal.h.e(q1Var, "mobileLyricsEventFactory");
        this.a = ere;
        this.b = q1Var;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        if (str != null) {
            this.a.a(this.b.c(str).c().c().a(str));
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        if (str != null) {
            this.a.a(this.b.c(str).c().c().b(str));
        }
    }
}
