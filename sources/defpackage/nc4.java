package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.browse.e;
import com.spotify.rxjava2.q;
import io.reactivex.a;
import io.reactivex.g;
import io.reactivex.y;
import java.util.UUID;

/* renamed from: nc4  reason: default package */
public class nc4 implements ec4 {
    private final gf4 a;
    private final jf4 b;
    private final y c;
    private final bj9 d;
    private final q e = new q();
    private final b61 f;
    private final efa g;
    private String h = UUID.randomUUID().toString();
    private final a i;
    private final b91 j;

    public nc4(gf4 gf4, jf4 jf4, y yVar, bj9 bj9, b61 b61, efa efa, a aVar, b91 b91) {
        gf4.getClass();
        this.a = gf4;
        this.c = yVar;
        bj9.getClass();
        this.d = bj9;
        jf4.getClass();
        this.b = jf4;
        b61.getClass();
        this.f = b61;
        this.g = efa;
        this.i = aVar;
        this.j = b91;
    }

    private b91 c() {
        b91 b2 = this.f.f().b();
        return b2.equals(HubsImmutableViewModel.EMPTY) ? this.j : b2;
    }

    @Override // defpackage.ec4
    public String a() {
        return (String) x.n(c().custom().string("next_page_id"), "");
    }

    @Override // defpackage.ec4
    public int b() {
        return e.a(c());
    }

    public void d(b91 b91) {
        this.f.k(b91);
    }

    public void e() {
        this.e.c();
        g<b91> r0 = this.a.e(c()).V(1).r0();
        this.e.a(r0.Q(this.c).subscribe(new gc4(this)));
        q qVar = this.e;
        g<R> Q = r0.l(this.b).s().Q(this.c);
        bj9 bj9 = this.d;
        bj9.getClass();
        qVar.a(Q.subscribe(new ic4(bj9)));
        this.e.a(this.i.A(this.c).subscribe(hc4.a));
    }

    public void f() {
        this.e.c();
    }

    public void g(Parcelable parcelable) {
        if (parcelable instanceof dfa) {
            dfa dfa = (dfa) parcelable;
            b61 b61 = this.f;
            String a2 = dfa.a();
            this.h = a2;
            b91 a3 = this.g.a(a2);
            if (a3 != null) {
                b61.k(a3);
            }
            b61.i(dfa.b());
        }
    }

    public Parcelable h() {
        b61 b61 = this.f;
        this.g.b(this.h, b61.f().b());
        return new dfa(this.h, b61.j());
    }
}
