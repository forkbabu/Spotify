package defpackage;

/* renamed from: q64  reason: default package */
public final class q64 implements fjf<p64> {
    private final wlf<r64> a;

    public q64(wlf<r64> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p64(this.a.get());
    }
}
