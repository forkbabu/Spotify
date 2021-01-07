package defpackage;

import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.g;

/* renamed from: xrb  reason: default package */
public final class xrb {
    private final wlf<g<String>> a;
    private final wlf<esb> b;

    public xrb(wlf<g<String>> wlf, wlf<esb> wlf2) {
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

    public wrb b(g<j> gVar) {
        a(gVar, 1);
        g<String> gVar2 = this.a.get();
        a(gVar2, 2);
        return new wrb(gVar, gVar2, this.b);
    }
}
