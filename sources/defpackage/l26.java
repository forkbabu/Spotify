package defpackage;

/* renamed from: l26  reason: default package */
public final class l26 implements fjf<k26> {
    private final wlf<f26> a;
    private final wlf<ui6> b;

    public l26(wlf<f26> wlf, wlf<ui6> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k26(this.a, this.b);
    }
}
