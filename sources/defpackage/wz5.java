package defpackage;

/* renamed from: wz5  reason: default package */
public final class wz5 implements fjf<vz5> {
    private final wlf<wx5> a;

    public wz5(wlf<wx5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vz5(this.a.get());
    }
}
