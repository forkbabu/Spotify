package defpackage;

/* renamed from: d60  reason: default package */
public final class d60 implements fjf<c60> {
    private final wlf<g60> a;

    public d60(wlf<g60> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c60(this.a.get());
    }
}
