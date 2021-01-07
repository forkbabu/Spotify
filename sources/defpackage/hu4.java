package defpackage;

import com.spotify.music.features.createplaylist.logger.a;
import com.spotify.music.navigation.t;
import com.spotify.playlist.endpoints.v;
import defpackage.fu4;
import io.reactivex.y;

/* renamed from: hu4  reason: default package */
public final class hu4 implements fu4.a {
    private final wlf<a> a;
    private final wlf<v> b;
    private final wlf<y> c;
    private final wlf<lu4> d;
    private final wlf<t> e;
    private final wlf<l31> f;
    private final wlf<yt4> g;
    private final wlf<iu4> h;
    private final wlf<xt4> i;

    public hu4(wlf<a> wlf, wlf<v> wlf2, wlf<y> wlf3, wlf<lu4> wlf4, wlf<t> wlf5, wlf<l31> wlf6, wlf<yt4> wlf7, wlf<iu4> wlf8, wlf<xt4> wlf9) {
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
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public fu4 b() {
        a aVar = this.a.get();
        a(aVar, 1);
        a aVar2 = aVar;
        v vVar = this.b.get();
        a(vVar, 2);
        v vVar2 = vVar;
        y yVar = this.c.get();
        a(yVar, 3);
        y yVar2 = yVar;
        lu4 lu4 = this.d.get();
        a(lu4, 4);
        lu4 lu42 = lu4;
        t tVar = this.e.get();
        a(tVar, 5);
        t tVar2 = tVar;
        l31 l31 = this.f.get();
        a(l31, 6);
        l31 l312 = l31;
        yt4 yt4 = this.g.get();
        a(yt4, 7);
        yt4 yt42 = yt4;
        iu4 iu4 = this.h.get();
        a(iu4, 8);
        iu4 iu42 = iu4;
        xt4 xt4 = this.i.get();
        a(xt4, 9);
        return new gu4(aVar2, vVar2, yVar2, lu42, tVar2, l312, yt42, iu42, xt4);
    }
}
