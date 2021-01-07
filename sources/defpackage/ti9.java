package defpackage;

/* renamed from: ti9  reason: default package */
public final class ti9 implements fjf<si9> {
    private final wlf<fi9> a;

    public ti9(wlf<fi9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new si9(this.a.get());
    }
}
