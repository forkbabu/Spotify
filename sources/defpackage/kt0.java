package defpackage;

/* renamed from: kt0  reason: default package */
public final class kt0 implements fjf<jt0> {
    private final wlf<ht0> a;
    private final wlf<lt0> b;

    public kt0(wlf<ht0> wlf, wlf<lt0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jt0(this.a.get(), this.b.get());
    }
}
