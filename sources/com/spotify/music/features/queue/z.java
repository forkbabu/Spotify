package com.spotify.music.features.queue;

import android.app.Activity;
import com.spotify.music.features.queue.playcontrols.f;
import com.spotify.music.libs.connect.k;
import com.spotify.music.libs.connect.o;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.sociallistening.facepile.d;
import com.spotify.remoteconfig.u6;
import com.squareup.picasso.Picasso;
import io.reactivex.a;

public final class z {
    private final wlf<v> a;
    private final wlf<f> b;
    private final wlf<c> c;
    private final wlf<b0> d;
    private final wlf<rw7> e;
    private final wlf<k> f;
    private final wlf<o> g;
    private final wlf<f4d> h;
    private final wlf<uba> i;
    private final wlf<a> j;
    private final wlf<nsb> k;
    private final wlf<Picasso> l;
    private final wlf<d> m;
    private final wlf<u6> n;

    public z(wlf<v> wlf, wlf<f> wlf2, wlf<c> wlf3, wlf<b0> wlf4, wlf<rw7> wlf5, wlf<k> wlf6, wlf<o> wlf7, wlf<f4d> wlf8, wlf<uba> wlf9, wlf<a> wlf10, wlf<nsb> wlf11, wlf<Picasso> wlf12, wlf<d> wlf13, wlf<u6> wlf14) {
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
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
        a(wlf10, 10);
        this.j = wlf10;
        a(wlf11, 11);
        this.k = wlf11;
        a(wlf12, 12);
        this.l = wlf12;
        a(wlf13, 13);
        this.m = wlf13;
        a(wlf14, 14);
        this.n = wlf14;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public y b(Activity activity) {
        a(activity, 1);
        v vVar = this.a.get();
        a(vVar, 2);
        v vVar2 = vVar;
        f fVar = this.b.get();
        a(fVar, 3);
        f fVar2 = fVar;
        c cVar = this.c.get();
        a(cVar, 4);
        c cVar2 = cVar;
        b0 b0Var = this.d.get();
        a(b0Var, 5);
        b0 b0Var2 = b0Var;
        rw7 rw7 = this.e.get();
        a(rw7, 6);
        rw7 rw72 = rw7;
        k kVar = this.f.get();
        a(kVar, 7);
        k kVar2 = kVar;
        o oVar = this.g.get();
        a(oVar, 8);
        o oVar2 = oVar;
        f4d f4d = this.h.get();
        a(f4d, 9);
        f4d f4d2 = f4d;
        uba uba = this.i.get();
        a(uba, 10);
        uba uba2 = uba;
        a aVar = this.j.get();
        a(aVar, 11);
        a aVar2 = aVar;
        nsb nsb = this.k.get();
        a(nsb, 12);
        nsb nsb2 = nsb;
        Picasso picasso = this.l.get();
        a(picasso, 13);
        Picasso picasso2 = picasso;
        d dVar = this.m.get();
        a(dVar, 14);
        d dVar2 = dVar;
        u6 u6Var = this.n.get();
        a(u6Var, 15);
        return new y(activity, vVar2, fVar2, cVar2, b0Var2, rw72, kVar2, oVar2, f4d2, uba2, aVar2, nsb2, picasso2, dVar2, u6Var);
    }
}
