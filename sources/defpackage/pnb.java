package defpackage;

/* renamed from: pnb  reason: default package */
public final class pnb implements fjf<knb> {
    private final wlf<nnb> a;
    private final wlf<awc> b;

    public pnb(wlf<nnb> wlf, wlf<awc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new knb(this.a.get(), this.b.get());
    }
}
