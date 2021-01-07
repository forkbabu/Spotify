package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.carmodeengine.settings.q;

/* renamed from: r5a  reason: default package */
public final class r5a implements fjf<c6a> {
    private final wlf<SpSharedPreferences<Object>> a;

    public r5a(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c7a c7a = c7a.a;
        return new q(this.a.get(), c7a.c(), c7a.a());
    }
}
