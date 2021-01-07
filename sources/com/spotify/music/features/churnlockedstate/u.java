package com.spotify.music.features.churnlockedstate;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class u {
    static final SpSharedPreferences.b<Object, Long> e = SpSharedPreferences.b.e("churn_locked_state_unlocked_at");
    private static final long f = TimeUnit.HOURS.toMillis(24);
    private final w a;
    private final SpSharedPreferences<Object> b;
    private final y c;
    private final cqe d;

    public u(w wVar, SpSharedPreferences<Object> spSharedPreferences, y yVar, cqe cqe) {
        this.a = wVar;
        this.b = spSharedPreferences;
        this.c = yVar;
        this.d = cqe;
    }

    public s<r> a() {
        return c().W(new f(this), false, Integer.MAX_VALUE).I0(this.c);
    }

    public boolean b() {
        SpSharedPreferences<Object> spSharedPreferences = this.b;
        SpSharedPreferences.b<Object, Long> bVar = e;
        long d2 = this.d.d();
        long j = f;
        return this.d.d() - spSharedPreferences.j(bVar, d2 - j) < j;
    }

    public s<Boolean> c() {
        return s.c0(new o(this)).W(new e(this), false, Integer.MAX_VALUE).I0(this.c);
    }

    public v d(Boolean bool) {
        if (bool.booleanValue()) {
            return this.a.c("premium-only-market-mobile").j0(g.a).j0(i.a).I0(this.c);
        }
        return o.a;
    }

    public v e(Boolean bool) {
        if (bool.booleanValue()) {
            return s.i0(Boolean.FALSE);
        }
        return this.a.c("payments-locked-state").j0(d.a).I0(this.c);
    }

    public void f() {
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.e(e, this.d.d());
        b2.i();
    }
}
