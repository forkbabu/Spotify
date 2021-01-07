package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ul9  reason: default package */
public final class ul9 implements fjf<tl9> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<cqe> b;

    public ul9(wlf<SpSharedPreferences<Object>> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tl9(this.a.get(), this.b.get());
    }
}
