package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: jha  reason: default package */
public final class jha implements fjf<iha> {
    private final wlf<SpSharedPreferences<Object>> a;

    public jha(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iha(this.a.get());
    }
}
