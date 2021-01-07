package defpackage;

import defpackage.ao6;
import io.reactivex.y;

/* renamed from: co6  reason: default package */
final class co6 implements ao6.a {
    private final wlf<nsb> a;
    private final wlf<vq6> b;
    private final wlf<eo6> c;
    private final wlf<y> d;

    co6(wlf<nsb> wlf, wlf<vq6> wlf2, wlf<eo6> wlf3, wlf<y> wlf4) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.ao6.a
    public ao6 a(oo6 oo6) {
        nsb nsb = this.a.get();
        b(nsb, 1);
        nsb nsb2 = nsb;
        vq6 vq6 = this.b.get();
        b(vq6, 2);
        vq6 vq62 = vq6;
        eo6 eo6 = this.c.get();
        b(eo6, 3);
        eo6 eo62 = eo6;
        y yVar = this.d.get();
        b(yVar, 4);
        b(oo6, 5);
        return new bo6(nsb2, vq62, eo62, yVar, oo6);
    }
}
