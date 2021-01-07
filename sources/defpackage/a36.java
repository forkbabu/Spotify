package defpackage;

import com.google.common.collect.ImmutableList;
import defpackage.zo6;
import defpackage.zt6;

/* renamed from: a36  reason: default package */
public final class a36 implements zo6.c {
    private final wlf<ImmutableList<gu6>> a;
    private final wlf<zt6.b.a> b;
    private final wlf<ui6> c;

    public a36(wlf<ImmutableList<gu6>> wlf, wlf<zt6.b.a> wlf2, wlf<ui6> wlf3) {
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

    @Override // defpackage.zo6.c
    public zo6 create() {
        ImmutableList<gu6> immutableList = this.a.get();
        a(immutableList, 1);
        zt6.b.a aVar = this.b.get();
        a(aVar, 2);
        ui6 ui6 = this.c.get();
        a(ui6, 3);
        return new x26(immutableList, aVar, ui6);
    }
}
