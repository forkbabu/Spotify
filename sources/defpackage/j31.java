package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: j31  reason: default package */
public final class j31 implements fjf<i31> {
    private final wlf<SpSharedPreferences<Object>> a;

    public j31(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i31(this.a.get());
    }
}
