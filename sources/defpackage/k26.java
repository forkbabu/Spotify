package defpackage;

import defpackage.zo6;

/* renamed from: k26  reason: default package */
public class k26 implements zo6.c {
    private final wlf<f26> a;
    private final wlf<ui6> b;

    public k26(wlf<f26> wlf, wlf<ui6> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.zo6.c
    public zo6 create() {
        f26 f26 = this.a.get();
        a(f26, 1);
        ui6 ui6 = this.b.get();
        a(ui6, 2);
        return new h26(f26, ui6);
    }
}
