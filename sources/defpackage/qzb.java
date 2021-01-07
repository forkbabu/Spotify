package defpackage;

import com.spotify.music.newplaying.scroll.container.g0;
import com.spotify.music.nowplaying.common.view.logging.a;
import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.repeat.c;
import com.spotify.player.options.RepeatMode;

/* renamed from: qzb  reason: default package */
public final class qzb implements jqd, kqd, lqd, mqd, nqd, brd, e, d, com.spotify.nowplaying.ui.components.controls.previous.d, crd, c, lmb, h, drd, com.spotify.nowplaying.ui.components.shuffle.c, erd, iqd, frd, g0, nzb {
    private final com.spotify.music.nowplaying.common.view.logging.c a;
    private final a b;
    private final ozb c;

    public qzb(com.spotify.music.nowplaying.common.view.logging.c cVar, ozb ozb, a aVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = ozb;
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.e(str2);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.o(str);
    }

    @Override // defpackage.nzb
    public void c(String str, String str2) {
        this.c.a(str, str2);
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.C(str);
    }

    @Override // defpackage.kqd
    public void e() {
        this.a.g();
    }

    @Override // defpackage.nzb
    public void f(String str, String str2) {
        this.c.b(str, str2);
    }

    @Override // com.spotify.music.newplaying.scroll.container.g0
    public void g(String str, int i) {
        this.b.b(i, str);
    }

    @Override // defpackage.nzb
    public void h(String str, String str2) {
        this.c.c(str, str2);
    }

    @Override // defpackage.mqd
    public void i(RepeatMode repeatMode) {
        this.a.i(repeatMode);
    }

    @Override // defpackage.drd
    public void j() {
        this.a.x();
    }

    @Override // com.spotify.nowplaying.ui.components.repeat.c
    public void k(String str, RepeatMode repeatMode) {
        this.a.s(str, repeatMode);
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.D(str);
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.f();
    }

    @Override // com.spotify.music.newplaying.scroll.container.g0
    public void n() {
        this.b.c();
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

    @Override // defpackage.lqd
    public void r() {
        this.a.h();
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.B(str);
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.d(str2);
    }

    @Override // defpackage.nqd
    public void u(boolean z) {
        this.a.j(z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.p(str);
    }

    @Override // defpackage.crd
    public void w() {
        this.a.r();
    }

    @Override // defpackage.brd
    public void x(String str, boolean z) {
        this.a.k(str, z);
    }

    @Override // defpackage.lmb
    public void y() {
        this.a.t();
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        this.a.n(str2);
    }
}
