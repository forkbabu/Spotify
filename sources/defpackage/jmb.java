package defpackage;

import com.spotify.music.newplaying.scroll.view.l;
import io.reactivex.g;

/* renamed from: jmb  reason: default package */
public final class jmb {
    private final wlf<lmb> a;
    private final wlf<g<String>> b;

    public jmb(wlf<lmb> wlf, wlf<g<String>> wlf2) {
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

    public imb b(g<l> gVar) {
        lmb lmb = this.a.get();
        a(lmb, 1);
        g<String> gVar2 = this.b.get();
        a(gVar2, 2);
        a(gVar, 3);
        return new imb(lmb, gVar2, gVar);
    }
}
