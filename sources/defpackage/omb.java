package defpackage;

import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.g;

/* renamed from: omb  reason: default package */
public final class omb {
    private final wlf<xrb> a;
    private final wlf<g<j>> b;

    public omb(wlf<xrb> wlf, wlf<g<j>> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public nmb b(g<Boolean> gVar) {
        xrb xrb = this.a.get();
        a(xrb, 1);
        g<j> gVar2 = this.b.get();
        a(gVar2, 2);
        a(gVar, 3);
        return new nmb(xrb, gVar2, gVar);
    }
}
