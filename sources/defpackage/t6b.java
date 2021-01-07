package defpackage;

/* renamed from: t6b  reason: default package */
public final class t6b implements fjf<s6b> {
    private final wlf<Boolean> a;
    private final wlf<Boolean> b;

    public t6b(wlf<Boolean> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s6b(this.a.get().booleanValue(), this.b.get().booleanValue());
    }
}
