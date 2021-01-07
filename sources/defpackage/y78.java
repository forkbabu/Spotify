package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

/* renamed from: y78  reason: default package */
public final class y78 implements fjf<SpSharedPreferences<Object>> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<String> c;

    public y78(wlf<Context> wlf, wlf<i> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.b.get().b(this.a.get(), this.c.get());
    }
}
