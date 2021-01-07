package defpackage;

import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.header.o0;
import com.spotify.music.features.playlistentity.w;
import io.reactivex.y;

/* renamed from: pq6  reason: default package */
public class pq6 {
    private final wlf<o0> a;
    private final wlf<w> b;
    private final wlf<String> c;
    private final wlf<y> d;

    public pq6(wlf<o0> wlf, wlf<w> wlf2, wlf<String> wlf3, wlf<y> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public oq6 b(g gVar) {
        o0 o0Var = this.a.get();
        a(o0Var, 1);
        o0 o0Var2 = o0Var;
        w wVar = this.b.get();
        a(wVar, 2);
        w wVar2 = wVar;
        String str = this.c.get();
        a(str, 3);
        String str2 = str;
        y yVar = this.d.get();
        a(yVar, 4);
        a(gVar, 5);
        return new oq6(o0Var2, wVar2, str2, yVar, gVar);
    }
}
