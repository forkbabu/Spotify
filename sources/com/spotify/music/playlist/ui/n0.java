package com.spotify.music.playlist.ui;

import com.spotify.music.playlist.ui.l0;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;

public final class n0<T> implements l0.a<T> {
    private final wlf<Picasso> a;
    private final wlf<h0> b;
    private final wlf<htc> c;
    private final wlf<jtc> d;
    private final wlf<Boolean> e;
    private final wlf<y<T>> f;
    private final wlf<q> g;
    private final wlf<lbb> h;

    public n0(wlf<Picasso> wlf, wlf<h0> wlf2, wlf<htc> wlf3, wlf<jtc> wlf4, wlf<Boolean> wlf5, wlf<y<T>> wlf6, wlf<q> wlf7, wlf<lbb> wlf8) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
        b(wlf7, 7);
        this.g = wlf7;
        b(wlf8, 8);
        this.h = wlf8;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.playlist.ui.l0.a
    public l0 a(d0 d0Var, ajf ajf) {
        Picasso picasso = this.a.get();
        b(picasso, 1);
        Picasso picasso2 = picasso;
        h0 h0Var = this.b.get();
        b(h0Var, 2);
        h0 h0Var2 = h0Var;
        htc htc = this.c.get();
        b(htc, 3);
        htc htc2 = htc;
        jtc jtc = this.d.get();
        b(jtc, 4);
        jtc jtc2 = jtc;
        Boolean bool = this.e.get();
        b(bool, 5);
        boolean booleanValue = bool.booleanValue();
        y<T> yVar = this.f.get();
        b(yVar, 6);
        y<T> yVar2 = yVar;
        q qVar = this.g.get();
        b(qVar, 7);
        q qVar2 = qVar;
        lbb lbb = this.h.get();
        b(lbb, 8);
        b(d0Var, 9);
        b(ajf, 10);
        return new m0(picasso2, h0Var2, htc2, jtc2, booleanValue, yVar2, qVar2, lbb, d0Var, ajf);
    }
}
