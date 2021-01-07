package defpackage;

import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.shuffle.c;
import com.spotify.player.options.RepeatMode;
import com.spotify.ubi.specification.factories.e0;

/* renamed from: fp2  reason: default package */
public final class fp2 implements jqd, iqd, frd, erd, h, d, com.spotify.nowplaying.ui.components.controls.previous.d, e, c, brd, uo2, to2, com.spotify.nowplaying.ui.components.repeat.c {
    private final ere a;
    private final e0 b;

    public fp2(ere ere, e0 e0Var) {
        this.a = ere;
        this.b = e0Var;
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.a(this.b.b("default").d().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.a(this.b.b("default").e().c().c().a(str));
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.a(this.b.b("default").g().c().b().a(str));
    }

    @Override // defpackage.uo2
    public void e() {
        this.a.a(this.b.b("default").e().b().g().a());
    }

    @Override // defpackage.to2
    public void f() {
        this.a.a(this.b.b("default").e().b().c().a());
    }

    @Override // com.spotify.nowplaying.ui.components.repeat.c
    public void k(String str, RepeatMode repeatMode) {
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            this.a.a(this.b.b("default").e().b().e().a());
        } else if (ordinal == 1) {
            this.a.a(this.b.b("default").e().b().e().b());
        } else if (ordinal == 2) {
            this.a.a(this.b.b("default").e().b().e().c());
        } else {
            throw new IllegalArgumentException("Unsupported RepeatMode " + repeatMode);
        }
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.a(this.b.b("default").g().c().c().a(str));
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.a(this.b.b("default").b().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.d
    public void o(String str) {
        this.a.a(this.b.b("default").e().c().d().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.shuffle.c
    public void p(String str, boolean z) {
        if (z) {
            this.a.a(this.b.b("default").e().b().f().a());
        } else {
            this.a.a(this.b.b("default").e().b().f().b());
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.a(this.b.b("default").f().a(Integer.valueOf(i)));
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.a(this.b.b("default").c().a(str));
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.a(this.b.b("default").d().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.a(this.b.b("default").e().c().c().b(str));
    }

    @Override // defpackage.brd
    public void x(String str, boolean z) {
        if (z) {
            this.a.a(this.b.b("default").g().b().b(str));
        } else {
            this.a.a(this.b.b("default").g().b().a(str));
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        this.a.a(this.b.b("default").e().c().b().a(str));
    }
}
