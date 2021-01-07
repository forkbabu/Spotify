package defpackage;

import com.spotify.music.newplaying.scroll.container.g0;
import com.spotify.music.nowplaying.common.view.contextmenu.w;
import com.spotify.music.nowplaying.common.view.logging.a;
import com.spotify.music.nowplaying.common.view.logging.c;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbackward.g;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.f;
import com.spotify.player.options.RepeatMode;
import com.spotify.ubi.specification.factories.f2;
import com.spotify.ubi.specification.factories.s0;

/* renamed from: a0c  reason: default package */
public final class a0c implements jqd, kqd, lqd, mqd, nqd, d, lmb, h, g, f, drd, com.spotify.music.nowplaying.podcast.sleeptimer.d, com.spotify.music.nowplaying.podcast.speedcontrol.d, erd, iqd, frd, g0 {
    private final c a;
    private final a b;
    private final ere c;
    private final f2 d;
    private final s0 e;

    public a0c(c cVar, a aVar, ere ere, com.spotify.instrumentation.a aVar2, com.spotify.music.libs.viewuri.c cVar2) {
        this.a = cVar;
        this.b = aVar;
        this.c = ere;
        this.d = new f2(aVar2.path(), cVar2.toString());
        this.e = new s0(cVar2.toString());
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.e(str2);
        this.c.a(this.d.c().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.o(str);
        this.c.a(this.d.e().b().a(str));
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.C(str);
        this.c.a(this.d.i().b().a(str));
    }

    @Override // defpackage.kqd
    public void e() {
        this.a.g();
        this.c.a(this.d.b().b().a());
    }

    @Override // com.spotify.music.nowplaying.podcast.sleeptimer.d
    public void f(String str) {
        this.a.z(str);
        this.c.a(this.d.e().f().a());
    }

    @Override // com.spotify.music.newplaying.scroll.container.g0
    public void g(String str, int i) {
        this.b.b(i, str);
        this.c.a(this.d.g().b(str, Integer.valueOf(i)).a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekforward.f
    public void h(String str, int i) {
        this.a.v(str);
        this.c.a(this.d.e().e().a(Integer.valueOf(i)));
    }

    @Override // defpackage.mqd
    public void i(RepeatMode repeatMode) {
        this.a.i(repeatMode);
        this.c.a(w.a(this.e, repeatMode));
    }

    @Override // defpackage.drd
    public void j() {
        this.a.x();
        this.c.a(this.d.b().c().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbackward.g
    public void k(String str, int i) {
        this.a.u(str);
        this.c.a(this.d.e().d().a(Integer.valueOf(-i)));
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.D(str);
        this.c.a(this.d.i().c().a(str));
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.f();
        this.c.a(this.d.h().b().a());
    }

    @Override // com.spotify.music.newplaying.scroll.container.g0
    public void n() {
        this.b.c();
        this.c.a(this.d.g().c());
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.d
    public void p(String str) {
        this.a.A(str);
        this.c.a(this.d.e().c().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.w(str);
        this.c.a(this.d.f().a(Integer.valueOf(i)));
    }

    @Override // defpackage.lqd
    public void r() {
        this.a.h();
        this.c.a(this.d.h().c().a());
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.B(str);
        this.c.a(this.d.h().d().a(str));
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.d(str2);
        this.c.a(this.d.c().a(str));
    }

    @Override // defpackage.nqd
    public void u(boolean z) {
        this.a.j(z);
        this.c.a(w.b(this.e, z));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.p(str);
        this.c.a(this.d.e().b().b(str));
    }

    @Override // defpackage.lmb
    public void y() {
        this.a.t();
        this.c.a(this.d.d());
    }
}
