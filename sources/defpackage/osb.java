package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import io.reactivex.g;

/* renamed from: osb  reason: default package */
public final class osb implements fjf<g<OrientationMode>> {
    private final wlf<Boolean> a;

    public osb(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return g.N(this.a.get().booleanValue() ? OrientationMode.UNSPECIFIED : OrientationMode.PORTRAIT_ONLY);
    }
}
