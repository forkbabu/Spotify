package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: gkd  reason: default package */
public final class gkd implements fjf<fkd> {
    private final wlf<cqe> a;
    private final wlf<SpSharedPreferences<Object>> b;

    public gkd(wlf<cqe> wlf, wlf<SpSharedPreferences<Object>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fkd(this.a.get(), this.b.get());
    }
}
