package defpackage;

/* renamed from: uk3  reason: default package */
public final class uk3 implements fjf<tk3> {
    private final wlf<ml3> a;

    public uk3(wlf<ml3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tk3(this.a.get());
    }
}
