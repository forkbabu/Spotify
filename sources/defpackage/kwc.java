package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kwc  reason: default package */
public final class kwc implements fjf<jwc> {
    private final wlf<SpSharedPreferences<Object>> a;

    public kwc(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jwc(this.a.get());
    }
}
