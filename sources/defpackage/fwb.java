package defpackage;

import com.spotify.music.json.g;

/* renamed from: fwb  reason: default package */
public final class fwb {
    private final wlf<bwb> a;
    private final wlf<g> b;

    public fwb(wlf<bwb> wlf, wlf<g> wlf2) {
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

    public ewb b(zvb zvb, int i) {
        a(zvb, 1);
        bwb bwb = this.a.get();
        a(bwb, 3);
        g gVar = this.b.get();
        a(gVar, 4);
        return new ewb(zvb, i, bwb, gVar);
    }
}
