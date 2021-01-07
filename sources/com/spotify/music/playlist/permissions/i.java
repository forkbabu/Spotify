package com.spotify.music.playlist.permissions;

import com.spotify.music.playlist.permissions.h;
import com.spotify.music.playlist.permissions.j;
import com.spotify.music.playlist.permissions.l;
import com.spotify.music.playlist.permissions.o;
import com.spotify.pageloader.s0;

public final class i implements h.a {
    private final wlf<l.a> a;
    private final wlf<o.a> b;
    private final wlf<s> c;

    public i(wlf<l.a> wlf, wlf<o.a> wlf2, wlf<s> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public s0 b(cmf cmf, j.b bVar) {
        l.a aVar = this.a.get();
        a(aVar, 1);
        l.a aVar2 = aVar;
        o.a aVar3 = this.b.get();
        a(aVar3, 2);
        o.a aVar4 = aVar3;
        s sVar = this.c.get();
        a(sVar, 3);
        a(cmf, 4);
        a(bVar, 5);
        return new h(aVar2, aVar4, sVar, cmf, bVar);
    }
}
