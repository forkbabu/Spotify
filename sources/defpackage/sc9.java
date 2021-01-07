package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.ubi.specification.factories.o4;

/* renamed from: sc9  reason: default package */
public class sc9 implements zc9 {
    private final o4 a;
    private final ere b;

    public sc9(o4 o4Var, ere ere) {
        this.a = o4Var;
        this.b = ere;
    }

    @Override // defpackage.zc9
    public void a(MusicItem musicItem, int i) {
        String A = musicItem.A();
        this.b.a(this.a.h().b(Integer.valueOf(i), A).c().a(A));
    }

    @Override // defpackage.zc9
    public /* synthetic */ void b(String str) {
        yc9.f(this, str);
    }

    @Override // defpackage.zc9
    public void c() {
        this.b.a(this.a.e().d().a());
    }

    @Override // defpackage.zc9
    public /* synthetic */ void d(String str) {
        yc9.b(this, str);
    }

    @Override // defpackage.zc9
    public void e(String str) {
        this.b.a(this.a.b(str).a());
    }

    @Override // defpackage.zc9
    public /* synthetic */ void f() {
        yc9.c(this);
    }

    @Override // defpackage.zc9
    public void g() {
        this.b.a(this.a.e().c().a());
    }

    @Override // defpackage.zc9
    public void h(MusicItem musicItem, int i) {
        nqe nqe;
        if (musicItem.type() == MusicItem.Type.ALBUM) {
            String A = musicItem.A();
            if (musicItem.t()) {
                nqe = this.a.h().b(Integer.valueOf(i), A).b(A);
            } else {
                nqe = this.a.f().b(Integer.valueOf(i), A).a(A);
            }
            this.b.a(nqe);
        }
    }

    @Override // defpackage.zc9
    public void i() {
        this.b.a(this.a.g().c());
    }

    @Override // defpackage.zc9
    public void j() {
        this.b.a(this.a.c().a());
    }

    @Override // defpackage.zc9
    public void k(String str) {
        this.b.a(this.a.i().c(str).a());
    }

    @Override // defpackage.zc9
    public void l() {
        this.b.a(this.a.g().b());
    }

    @Override // defpackage.zc9
    public void m() {
        this.b.a(this.a.e().c().b());
    }

    @Override // defpackage.zc9
    public void n() {
        this.b.a(this.a.e().b().a());
    }

    @Override // defpackage.zc9
    public void o() {
        this.b.a(this.a.i().b().a());
    }

    @Override // defpackage.zc9
    public void p(MusicItem musicItem, int i) {
        nqe nqe;
        if (musicItem.type() == MusicItem.Type.ALBUM) {
            String A = musicItem.A();
            if (musicItem.t()) {
                nqe = this.a.h().b(Integer.valueOf(i), A).d();
            } else {
                nqe = this.a.f().b(Integer.valueOf(i), A).b();
            }
            this.b.a(nqe);
        }
    }

    @Override // defpackage.zc9
    public /* synthetic */ void q() {
        yc9.d(this);
    }

    @Override // defpackage.zc9
    public void r() {
        this.b.a(this.a.g().a());
    }

    @Override // defpackage.zc9
    public void s() {
        this.b.a(this.a.d().a());
    }
}
