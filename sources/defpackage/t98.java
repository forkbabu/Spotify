package defpackage;

/* renamed from: t98  reason: default package */
public final class t98 implements fjf<s98> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;

    public t98(wlf<jz1> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s98(this.a.get(), this.b.get());
    }
}
