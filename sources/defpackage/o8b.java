package defpackage;

/* renamed from: o8b  reason: default package */
public final class o8b implements fjf<n8b> {
    private final wlf<jz1> a;
    private final wlf<ifd> b;
    private final wlf<cqe> c;

    public o8b(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n8b(this.a.get(), this.b.get(), this.c.get());
    }
}
