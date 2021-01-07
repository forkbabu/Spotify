package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import io.reactivex.disposables.a;
import io.reactivex.g;
import io.reactivex.y;
import java.util.UUID;

/* renamed from: mf8  reason: default package */
public class mf8 implements i3b {
    private final b61 a;
    private final i b;
    private final j3b c;
    private final y f;
    private final r3b n;
    private final p3b o;
    private final u98 p;
    private final ig8 q;
    private final com.spotify.libs.search.history.i r;
    private final c4b s;
    private final i5b t;
    private final i4b u;
    private String v = UUID.randomUUID().toString();
    private final efa w;
    private final a x = new a();
    private b91 y = HubsImmutableViewModel.EMPTY;

    public mf8(b61 b61, i iVar, j3b j3b, u98 u98, ig8 ig8, com.spotify.libs.search.history.i iVar2, c4b c4b, i5b i5b, i4b i4b, efa efa, y yVar, r3b r3b, p3b p3b) {
        b61.getClass();
        this.a = b61;
        iVar.getClass();
        this.b = iVar;
        j3b.getClass();
        this.c = j3b;
        u98.getClass();
        this.p = u98;
        this.f = yVar;
        this.n = r3b;
        this.o = p3b;
        ig8.getClass();
        this.q = ig8;
        iVar2.getClass();
        this.r = iVar2;
        c4b.getClass();
        this.s = c4b;
        i5b.getClass();
        this.t = i5b;
        this.u = i4b;
        this.w = efa;
    }

    /* access modifiers changed from: protected */
    public void a(b91 b91) {
        this.a.k(b91);
        this.y = b91;
    }

    public void b() {
        this.b.g();
        this.b.c(this.a);
    }

    @Override // defpackage.i3b
    public int c() {
        return rqa.d(this.y);
    }

    @Override // defpackage.i3b
    public boolean d() {
        return !rqa.j(this.y);
    }

    public void e() {
        this.b.h();
        this.b.f(this.a);
    }

    public void f() {
        this.r.c();
    }

    public void g(Parcelable parcelable) {
        if (parcelable instanceof dfa) {
            dfa dfa = (dfa) parcelable;
            String a2 = dfa.a();
            this.v = a2;
            b91 a3 = this.w.a(a2);
            if (a3 != null) {
                this.a.k(a3);
            }
            this.a.i(dfa.b());
        }
        this.y = this.a.f().b();
    }

    public Parcelable h() {
        this.w.b(this.v, this.a.f().b());
        return new dfa(this.v, this.a.j());
    }

    public void i() {
        this.x.f();
        g<b91> r0 = this.c.e(this.s.b(this.u.b(this.t, this)).a(), this.y).V(1).r0();
        a aVar = this.x;
        this.o.getClass();
        g<R> Q = r0.O(y2b.a).C(f1b.a).O(x2b.a).s().Q(this.f);
        u98 u98 = this.p;
        u98.getClass();
        aVar.b(Q.subscribe(new hf8(u98)));
        this.x.b(r0.Q(this.f).subscribe(new if8(this)));
        a aVar2 = this.x;
        this.n.getClass();
        g<R> Q2 = r0.O(z2b.a).s().Q(this.f);
        ig8 ig8 = this.q;
        ig8.getClass();
        aVar2.b(Q2.subscribe(new ze8(ig8)));
    }

    public void j() {
        this.x.f();
    }
}
