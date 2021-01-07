package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.viewbinder.o0;
import com.spotify.music.navigation.t;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

public final class p0 implements o0.a {
    private final wlf<t> a;
    private final wlf<p> b;
    private final wlf<v> c;
    private final wlf<ere> d;
    private final wlf<y> e;

    public p0(wlf<t> wlf, wlf<p> wlf2, wlf<v> wlf3, wlf<ere> wlf4, wlf<y> wlf5) {
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

    public o0 b(String str) {
        t tVar = this.a.get();
        a(tVar, 1);
        t tVar2 = tVar;
        p pVar = this.b.get();
        a(pVar, 2);
        p pVar2 = pVar;
        v vVar = this.c.get();
        a(vVar, 3);
        v vVar2 = vVar;
        ere ere = this.d.get();
        a(ere, 4);
        ere ere2 = ere;
        y yVar = this.e.get();
        a(yVar, 5);
        a(str, 6);
        return new o0(tVar2, pVar2, vVar2, ere2, yVar, str);
    }
}
