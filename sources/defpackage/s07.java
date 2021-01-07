package defpackage;

import android.os.Bundle;
import com.spotify.music.connection.g;
import com.spotify.music.connection.l;
import com.spotify.music.playlist.extender.f0;
import com.spotify.music.playlist.extender.g0;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: s07  reason: default package */
public class s07 {
    final f0.a a;
    private final y b;
    private final l c;
    private final f0 d;
    private final io.reactivex.subjects.a<h76> e = io.reactivex.subjects.a.h1();
    private final q f = new q();
    private final io.reactivex.subjects.a<Boolean> g = io.reactivex.subjects.a.i1(Boolean.FALSE);
    private v07 h;
    private h76 i;
    private boolean j;
    private boolean k;
    private Bundle l;

    /* renamed from: s07$b */
    private class b implements f0.a {
        b(a aVar) {
        }

        @Override // com.spotify.music.playlist.extender.f0.a
        public boolean a() {
            return s07.this.i == null || !s07.this.i.a();
        }

        @Override // com.spotify.music.playlist.extender.f0.a
        public void b() {
            if (s07.this.j) {
                ((p07) s07.this.h).u();
            }
        }

        @Override // com.spotify.music.playlist.extender.f0.a
        public void c() {
        }

        @Override // com.spotify.music.playlist.extender.f0.a
        public int d() {
            return s07.this.i.l().o();
        }

        @Override // com.spotify.music.playlist.extender.f0.a
        public String e() {
            return s07.this.i.l().j();
        }

        @Override // com.spotify.music.playlist.extender.f0.a
        public boolean f() {
            return s07.this.i.l().u() && s07.this.i.a();
        }

        @Override // com.spotify.music.playlist.extender.f0.a
        public boolean h() {
            return s07.this.k;
        }
    }

    public s07(y yVar, f0.b bVar, l lVar, boolean z) {
        b bVar2 = new b(null);
        this.a = bVar2;
        this.b = yVar;
        this.c = lVar;
        this.d = bVar.a(z, bVar2);
    }

    public void e(v07 v07) {
        this.h = v07;
        if (v07 != null) {
            Bundle bundle = this.l;
            if (bundle != null) {
                ((g0) this.d).F(bundle);
                this.l = null;
            }
            this.f.c();
            this.f.a(this.e.subscribe(new m07(this)));
            q qVar = this.f;
            io.reactivex.subjects.a<Boolean> aVar = this.g;
            com.spotify.music.features.playlistentity.vanilla.footer.a aVar2 = com.spotify.music.features.playlistentity.vanilla.footer.a.a;
            s<Boolean> N0 = aVar.Q(aVar2).N0(1);
            com.spotify.music.features.playlistentity.vanilla.footer.b bVar = com.spotify.music.features.playlistentity.vanilla.footer.b.a;
            qVar.a(N0.K0(bVar).g(this.c.a()).E().o0(this.b).subscribe(new k07(this), l07.a));
            q qVar2 = this.f;
            io.reactivex.a K0 = this.g.Q(aVar2).N0(1).K0(bVar);
            f0 f0Var = this.d;
            f0Var.getClass();
            qVar2.a(K0.subscribe(new n07(f0Var)));
        } else {
            this.f.c();
            ((g0) this.d).K();
        }
        this.j = v07 != null;
    }

    /* access modifiers changed from: package-private */
    public f0 f() {
        return this.d;
    }

    public void g(g gVar) {
        gVar.getClass();
        boolean z = gVar instanceof g.c;
        this.k = z;
        ((g0) this.d).I(z);
    }

    public void h(Bundle bundle) {
        this.l = bundle;
    }

    public void i(Bundle bundle) {
        ((g0) this.d).G(bundle);
    }

    public void j(boolean z) {
        this.g.onNext(Boolean.valueOf(z));
    }

    public void k(int i2) {
        if (this.j && i2 <= 5) {
            ((g0) this.d).M();
        }
    }

    public boolean l(h76 h76) {
        this.i = h76;
        boolean z = h76.m() && h76.f().b() != null;
        boolean z2 = !h76.d() && h76.c();
        if (z || z2) {
            return false;
        }
        return true;
    }
}
