package defpackage;

import defpackage.ifd;

/* renamed from: jfd  reason: default package */
public final class jfd implements fjf<ifd> {
    private final wlf<ifd.b> a;

    public jfd(wlf<ifd.b> wlf) {
        this.a = wlf;
    }

    public static ifd a(ifd.b bVar) {
        ifd z1 = bVar.z1();
        yif.g(z1, "Cannot return null from a non-@Nullable @Provides method");
        return z1;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
