package defpackage;

import com.google.android.exoplayer2.upstream.o;
import com.google.protobuf.u;
import com.spotify.mobile.android.video.exo.n;
import com.spotify.music.json.g;
import okhttp3.y;

/* renamed from: j72  reason: default package */
public final class j72 {
    private final wlf<y> a;
    private final wlf<g> b;
    private final wlf<o> c;
    private final wlf<n> d;
    private final wlf<gl0<u>> e;

    public j72(wlf<y> wlf, wlf<g> wlf2, wlf<o> wlf3, wlf<n> wlf4, wlf<gl0<u>> wlf5) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public i72 b(com.spotify.mobile.android.video.drm.g gVar, p62 p62) {
        y yVar = this.a.get();
        a(yVar, 1);
        y yVar2 = yVar;
        g gVar2 = this.b.get();
        a(gVar2, 2);
        g gVar3 = gVar2;
        o oVar = this.c.get();
        a(oVar, 3);
        o oVar2 = oVar;
        n nVar = this.d.get();
        a(nVar, 4);
        n nVar2 = nVar;
        gl0<u> gl0 = this.e.get();
        a(gl0, 5);
        a(gVar, 6);
        a(p62, 7);
        return new i72(yVar2, gVar3, oVar2, nVar2, gl0, gVar, p62);
    }
}
