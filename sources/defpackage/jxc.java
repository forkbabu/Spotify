package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.premiummini.k;

/* renamed from: jxc  reason: default package */
public final class jxc implements fjf<hxc> {
    private final wlf<k> a;
    private final wlf<SpSharedPreferences<Object>> b;
    private final wlf<lxc> c;

    public jxc(wlf<k> wlf, wlf<SpSharedPreferences<Object>> wlf2, wlf<lxc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hxc(this.a.get(), this.b.get(), this.c.get());
    }
}
