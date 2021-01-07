package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ul2  reason: default package */
public final class ul2 implements fjf<tl2> {
    private final wlf<SpSharedPreferences<Object>> a;

    public ul2(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tl2(this.a.get());
    }
}
