package com.spotify.music.nowplaying.drivingmode.loggers;

import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbackward.g;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.f;
import com.spotify.nowplaying.ui.components.shuffle.c;

public final class b implements hqd, jqd, brd, e, d, com.spotify.nowplaying.ui.components.controls.previous.d, h, g, f, c, erd, iqd {
    private final com.spotify.music.nowplaying.common.view.logging.c a;

    public b(com.spotify.music.nowplaying.common.view.logging.c cVar) {
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

    @Override // defpackage.hqd
    public void c(String str, boolean z) {
        this.a.c(str, z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekforward.f
    public void h(String str, int i) {
        this.a.v(str);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbackward.g
    public void k(String str, int i) {
        this.a.u(str);
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.f();
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.d
    public void o(String str) {
        this.a.q();
    }

    @Override // com.spotify.nowplaying.ui.components.shuffle.c
    public void p(String str, boolean z) {
        this.a.y(str, z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.w(str);
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.B(str);
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.d(str2);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.p(str);
    }

    @Override // defpackage.brd
    public void x(String str, boolean z) {
        this.a.k(str, z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        this.a.n(str2);
    }
}
