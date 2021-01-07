package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: wy0  reason: default package */
public final class wy0 implements fjf<ny0> {
    private final wlf<Boolean> a;
    private final wlf<SpSharedPreferences<Object>> b;

    public wy0(wlf<Boolean> wlf, wlf<SpSharedPreferences<Object>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().booleanValue() ? new oy0(this.b.get()) : new py0();
    }
}
