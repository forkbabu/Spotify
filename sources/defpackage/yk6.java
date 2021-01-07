package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: yk6  reason: default package */
public final class yk6 implements fjf<xk6> {
    private final wlf<SpSharedPreferences<Object>> a;

    public yk6(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xk6(this.a.get());
    }
}
