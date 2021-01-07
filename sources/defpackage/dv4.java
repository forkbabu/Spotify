package defpackage;

/* renamed from: dv4  reason: default package */
public final class dv4 implements fjf<cv4> {
    private final wlf<uda> a;

    public dv4(wlf<uda> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cv4(this.a.get());
    }
}
