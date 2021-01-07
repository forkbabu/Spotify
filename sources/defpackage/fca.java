package defpackage;

import com.spotify.libs.connect.instrumentation.d;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.settings.a;

/* renamed from: fca  reason: default package */
public final class fca implements fjf<eca> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<a> b;
    private final wlf<d> c;

    public fca(wlf<SpSharedPreferences<Object>> wlf, wlf<a> wlf2, wlf<d> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eca(this.a.get(), this.b.get(), this.c.get());
    }
}
