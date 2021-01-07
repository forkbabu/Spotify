package defpackage;

import com.spotify.remoteconfig.w9;
import defpackage.ja6;
import defpackage.qb6;
import defpackage.zo6;
import defpackage.zt6;

/* renamed from: cn6  reason: default package */
public class cn6 implements zo6.c {
    private final wlf<en6> a;
    private final wlf<zt6.a> b;
    private final wlf<ja6.a> c;
    private final wlf<ei6> d;
    private final wlf<w9> e;
    private final wlf<qb6.a> f;

    public cn6(wlf<en6> wlf, wlf<zt6.a> wlf2, wlf<ja6.a> wlf3, wlf<ei6> wlf4, wlf<w9> wlf5, wlf<qb6.a> wlf6) {
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
        en6 en6 = this.a.get();
        a(en6, 1);
        en6 en62 = en6;
        zt6.a aVar = this.b.get();
        a(aVar, 2);
        zt6.a aVar2 = aVar;
        ja6.a aVar3 = this.c.get();
        a(aVar3, 3);
        ja6.a aVar4 = aVar3;
        ei6 ei6 = this.d.get();
        a(ei6, 4);
        ei6 ei62 = ei6;
        w9 w9Var = this.e.get();
        a(w9Var, 5);
        w9 w9Var2 = w9Var;
        qb6.a aVar5 = this.f.get();
        a(aVar5, 6);
        return new zm6(en62, aVar2, aVar4, ei62, w9Var2, aVar5);
    }
}
