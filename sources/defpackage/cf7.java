package defpackage;

/* renamed from: cf7  reason: default package */
public final class cf7 implements fjf<bf7> {
    private final wlf<Boolean> a;
    private final wlf<df7> b;

    public cf7(wlf<Boolean> wlf, wlf<df7> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bf7(this.a.get().booleanValue(), this.b.get());
    }
}
