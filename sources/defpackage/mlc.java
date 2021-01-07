package defpackage;

import defpackage.llc;

/* renamed from: mlc  reason: default package */
public final class mlc implements llc.a {
    private final wlf<rlc> a;
    private final wlf<olc> b;

    public mlc(wlf<rlc> wlf, wlf<olc> wlf2) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.llc.a
    public llc a(wjc wjc) {
        rlc rlc = this.a.get();
        b(rlc, 1);
        olc olc = this.b.get();
        b(olc, 2);
        b(wjc, 3);
        return new llc(rlc, olc, wjc);
    }
}
