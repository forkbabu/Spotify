package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: rcd  reason: default package */
public final class rcd implements fjf<qcd> {
    private final wlf<SpSharedPreferences<Object>> a;

    public rcd(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qcd(this.a.get());
    }
}
