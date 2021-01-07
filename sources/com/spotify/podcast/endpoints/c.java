package com.spotify.podcast.endpoints;

import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        qyd qyd;
        u3 u3Var = (u3) obj;
        S s = u3Var.b;
        F f = u3Var.a;
        if (s == null) {
            qyd = null;
        } else {
            qyd = tyd.i(s);
        }
        return new u3(f, qyd);
    }
}
