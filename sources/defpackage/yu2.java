package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

/* renamed from: yu2  reason: default package */
public final class yu2 implements fjf<SpSharedPreferences<Object>> {
    private final wlf<Context> a;
    private final wlf<i> b;

    public yu2(wlf<Context> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.b.get().d(this.a.get());
    }
}
