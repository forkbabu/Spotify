package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.media.v1;
import io.reactivex.g;
import io.reactivex.y;

public class k2 {
    private final wlf<Context> a;
    private final wlf<g<c>> b;
    private final wlf<y> c;
    private final wlf<y> d;
    private final wlf<b3> e;

    public k2(wlf<Context> wlf, wlf<g<c>> wlf2, wlf<y> wlf3, wlf<y> wlf4, wlf<b3> wlf5) {
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

    public j2 b(v1 v1Var, String str, d3 d3Var) {
        a(v1Var, 1);
        a(str, 2);
        Context context = this.a.get();
        a(context, 3);
        Context context2 = context;
        g<c> gVar = this.b.get();
        a(gVar, 4);
        g<c> gVar2 = gVar;
        y yVar = this.c.get();
        a(yVar, 5);
        y yVar2 = yVar;
        y yVar3 = this.d.get();
        a(yVar3, 6);
        y yVar4 = yVar3;
        b3 b3Var = this.e.get();
        a(b3Var, 7);
        a(d3Var, 8);
        return new j2(v1Var, str, context2, gVar2, yVar2, yVar4, b3Var, d3Var);
    }
}
