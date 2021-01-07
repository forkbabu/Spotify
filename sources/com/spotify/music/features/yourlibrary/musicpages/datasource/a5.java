package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.formatlisttype.a;
import io.reactivex.s;

public class a5 {
    private final wlf<e1> a;
    private final wlf<p> b;
    private final wlf<m> c;
    private final wlf<s<Boolean>> d;
    private final wlf<a> e;

    public a5(wlf<e1> wlf, wlf<p> wlf2, wlf<m> wlf3, wlf<s<Boolean>> wlf4, wlf<a> wlf5) {
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

    public z4 b(String str) {
        e1 e1Var = this.a.get();
        a(e1Var, 2);
        e1 e1Var2 = e1Var;
        p pVar = this.b.get();
        a(pVar, 3);
        p pVar2 = pVar;
        m mVar = this.c.get();
        a(mVar, 4);
        m mVar2 = mVar;
        s<Boolean> sVar = this.d.get();
        a(sVar, 5);
        s<Boolean> sVar2 = sVar;
        a aVar = this.e.get();
        a(aVar, 6);
        return new z4(str, e1Var2, pVar2, mVar2, sVar2, aVar);
    }
}
