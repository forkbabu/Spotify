package com.spotify.music.features.payfail;

import android.content.Context;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.t;

public final class v {
    private final wlf<Context> a;
    private final wlf<t> b;
    private final wlf<y> c;
    private final wlf<w> d;
    private final wlf<yn1> e;

    public v(wlf<Context> wlf, wlf<t> wlf2, wlf<y> wlf3, wlf<w> wlf4, wlf<yn1> wlf5) {
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

    public u b(r rVar) {
        Context context = this.a.get();
        a(context, 1);
        Context context2 = context;
        t tVar = this.b.get();
        a(tVar, 2);
        t tVar2 = tVar;
        y yVar = this.c.get();
        a(yVar, 3);
        y yVar2 = yVar;
        w wVar = this.d.get();
        a(wVar, 4);
        w wVar2 = wVar;
        yn1 yn1 = this.e.get();
        a(yn1, 5);
        a(rVar, 6);
        return new u(context2, tVar2, yVar2, wVar2, yn1, rVar);
    }
}
