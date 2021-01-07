package defpackage;

import com.google.android.exoplayer2.upstream.o;
import com.spotify.mobile.android.video.drm.g;
import okhttp3.y;

/* renamed from: o72  reason: default package */
public final class o72 {
    private final wlf<y> a;
    private final wlf<o> b;

    public o72(wlf<y> wlf, wlf<o> wlf2) {
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

    public n72 b(g gVar) {
        y yVar = this.a.get();
        a(yVar, 1);
        o oVar = this.b.get();
        a(oVar, 2);
        a(gVar, 3);
        return new n72(yVar, oVar, gVar);
    }
}
