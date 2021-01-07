package defpackage;

import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbackward.g;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.f;
import com.spotify.ubi.specification.factories.e0;

/* renamed from: iq2  reason: default package */
public final class iq2 implements jqd, iqd, frd, erd, h, d, f, g, uo2, sq2, to2 {
    private final ere a;
    private final e0 b;

    public iq2(ere ere, e0 e0Var) {
        this.a = ere;
        this.b = e0Var;
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.a(this.b.b("podcast").d().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.a(this.b.b("podcast").e().c().c().a(str));
    }

    @Override // defpackage.sq2
    public void c() {
        this.a.a(this.b.b("podcast").e().b().d().a());
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.a(this.b.b("podcast").g().c().b().a(str));
    }

    @Override // defpackage.uo2
    public void e() {
        this.a.a(this.b.b("podcast").e().b().g().a());
    }

    @Override // defpackage.to2
    public void f() {
        this.a.a(this.b.b("podcast").e().b().c().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekforward.f
    public void h(String str, int i) {
        this.a.a(this.b.b("podcast").e().c().f().a(Integer.valueOf(i)));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbackward.g
    public void k(String str, int i) {
        this.a.a(this.b.b("podcast").e().c().e().a(Integer.valueOf(-i)));
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.a(this.b.b("podcast").g().c().c().a(str));
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.a(this.b.b("podcast").b().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.a(this.b.b("podcast").f().a(Integer.valueOf(i)));
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.a(this.b.b("podcast").c().a(str));
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.a(this.b.b("podcast").d().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.a(this.b.b("podcast").e().c().c().b(str));
    }
}
