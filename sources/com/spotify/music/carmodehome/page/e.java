package com.spotify.music.carmodehome.page;

import com.spotify.music.connection.l;
import io.reactivex.s;
import io.reactivex.y;

public final class e {
    private final wlf<y> a;
    private final wlf<dr2> b;
    private final wlf<l> c;
    private final wlf<s<Boolean>> d;

    public e(wlf<y> wlf, wlf<dr2> wlf2, wlf<l> wlf3, wlf<s<Boolean>> wlf4) {
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

    public d b(g gVar, s<h> sVar) {
        y yVar = this.a.get();
        a(yVar, 1);
        y yVar2 = yVar;
        a(gVar, 2);
        a(sVar, 3);
        dr2 dr2 = this.b.get();
        a(dr2, 4);
        dr2 dr22 = dr2;
        l lVar = this.c.get();
        a(lVar, 5);
        l lVar2 = lVar;
        s<Boolean> sVar2 = this.d.get();
        a(sVar2, 6);
        return new d(yVar2, gVar, sVar, dr22, lVar2, sVar2);
    }
}
