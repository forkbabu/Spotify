package com.spotify.music.features.findfriends;

import com.spotify.music.features.findfriends.logging.FindFriendsLogger;
import com.spotify.music.follow.m;
import com.spotify.music.navigation.t;
import io.reactivex.s;
import io.reactivex.y;

public final class z0 {
    private final wlf<y> a;
    private final wlf<m> b;
    private final wlf<FindFriendsLogger> c;
    private final wlf<t> d;
    private final wlf<u0> e;

    public z0(wlf<y> wlf, wlf<m> wlf2, wlf<FindFriendsLogger> wlf3, wlf<t> wlf4, wlf<u0> wlf5) {
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

    public y0 b(c1 c1Var, s<p0> sVar) {
        a(c1Var, 1);
        a(sVar, 2);
        y yVar = this.a.get();
        a(yVar, 3);
        y yVar2 = yVar;
        m mVar = this.b.get();
        a(mVar, 4);
        m mVar2 = mVar;
        FindFriendsLogger findFriendsLogger = this.c.get();
        a(findFriendsLogger, 5);
        FindFriendsLogger findFriendsLogger2 = findFriendsLogger;
        t tVar = this.d.get();
        a(tVar, 6);
        t tVar2 = tVar;
        u0 u0Var = this.e.get();
        a(u0Var, 7);
        return new y0(c1Var, sVar, yVar2, mVar2, findFriendsLogger2, tVar2, u0Var);
    }
}
