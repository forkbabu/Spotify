package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: xj6  reason: default package */
public final class xj6 implements fjf<wj6> {
    private final wlf<SpSharedPreferences<Object>> a;

    public xj6(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wj6(this.a.get());
    }
}
