package defpackage;

/* renamed from: g28  reason: default package */
public final class g28 implements fjf<f28> {
    private final wlf<s18> a;

    public g28(wlf<s18> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f28(this.a.get());
    }
}
