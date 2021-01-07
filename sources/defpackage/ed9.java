package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.ubi.specification.factories.s4;

/* renamed from: ed9  reason: default package */
public class ed9 implements zc9 {
    private final s4 a;
    private final ere b;

    public ed9(s4 s4Var, ere ere) {
        this.a = s4Var;
        this.b = ere;
    }

    @Override // defpackage.zc9
    public /* synthetic */ void a(MusicItem musicItem, int i) {
        yc9.e(this, musicItem, i);
    }

    @Override // defpackage.zc9
    public void b(String str) {
        this.b.a(this.a.i().c(str).b());
    }

    @Override // defpackage.zc9
    public void c() {
        this.b.a(this.a.f().d().a());
    }

    @Override // defpackage.zc9
    public void d(String str) {
        this.b.a(this.a.i().c(str).a());
    }

    @Override // defpackage.zc9
    public void e(String str) {
        this.b.a(this.a.b(str).a());
    }

    @Override // defpackage.zc9
    public void f() {
        this.b.a(this.a.c().a());
    }

    @Override // defpackage.zc9
    public void g() {
        this.b.a(this.a.f().c().a());
    }

    @Override // defpackage.zc9
    public void h(MusicItem musicItem, int i) {
        nqe nqe;
        int ordinal = musicItem.type().ordinal();
        if (ordinal == 5) {
            String A = musicItem.A();
            nqe = this.a.g().c(A).a(A);
        } else if (ordinal != 6) {
            if (ordinal != 16) {
                if (ordinal != 22) {
                    switch (ordinal) {
                        case 11:
                            break;
                        case 12:
                        case 13:
                            String A2 = musicItem.A();
                            nqe = this.a.g().e(Integer.valueOf(i), A2).a(A2);
                            break;
                        default:
                            nqe = null;
                            break;
                    }
                } else {
                    String A3 = musicItem.A();
                    nqe = this.a.g().f(Integer.valueOf(i), A3).a(A3);
                }
            }
            String A4 = musicItem.A();
            nqe = this.a.g().d(Integer.valueOf(i), A4).a(A4);
        } else {
            nqe = this.a.g().b(Integer.valueOf(i)).a();
        }
        if (nqe == null) {
            Logger.d("Logging MusicItem click on type %s is not supported!", musicItem.type());
        } else {
            this.b.a(nqe);
        }
    }

    @Override // defpackage.zc9
    public void i() {
        this.b.a(this.a.h().c());
    }

    @Override // defpackage.zc9
    public void j() {
        this.b.a(this.a.d().a());
    }

    @Override // defpackage.zc9
    public void k(String str) {
        this.b.a(this.a.i().d(str).a());
    }

    @Override // defpackage.zc9
    public void l() {
        this.b.a(this.a.h().b());
    }

    @Override // defpackage.zc9
    public void m() {
        this.b.a(this.a.f().c().b());
    }

    @Override // defpackage.zc9
    public void n() {
        this.b.a(this.a.f().b().a());
    }

    @Override // defpackage.zc9
    public void o() {
        this.b.a(this.a.i().b().a());
    }

    @Override // defpackage.zc9
    public void p(MusicItem musicItem, int i) {
        if (musicItem.type() == MusicItem.Type.PLAYLIST) {
            this.b.a(this.a.g().d(Integer.valueOf(i), musicItem.A()).b());
        }
    }

    @Override // defpackage.zc9
    public void q() {
        this.b.a(this.a.e().b().a());
    }

    @Override // defpackage.zc9
    public void r() {
        this.b.a(this.a.h().a());
    }

    @Override // defpackage.zc9
    public void s() {
        this.b.a(this.a.e().c());
    }
}
