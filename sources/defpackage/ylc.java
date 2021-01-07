package defpackage;

/* renamed from: ylc  reason: default package */
public final class ylc implements fjf<xlc> {
    private final wlf<vjc> a;
    private final wlf<Integer> b;

    public ylc(wlf<vjc> wlf, wlf<Integer> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xlc(this.a.get(), this.b.get().intValue());
    }
}
