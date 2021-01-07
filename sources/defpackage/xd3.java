package defpackage;

/* renamed from: xd3  reason: default package */
public final class xd3 implements fjf<wd3> {
    private final wlf<a71> a;
    private final wlf<a71> b;

    public xd3(wlf<a71> wlf, wlf<a71> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wd3(this.a.get(), this.b.get());
    }
}
