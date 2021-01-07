package defpackage;

import com.spotify.nowplaying.core.orientation.Orientation;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: d6c  reason: default package */
public final class d6c implements fjf<g<Boolean>> {
    private final wlf<Orientation> a;
    private final wlf<g<Boolean>> b;
    private final wlf<y> c;

    public d6c(wlf<Orientation> wlf, wlf<g<Boolean>> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.b.get().O(new s5c(this.a.get())).Q(this.c.get());
    }
}
