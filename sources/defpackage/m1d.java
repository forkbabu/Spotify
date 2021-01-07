package defpackage;

/* renamed from: m1d  reason: default package */
public final class m1d implements fjf<l1d> {
    private final wlf<q1d> a;

    public m1d(wlf<q1d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l1d(this.a.get());
    }
}
