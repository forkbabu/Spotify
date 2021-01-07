package defpackage;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.libs.search.history.i;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.UUID;

/* renamed from: rf8  reason: default package */
public class rf8 implements qf8, i3b {
    private final b61 a;
    private final y3b b;
    private final y c;
    private final u98 f;
    private final ig8 n;
    private final i o;
    private final i5b p;
    private final i4b q;
    private final efa r;
    private final com.spotify.mobile.android.hubframework.defaults.playback.i s;
    private Optional<b> t = Optional.absent();
    private String u = UUID.randomUUID().toString();

    rf8(y3b y3b, u98 u98, ig8 ig8, i iVar, i5b i5b, i4b i4b, y yVar, efa efa, com.spotify.mobile.android.hubframework.defaults.playback.i iVar2, b61 b61) {
        this.b = y3b;
        this.f = u98;
        this.c = yVar;
        this.n = ig8;
        this.o = iVar;
        this.p = i5b;
        this.q = i4b;
        this.r = efa;
        this.s = iVar2;
        this.a = b61;
    }

    private b91 g() {
        return this.a.f().b();
    }

    @Override // defpackage.qf8
    public Parcelable a() {
        this.r.b(this.u, this.a.f().b());
        return new dfa(this.u, this.a.j());
    }

    @Override // defpackage.qf8
    public void b(Parcelable parcelable) {
        if (parcelable instanceof dfa) {
            dfa dfa = (dfa) parcelable;
            String a2 = dfa.a();
            this.u = a2;
            b91 a3 = this.r.a(a2);
            if (a3 != null) {
                this.a.k(a3);
            }
            this.a.i(dfa.b());
        }
    }

    @Override // defpackage.i3b
    public int c() {
        return rqa.d(g());
    }

    @Override // defpackage.i3b
    public boolean d() {
        return !rqa.j(g());
    }

    @Override // defpackage.qf8
    public void e(b91 b91) {
        Optional<String> a2 = p3b.a(b91);
        if (a2.isPresent()) {
            this.f.b(a2.get());
        }
        ig8 ig8 = this.n;
        String title = b91.title();
        if (MoreObjects.isNullOrEmpty(title)) {
            title = "";
        }
        ig8.setTitle(title);
        f();
        g<y6b> b2 = this.q.b(this.p, this);
        y3b y3b = this.b;
        v vVar = new v(b2);
        b91 g = g();
        if (!g.equals(HubsImmutableViewModel.EMPTY)) {
            b91 = g;
        }
        s<b91> o0 = y3b.a(vVar, b91).o0(this.c);
        b61 b61 = this.a;
        b61.getClass();
        this.t = Optional.of(o0.subscribe(new ye8(b61)));
        this.s.g();
        this.s.c(this.a);
    }

    public void f() {
        if (this.t.isPresent()) {
            this.t.get().dispose();
            this.t = Optional.absent();
        }
    }

    @Override // defpackage.qf8
    public void stop() {
        f();
        this.o.c();
        this.s.h();
        this.s.f(this.a);
    }
}
