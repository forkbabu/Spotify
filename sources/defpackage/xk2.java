package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: xk2  reason: default package */
public final class xk2 implements fjf<wk2> {
    private final wlf<yk2> a;
    private final wlf<SpSharedPreferences<Object>> b;
    private final wlf<cqe> c;

    public xk2(wlf<yk2> wlf, wlf<SpSharedPreferences<Object>> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wk2(this.a.get(), this.b.get(), this.c.get());
    }
}
