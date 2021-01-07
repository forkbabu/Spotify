package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ph3  reason: default package */
public final class ph3 implements fjf<oh3> {
    private final wlf<SpSharedPreferences<Object>> a;

    public ph3(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oh3(this.a.get());
    }
}
