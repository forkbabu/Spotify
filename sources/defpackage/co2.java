package defpackage;

import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.ubi.specification.factories.e0;

/* renamed from: co2  reason: default package */
public final class co2 implements jqd, iqd, frd, erd, h, d, e, to2 {
    private final ere a;
    private final e0 b;

    public co2(ere ere, e0 e0Var) {
        this.a = ere;
        this.b = e0Var;
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.a(this.b.b("ads").d().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.a(this.b.b("ads").e().c().c().a(str));
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.a(this.b.b("ads").g().c().b().a(str));
    }

    @Override // defpackage.to2
    public void f() {
        this.a.a(this.b.b("ads").e().b().c().a());
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.a(this.b.b("ads").g().c().c().a(str));
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.a(this.b.b("ads").b().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.a(this.b.b("ads").f().a(Integer.valueOf(i)));
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.a(this.b.b("ads").c().a(str));
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.a(this.b.b("ads").d().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.a(this.b.b("ads").e().c().c().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        this.a.a(this.b.b("ads").e().c().b().a(str));
    }
}
