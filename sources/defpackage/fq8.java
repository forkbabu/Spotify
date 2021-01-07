package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: fq8  reason: default package */
public class fq8 implements r9c {
    private final w a;
    private final s<c> b;

    public fq8(w wVar, v vVar) {
        this.a = wVar;
        g<c> b2 = vVar.b();
        b2.getClass();
        this.b = new io.reactivex.internal.operators.observable.v(b2);
    }

    private s<String> b() {
        return s.n(this.a.c("ab_nuod_remove_taste_onboarding").j0(eq8.a), this.b, dq8.a);
    }

    public s<Boolean> a() {
        return b().j0(new bq8("b"));
    }

    public s<Boolean> c() {
        return b().j0(cq8.a);
    }
}
