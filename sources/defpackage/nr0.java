package defpackage;

import com.spotify.libs.connect.instrumentation.d;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: nr0  reason: default package */
public final class nr0 implements fjf<mr0> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<d> b;

    public nr0(wlf<SpSharedPreferences<Object>> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mr0(this.a.get(), this.b.get());
    }
}
