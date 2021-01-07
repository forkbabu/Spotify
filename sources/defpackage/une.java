package defpackage;

import com.spotify.mobile.android.util.connectivity.v;
import com.spotify.music.settings.a;

/* renamed from: une  reason: default package */
public final class une implements fjf<tne> {
    private final wlf<v> a;
    private final wlf<a> b;

    public une(wlf<v> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tne(this.a.get(), this.b.get());
    }
}
