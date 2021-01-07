package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.g;

/* renamed from: ak9  reason: default package */
public final class ak9 implements fjf<zj9> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<g> b;

    public ak9(wlf<SpSharedPreferences<Object>> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zj9(this.a.get(), this.b.get());
    }
}
