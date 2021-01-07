package defpackage;

/* renamed from: h42  reason: default package */
public final class h42 implements fjf<g42> {
    private final wlf<d8a> a;

    public h42(wlf<d8a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g42(this.a.get());
    }
}
