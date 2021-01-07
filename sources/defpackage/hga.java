package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: hga  reason: default package */
public final class hga implements fjf<gga> {
    private final wlf<kga> a;
    private final wlf<SpSharedPreferences<Object>> b;

    public hga(wlf<kga> wlf, wlf<SpSharedPreferences<Object>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gga(this.a.get(), this.b.get());
    }
}
