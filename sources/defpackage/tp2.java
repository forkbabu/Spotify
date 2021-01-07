package defpackage;

import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.ubi.specification.factories.e0;

/* renamed from: tp2  reason: default package */
public final class tp2 implements jqd, iqd, frd, erd, h, d, com.spotify.nowplaying.ui.components.controls.previous.d, e, brd, hqd, uo2, to2 {
    private final ere a;
    private final e0 b;

    public tp2(ere ere, e0 e0Var) {
        this.a = ere;
        this.b = e0Var;
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.a(this.b.b("feedback").d().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.a(this.b.b("feedback").e().c().c().a(str));
    }

    @Override // defpackage.hqd
    public void c(String str, boolean z) {
        if (z) {
            this.a.a(this.b.b("feedback").e().b().b().b(str));
        } else {
            this.a.a(this.b.b("feedback").e().b().b().a(str));
        }
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.a(this.b.b("feedback").g().c().b().a(str));
    }

    @Override // defpackage.uo2
    public void e() {
        this.a.a(this.b.b("feedback").e().b().g().a());
    }

    @Override // defpackage.to2
    public void f() {
        this.a.a(this.b.b("feedback").e().b().c().a());
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.a(this.b.b("feedback").g().c().c().a(str));
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.a(this.b.b("feedback").b().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.d
    public void o(String str) {
        this.a.a(this.b.b("feedback").e().c().d().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.a(this.b.b("feedback").f().a(Integer.valueOf(i)));
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.a(this.b.b("feedback").c().a(str));
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.a(this.b.b("feedback").d().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.a(this.b.b("feedback").e().c().c().b(str));
    }

    @Override // defpackage.brd
    public void x(String str, boolean z) {
        if (z) {
            this.a.a(this.b.b("feedback").g().b().b(str));
        } else {
            this.a.a(this.b.b("feedback").g().b().a(str));
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        this.a.a(this.b.b("feedback").e().c().b().a(str));
    }
}
