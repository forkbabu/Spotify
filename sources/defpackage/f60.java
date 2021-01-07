package defpackage;

/* renamed from: f60  reason: default package */
public final class f60 implements fjf<e60> {
    private final wlf<g60> a;

    public f60(wlf<g60> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e60(this.a.get());
    }
}
