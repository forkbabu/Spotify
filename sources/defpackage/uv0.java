package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: uv0  reason: default package */
public final class uv0 implements fjf<tv0> {
    private final wlf<SpSharedPreferences<Object>> a;

    public uv0(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tv0(this.a.get());
    }
}
