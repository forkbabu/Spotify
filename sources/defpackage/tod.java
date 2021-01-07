package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: tod  reason: default package */
public final class tod implements fjf<sod> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<cqe> b;

    public tod(wlf<SpSharedPreferences<Object>> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sod(this.a.get(), this.b.get());
    }
}
