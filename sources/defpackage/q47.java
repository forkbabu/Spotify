package defpackage;

/* renamed from: q47  reason: default package */
public final class q47 implements fjf<p47> {
    private final wlf<String> a;

    public q47(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p47(this.a.get());
    }
}
