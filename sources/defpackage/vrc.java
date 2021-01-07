package defpackage;

/* renamed from: vrc  reason: default package */
public final class vrc implements fjf<urc> {
    private final wlf<trc> a;

    public vrc(wlf<trc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new urc(this.a.get());
    }
}
