package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: n9c  reason: default package */
public final class n9c implements fjf<m9c> {
    private final wlf<SpSharedPreferences<Object>> a;

    public n9c(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m9c(this.a.get());
    }
}
