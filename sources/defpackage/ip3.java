package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ip3  reason: default package */
public final class ip3 implements fjf<hp3> {
    private final wlf<SpSharedPreferences<Object>> a;

    public ip3(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hp3(this.a.get());
    }
}
