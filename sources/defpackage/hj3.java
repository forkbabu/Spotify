package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.addtoplaylist.logger.c;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.i;
import com.spotify.remoteconfig.a5;
import defpackage.fj3;
import io.reactivex.y;

/* renamed from: hj3  reason: default package */
public final class hj3 implements fj3.a {
    private final wlf<d> a;
    private final wlf<i> b;
    private final wlf<c> c;
    private final wlf<y> d;
    private final wlf<com.spotify.music.features.createplaylist.d> e;
    private final wlf<l31> f;
    private final wlf<ei3> g;
    private final wlf<fi3> h;
    private final wlf<di3> i;
    private final wlf<kj3> j;
    private final wlf<ih0> k;
    private final wlf<lbb> l;
    private final wlf<CollectionStateProvider> m;
    private final wlf<mj3> n;
    private final wlf<a5> o;

    public hj3(wlf<d> wlf, wlf<i> wlf2, wlf<c> wlf3, wlf<y> wlf4, wlf<com.spotify.music.features.createplaylist.d> wlf5, wlf<l31> wlf6, wlf<ei3> wlf7, wlf<fi3> wlf8, wlf<di3> wlf9, wlf<kj3> wlf10, wlf<ih0> wlf11, wlf<lbb> wlf12, wlf<CollectionStateProvider> wlf13, wlf<mj3> wlf14, wlf<a5> wlf15) {
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
        a(wlf15, 15);
        this.o = wlf15;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public fj3 b() {
        d dVar = this.a.get();
        a(dVar, 1);
        d dVar2 = dVar;
        i iVar = this.b.get();
        a(iVar, 2);
        i iVar2 = iVar;
        c cVar = this.c.get();
        a(cVar, 3);
        c cVar2 = cVar;
        y yVar = this.d.get();
        a(yVar, 4);
        y yVar2 = yVar;
        com.spotify.music.features.createplaylist.d dVar3 = this.e.get();
        a(dVar3, 5);
        com.spotify.music.features.createplaylist.d dVar4 = dVar3;
        l31 l31 = this.f.get();
        a(l31, 6);
        l31 l312 = l31;
        ei3 ei3 = this.g.get();
        a(ei3, 7);
        ei3 ei32 = ei3;
        fi3 fi3 = this.h.get();
        a(fi3, 8);
        fi3 fi32 = fi3;
        di3 di3 = this.i.get();
        a(di3, 9);
        di3 di32 = di3;
        kj3 kj3 = this.j.get();
        a(kj3, 10);
        kj3 kj32 = kj3;
        ih0 ih0 = this.k.get();
        a(ih0, 11);
        ih0 ih02 = ih0;
        lbb lbb = this.l.get();
        a(lbb, 12);
        lbb lbb2 = lbb;
        CollectionStateProvider collectionStateProvider = this.m.get();
        a(collectionStateProvider, 13);
        CollectionStateProvider collectionStateProvider2 = collectionStateProvider;
        mj3 mj3 = this.n.get();
        a(mj3, 14);
        mj3 mj32 = mj3;
        a5 a5Var = this.o.get();
        a(a5Var, 15);
        return new gj3(dVar2, iVar2, cVar2, yVar2, dVar4, l312, ei32, fi32, di32, kj32, ih02, lbb2, collectionStateProvider2, mj32, a5Var);
    }
}
