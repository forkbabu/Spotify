package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.nowplaying.common.view.contextmenu.w;
import com.spotify.music.nowplaying.common.view.logging.c;
import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbackward.g;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.f;
import com.spotify.player.options.RepeatMode;
import com.spotify.ubi.specification.factories.g2;
import com.spotify.ubi.specification.factories.s0;

/* renamed from: n4c  reason: default package */
public final class n4c implements jqd, kqd, lqd, mqd, nqd, e, d, com.spotify.nowplaying.ui.components.controls.previous.d, h, g, f, drd, erd, iqd, frd {
    private final c a;
    private final ere b;
    private final g2 c;
    private final s0 d;

    public n4c(c cVar, ere ere, a aVar, com.spotify.music.libs.viewuri.c cVar2) {
        this.a = cVar;
        this.b = ere;
        this.c = new g2(aVar.path(), cVar2.toString());
        this.d = new s0(cVar2.toString());
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.e(str2);
        this.b.a(this.c.g().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.o(str);
        this.b.a(this.c.c().b().a(str));
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.C(str);
        this.b.a(this.c.f().b().a(str));
    }

    @Override // defpackage.kqd
    public void e() {
        this.a.g();
        this.b.a(this.c.b().b().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekforward.f
    public void h(String str, int i) {
        this.a.v(str);
        this.b.a(this.c.c().d().a(Integer.valueOf(i)));
    }

    @Override // defpackage.mqd
    public void i(RepeatMode repeatMode) {
        this.a.i(repeatMode);
        this.b.a(w.a(this.d, repeatMode));
    }

    @Override // defpackage.drd
    public void j() {
        this.a.x();
        this.b.a(this.c.b().c().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbackward.g
    public void k(String str, int i) {
        this.a.u(str);
        this.b.a(this.c.c().c().a(Integer.valueOf(-i)));
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.D(str);
        this.b.a(this.c.f().c().a(str));
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.f();
        this.b.a(this.c.e().b().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.d
    public void o(String str) {
        this.a.q();
        this.b.a(this.c.c().f().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.w(str);
        this.b.a(this.c.d().a(Integer.valueOf(i)));
    }

    @Override // defpackage.lqd
    public void r() {
        this.a.h();
        this.b.a(this.c.e().c().a());
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.B(str);
        this.b.a(this.c.e().d().a(str));
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.d(str2);
        this.b.a(this.c.g().a(str));
    }

    @Override // defpackage.nqd
    public void u(boolean z) {
        this.a.j(z);
        this.b.a(w.b(this.d, z));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.p(str);
        this.b.a(this.c.c().b().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        this.a.n(str2);
        this.b.a(this.c.c().e().a(str));
    }
}
