package defpackage;

/* renamed from: f92  reason: default package */
public final class f92 implements fjf<e92> {
    private final wlf<kd0> a;

    public f92(wlf<kd0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e92(this.a.get());
    }
}
