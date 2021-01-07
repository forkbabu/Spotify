package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.ads.api.h;
import com.spotify.music.productstate.c;

/* renamed from: rv3  reason: default package */
public final class rv3 implements fjf<qv3> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<w52> b;
    private final wlf<h> c;
    private final wlf<ov3> d;
    private final wlf<c> e;

    public rv3(wlf<SpSharedPreferences<Object>> wlf, wlf<w52> wlf2, wlf<h> wlf3, wlf<ov3> wlf4, wlf<c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qv3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
