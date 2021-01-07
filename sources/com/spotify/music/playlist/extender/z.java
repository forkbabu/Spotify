package com.spotify.music.playlist.extender;

import com.spotify.music.playlist.extender.u;
import io.reactivex.y;

public class z {
    private final wlf<s0> a;
    private final wlf<String> b;
    private final wlf<d8a> c;
    private final wlf<y> d;
    private final wlf<Integer> e;

    public z(wlf<s0> wlf, wlf<String> wlf2, wlf<d8a> wlf3, wlf<y> wlf4, wlf<Integer> wlf5) {
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

    public u b(u.a aVar) {
        s0 s0Var = this.a.get();
        a(s0Var, 1);
        s0 s0Var2 = s0Var;
        String str = this.b.get();
        a(str, 2);
        String str2 = str;
        d8a d8a = this.c.get();
        a(d8a, 3);
        d8a d8a2 = d8a;
        y yVar = this.d.get();
        a(yVar, 4);
        y yVar2 = yVar;
        a(aVar, 5);
        Integer num = this.e.get();
        a(num, 6);
        return new u(s0Var2, str2, d8a2, yVar2, aVar, num.intValue());
    }
}
