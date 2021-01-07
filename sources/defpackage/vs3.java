package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: vs3  reason: default package */
public final class vs3 implements fjf<us3> {
    private final wlf<SpSharedPreferences<Object>> a;

    public vs3(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new us3(this.a.get());
    }
}
