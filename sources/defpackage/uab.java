package defpackage;

/* renamed from: uab  reason: default package */
public final class uab implements fjf<tab> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;

    public uab(wlf<jz1> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tab(this.a.get(), this.b.get());
    }
}
