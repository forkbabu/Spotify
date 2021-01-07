package defpackage;

import com.spotify.libs.search.history.i;
import defpackage.qf8;
import io.reactivex.y;

/* renamed from: sf8  reason: default package */
public final class sf8 implements qf8.a {
    private final wlf<y3b> a;
    private final wlf<u98> b;
    private final wlf<ig8> c;
    private final wlf<i> d;
    private final wlf<i5b> e;
    private final wlf<i4b> f;
    private final wlf<y> g;
    private final wlf<efa> h;
    private final wlf<com.spotify.mobile.android.hubframework.defaults.playback.i> i;

    public sf8(wlf<y3b> wlf, wlf<u98> wlf2, wlf<ig8> wlf3, wlf<i> wlf4, wlf<i5b> wlf5, wlf<i4b> wlf6, wlf<y> wlf7, wlf<efa> wlf8, wlf<com.spotify.mobile.android.hubframework.defaults.playback.i> wlf9) {
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
        b(wlf9, 9);
        this.i = wlf9;
    }

    private static <T> T b(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    @Override // defpackage.qf8.a
    public qf8 a(b61 b61) {
        y3b y3b = this.a.get();
        b(y3b, 1);
        y3b y3b2 = y3b;
        u98 u98 = this.b.get();
        b(u98, 2);
        u98 u982 = u98;
        ig8 ig8 = this.c.get();
        b(ig8, 3);
        ig8 ig82 = ig8;
        i iVar = this.d.get();
        b(iVar, 4);
        i iVar2 = iVar;
        i5b i5b = this.e.get();
        b(i5b, 5);
        i5b i5b2 = i5b;
        i4b i4b = this.f.get();
        b(i4b, 6);
        i4b i4b2 = i4b;
        y yVar = this.g.get();
        b(yVar, 7);
        y yVar2 = yVar;
        efa efa = this.h.get();
        b(efa, 8);
        efa efa2 = efa;
        com.spotify.mobile.android.hubframework.defaults.playback.i iVar3 = this.i.get();
        b(iVar3, 9);
        b(b61, 10);
        return new rf8(y3b2, u982, ig82, iVar2, i5b2, i4b2, yVar2, efa2, iVar3, b61);
    }
}
