package defpackage;

import com.google.common.collect.ImmutableList;
import defpackage.zt6;

/* renamed from: bu6  reason: default package */
final class bu6 implements zt6.b.a {
    private final wlf<zt6.a> a;
    private final wlf<ImmutableList<eu6>> b;
    private final wlf<ImmutableList<gu6>> c;

    bu6(wlf<zt6.a> wlf, wlf<ImmutableList<eu6>> wlf2, wlf<ImmutableList<gu6>> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.zt6.b.a
    public zt6.b create() {
        zt6.a aVar = this.a.get();
        a(aVar, 1);
        ImmutableList<eu6> immutableList = this.b.get();
        a(immutableList, 2);
        ImmutableList<gu6> immutableList2 = this.c.get();
        a(immutableList2, 3);
        return new au6(aVar, immutableList, immutableList2);
    }
}
