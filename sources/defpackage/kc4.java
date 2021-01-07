package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.browse.e;
import com.spotify.rxjava2.q;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.k;
import io.reactivex.y;
import java.util.UUID;

/* renamed from: kc4  reason: default package */
public class kc4 implements jc4, ec4 {
    private final lf4 a;
    private final hf4 b;
    private final efa c;
    private final b61 d;
    protected final q e = new q();
    private final k<b91, String> f;
    private final bj9 g;
    protected final y h;
    private String i = UUID.randomUUID().toString();

    public kc4(hf4 hf4, dc4 dc4, k<b91, String> kVar, bj9 bj9, y yVar, efa efa, b61 b61) {
        this.b = hf4;
        this.a = new lf4(dc4);
        this.f = kVar;
        this.g = bj9;
        this.h = yVar;
        this.c = efa;
        this.d = b61;
    }

    @Override // defpackage.ec4
    public String a() {
        return (String) x.n(this.d.f().b().custom().string("next_page_id"), "");
    }

    @Override // defpackage.ec4
    public int b() {
        return e.a(this.d.f().b());
    }

    public /* synthetic */ void c(b91 b91) {
        this.d.k(b91);
    }

    public void d(Parcelable parcelable) {
        parcelable.getClass();
        if (parcelable instanceof dfa) {
            dfa dfa = (dfa) parcelable;
            String a2 = dfa.a();
            this.i = a2;
            b91 a3 = this.c.a(a2);
            if (a3 != null) {
                this.d.k(a3);
            }
            this.d.i(dfa.b());
        }
    }

    public Parcelable e() {
        this.c.b(this.i, this.d.f().b());
        return new dfa(this.i, this.d.j());
    }

    public void f(b91 b91) {
        this.e.c();
        lf4 lf4 = this.a;
        lf4.getClass();
        g<ff4> p = g.p(new nd4(lf4, this), BackpressureStrategy.LATEST);
        hf4 hf4 = this.b;
        b91 b2 = this.d.f().b();
        if (!b2.equals(HubsImmutableViewModel.EMPTY)) {
            b91 = b2;
        }
        g<b91> r0 = hf4.b(p, b91).V(1).r0();
        this.e.a(r0.Q(this.h).subscribe(new fc4(this)));
        q qVar = this.e;
        g<R> Q = r0.l(this.f).s().Q(this.h);
        bj9 bj9 = this.g;
        bj9.getClass();
        qVar.a(Q.subscribe(new ic4(bj9)));
    }

    public void g() {
        this.e.c();
    }
}
