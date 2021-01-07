package defpackage;

import android.content.Context;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.g7;
import defpackage.ff2;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ls1  reason: default package */
public class ls1 {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<hl2> d;
    private final wlf<w> e;
    private final wlf<g<PlayerState>> f;
    private final wlf<cqe> g;
    private final wlf<ai2> h;
    private final wlf<mg2> i;
    private final wlf<hh2> j;
    private final wlf<g7> k;
    private final wlf<ts1> l;

    public ls1(wlf<Context> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<hl2> wlf4, wlf<w> wlf5, wlf<g<PlayerState>> wlf6, wlf<cqe> wlf7, wlf<ai2> wlf8, wlf<mg2> wlf9, wlf<hh2> wlf10, wlf<g7> wlf11, wlf<ts1> wlf12) {
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
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public ks1 b(ff2.a aVar, v1 v1Var) {
        a(aVar, 1);
        a(v1Var, 2);
        Context context = this.a.get();
        a(context, 3);
        Context context2 = context;
        y yVar = this.b.get();
        a(yVar, 4);
        y yVar2 = yVar;
        y yVar3 = this.c.get();
        a(yVar3, 5);
        y yVar4 = yVar3;
        hl2 hl2 = this.d.get();
        a(hl2, 6);
        hl2 hl22 = hl2;
        w wVar = this.e.get();
        a(wVar, 7);
        w wVar2 = wVar;
        g<PlayerState> gVar = this.f.get();
        a(gVar, 8);
        g<PlayerState> gVar2 = gVar;
        cqe cqe = this.g.get();
        a(cqe, 9);
        cqe cqe2 = cqe;
        ai2 ai2 = this.h.get();
        a(ai2, 10);
        ai2 ai22 = ai2;
        mg2 mg2 = this.i.get();
        a(mg2, 11);
        mg2 mg22 = mg2;
        hh2 hh2 = this.j.get();
        a(hh2, 12);
        hh2 hh22 = hh2;
        g7 g7Var = this.k.get();
        a(g7Var, 13);
        g7 g7Var2 = g7Var;
        ts1 ts1 = this.l.get();
        a(ts1, 14);
        return new ks1(aVar, v1Var, context2, yVar2, yVar4, hl22, wVar2, gVar2, cqe2, ai22, mg22, hh22, g7Var2, ts1);
    }
}
