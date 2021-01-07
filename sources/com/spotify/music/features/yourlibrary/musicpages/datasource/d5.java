package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.endpoints.d;
import io.reactivex.s;

public class d5 {
    private final wlf<e1> a;
    private final wlf<d> b;
    private final wlf<m> c;
    private final wlf<s<Boolean>> d;
    private final wlf<String> e;

    public d5(wlf<e1> wlf, wlf<d> wlf2, wlf<m> wlf3, wlf<s<Boolean>> wlf4, wlf<String> wlf5) {
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

    public c5 b() {
        e1 e1Var = this.a.get();
        a(e1Var, 1);
        e1 e1Var2 = e1Var;
        d dVar = this.b.get();
        a(dVar, 2);
        d dVar2 = dVar;
        m mVar = this.c.get();
        a(mVar, 3);
        m mVar2 = mVar;
        s<Boolean> sVar = this.d.get();
        a(sVar, 4);
        s<Boolean> sVar2 = sVar;
        String str = this.e.get();
        a(str, 5);
        return new c5(e1Var2, dVar2, mVar2, sVar2, str);
    }
}
