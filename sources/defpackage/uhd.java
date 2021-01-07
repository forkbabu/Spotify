package defpackage;

import com.spotify.mobile.android.util.v;
import com.spotify.music.spotlets.tracker.identifier.a;

/* renamed from: uhd  reason: default package */
public final class uhd implements fjf<a> {
    private final wlf<v> a;

    public uhd(wlf<v> wlf) {
        this.a = wlf;
    }

    public static a a(v vVar) {
        return new thd(vVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new thd(this.a.get());
    }
}
