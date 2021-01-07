package com.spotify.music.nowplayingmini.def;

import com.spotify.music.nowplaying.common.view.logging.c;
import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;

public final class f implements brd, e, d, com.spotify.nowplaying.ui.components.controls.previous.d, h, iqd, frd, kqd {
    private final c a;

    public f(c cVar) {
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

    @Override // defpackage.frd
    public void l(String str) {
        this.a.B(str);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.d
    public void o(String str) {
        this.a.q();
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

    @Override // defpackage.brd
    public void x(String str, boolean z) {
        this.a.k(str, z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        this.a.n(str2);
    }
}
