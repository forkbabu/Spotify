package defpackage;

/* renamed from: ihb  reason: default package */
public final class ihb implements fjf<hhb> {
    private final wlf<uib> a;
    private final wlf<rib> b;
    private final wlf<kib> c;
    private final wlf<xib> d;
    private final wlf<oib> e;

    public ihb(wlf<uib> wlf, wlf<rib> wlf2, wlf<kib> wlf3, wlf<xib> wlf4, wlf<oib> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hhb(this.a, this.b, this.c, this.d, this.e);
    }
}
