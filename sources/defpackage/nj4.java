package defpackage;

import com.spotify.music.features.playlistentity.header.x0;
import com.spotify.remoteconfig.o9;
import defpackage.qb6;
import defpackage.zo6;

/* renamed from: nj4  reason: default package */
public class nj4 implements zo6.c {
    private final wlf<uj4> a;
    private final wlf<gj4> b;
    private final wlf<qb6.a> c;
    private final wlf<x0.a> d;
    private final wlf<o9> e;
    private final wlf<ij4> f;

    public nj4(wlf<uj4> wlf, wlf<gj4> wlf2, wlf<qb6.a> wlf3, wlf<x0.a> wlf4, wlf<o9> wlf5, wlf<ij4> wlf6) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.zo6.c
    public zo6 create() {
        uj4 uj4 = this.a.get();
        a(uj4, 1);
        uj4 uj42 = uj4;
        gj4 gj4 = this.b.get();
        a(gj4, 2);
        gj4 gj42 = gj4;
        qb6.a aVar = this.c.get();
        a(aVar, 3);
        qb6.a aVar2 = aVar;
        x0.a aVar3 = this.d.get();
        a(aVar3, 4);
        x0.a aVar4 = aVar3;
        o9 o9Var = this.e.get();
        a(o9Var, 5);
        o9 o9Var2 = o9Var;
        ij4 ij4 = this.f.get();
        a(ij4, 6);
        return new kj4(uj42, gj42, aVar2, aVar4, o9Var2, ij4);
    }
}
