package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: c90  reason: default package */
public final class c90 implements fjf<b90> {
    private final wlf<SpSharedPreferences<Object>> a;

    public c90(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b90(this.a.get());
    }
}
