package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import io.reactivex.g;

/* renamed from: b6c  reason: default package */
public final class b6c implements fjf<g<OrientationMode>> {
    private final wlf<g<Boolean>> a;

    public b6c(wlf<g<Boolean>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().O(r5c.a);
    }
}
