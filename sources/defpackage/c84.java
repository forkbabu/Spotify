package defpackage;

/* renamed from: c84  reason: default package */
public final class c84 implements fjf<b84> {
    private final wlf<g84> a;

    public c84(wlf<g84> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b84(this.a.get());
    }
}
