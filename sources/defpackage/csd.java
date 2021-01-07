package defpackage;

/* renamed from: csd  reason: default package */
public final class csd implements fjf<bsd> {
    private final wlf<dsd> a;
    private final wlf<isd> b;
    private final wlf<jsd> c;

    public csd(wlf<dsd> wlf, wlf<isd> wlf2, wlf<jsd> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bsd(this.a.get(), this.b.get(), this.c.get());
    }
}
