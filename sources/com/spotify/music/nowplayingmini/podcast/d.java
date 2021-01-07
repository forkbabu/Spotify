package com.spotify.music.nowplayingmini.podcast;

import com.spotify.music.nowplaying.common.view.logging.c;
import com.spotify.nowplaying.ui.components.controls.seekbackward.g;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.f;

public final class d implements f, com.spotify.nowplaying.ui.components.controls.playpause.d, g, h, iqd, frd, kqd {
    private final c a;

    public d(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.e(str2);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.o(str);
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.C(str);
    }

    @Override // defpackage.kqd
    public void e() {
        this.a.g();
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekforward.f
    public void h(String str, int i) {
        this.a.v(str);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbackward.g
    public void k(String str, int i) {
        this.a.u(str);
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.B(str);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.w(str);
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.d(str2);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.p(str);
    }
}
