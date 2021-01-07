package defpackage;

import android.content.Context;
import com.spotify.libs.instrumentation.performance.r;
import com.spotify.mobile.android.service.feature.q;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.v;

/* renamed from: ax9  reason: default package */
public final class ax9 implements fjf<zw9> {
    private final wlf<Context> a;
    private final wlf<r> b;
    private final wlf<v> c;
    private final wlf<t> d;
    private final wlf<String> e;
    private final wlf<SpSharedPreferences<Object>> f;
    private final wlf<q> g;

    public ax9(wlf<Context> wlf, wlf<r> wlf2, wlf<v> wlf3, wlf<t> wlf4, wlf<String> wlf5, wlf<SpSharedPreferences<Object>> wlf6, wlf<q> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zw9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
