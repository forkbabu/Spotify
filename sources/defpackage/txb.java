package defpackage;

/* renamed from: txb  reason: default package */
public final class txb implements fjf<sxb> {
    private final wlf<Boolean> a;
    private final wlf<cmd> b;

    public txb(wlf<Boolean> wlf, wlf<cmd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sxb(this.a.get().booleanValue(), this.b.get());
    }
}
