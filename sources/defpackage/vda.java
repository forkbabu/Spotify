package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: vda  reason: default package */
public final class vda implements fjf<uda> {
    private final wlf<SpSharedPreferences<Object>> a;

    public vda(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uda(this.a.get());
    }
}
