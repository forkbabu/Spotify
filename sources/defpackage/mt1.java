package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.g;

/* renamed from: mt1  reason: default package */
public final class mt1 implements fjf<lt1> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<g> b;

    public mt1(wlf<SpSharedPreferences<Object>> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lt1(this.a.get(), this.b.get());
    }
}
