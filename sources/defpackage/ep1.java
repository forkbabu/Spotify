package defpackage;

/* renamed from: ep1  reason: default package */
public final class ep1 implements fjf<dp1> {
    private final wlf<fp1> a;

    public ep1(wlf<fp1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dp1(this.a.get());
    }
}
