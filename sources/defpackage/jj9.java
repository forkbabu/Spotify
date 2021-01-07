package defpackage;

import defpackage.ij9;

/* renamed from: jj9  reason: default package */
public final class jj9 implements fjf<ij9> {
    private final wlf<ij9.b> a;

    public jj9(wlf<ij9.b> wlf) {
        this.a = wlf;
    }

    public static ij9 a(ij9.b bVar) {
        ij9 u0 = bVar.u0();
        yif.g(u0, "Cannot return null from a non-@Nullable @Provides method");
        return u0;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
