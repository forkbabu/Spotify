package defpackage;

/* renamed from: t65  reason: default package */
public final class t65 implements fjf<s65> {
    private final wlf<zvd> a;
    private final wlf<Boolean> b;

    public t65(wlf<zvd> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s65(this.a.get(), this.b.get().booleanValue());
    }
}
