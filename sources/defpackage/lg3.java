package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: lg3  reason: default package */
public final class lg3 implements fjf<kg3> {
    private final wlf<SpSharedPreferences<Object>> a;

    public lg3(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kg3(this.a.get());
    }
}
