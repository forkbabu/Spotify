package defpackage;

/* renamed from: r69  reason: default package */
public final class r69 implements fjf<s9a> {
    private final wlf<p8a> a;

    public r69(wlf<p8a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s9a(this.a.get(), "@");
    }
}
