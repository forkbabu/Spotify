package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.ubi.specification.factories.p4;

/* renamed from: uc9  reason: default package */
public class uc9 implements zc9 {
    private final p4 a;
    private final ere b;

    public uc9(p4 p4Var, ere ere) {
        this.a = p4Var;
        this.b = ere;
    }

    @Override // defpackage.zc9
    public void a(MusicItem musicItem, int i) {
        String A = musicItem.A();
        this.b.a(this.a.g().b(Integer.valueOf(i), A).c().a(A));
    }

    @Override // defpackage.zc9
    public /* synthetic */ void b(String str) {
        yc9.f(this, str);
    }

    @Override // defpackage.zc9
    public void c() {
        this.b.a(this.a.d().d().a());
    }

    @Override // defpackage.zc9
    public /* synthetic */ void d(String str) {
        yc9.b(this, str);
    }

    @Override // defpackage.zc9
    public /* synthetic */ void e(String str) {
        yc9.a(this, str);
    }

    @Override // defpackage.zc9
    public /* synthetic */ void f() {
        yc9.c(this);
    }

    @Override // defpackage.zc9
    public void g() {
        this.b.a(this.a.d().c().a());
    }

    @Override // defpackage.zc9
    public void h(MusicItem musicItem, int i) {
        nqe nqe;
        int ordinal = musicItem.type().ordinal();
        if (ordinal == 0) {
            String A = musicItem.A();
            nqe = this.a.e().b(A).a(A);
        } else if (ordinal == 2 || ordinal == 3) {
            String A2 = musicItem.A();
            if (musicItem.t()) {
                nqe = this.a.g().b(Integer.valueOf(i), A2).b(A2);
            } else {
                nqe = this.a.e().d(Integer.valueOf(i), A2).a(A2);
            }
        } else if (ordinal != 4) {
            nqe = null;
        } else {
            String A3 = musicItem.A();
            nqe = this.a.e().c(A3).a(A3);
        }
        if (nqe == null) {
            Logger.d("Logging MusicItem click on type %s is not supported!", musicItem.type());
        } else {
            this.b.a(nqe);
        }
    }

    @Override // defpackage.zc9
    public void i() {
        this.b.a(this.a.f().c());
    }

    @Override // defpackage.zc9
    public void j() {
        this.b.a(this.a.b().a());
    }

    @Override // defpackage.zc9
    public void k(String str) {
        this.b.a(this.a.h().c(str).a());
    }

    @Override // defpackage.zc9
    public void l() {
        this.b.a(this.a.f().b());
    }

    @Override // defpackage.zc9
    public void m() {
        this.b.a(this.a.d().c().b());
    }

    @Override // defpackage.zc9
    public void n() {
        this.b.a(this.a.d().b().a());
    }

    @Override // defpackage.zc9
    public void o() {
        this.b.a(this.a.h().b().a());
    }

    @Override // defpackage.zc9
    public void p(MusicItem musicItem, int i) {
        nqe nqe;
        MusicItem.Type z = musicItem.type();
        if (z == MusicItem.Type.ARTIST || z == MusicItem.Type.ARTIST_TWO_LINES) {
            if (musicItem.t()) {
                nqe = this.a.g().b(Integer.valueOf(i), musicItem.A()).d();
            } else {
                nqe = this.a.e().d(Integer.valueOf(i), musicItem.A()).b();
            }
            this.b.a(nqe);
        }
    }

    @Override // defpackage.zc9
    public void q() {
        this.b.a(this.a.c().b().a(""));
    }

    @Override // defpackage.zc9
    public void r() {
        this.b.a(this.a.f().a());
    }

    @Override // defpackage.zc9
    public void s() {
        this.b.a(this.a.c().c());
    }
}
