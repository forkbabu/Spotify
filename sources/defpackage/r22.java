package defpackage;

/* renamed from: r22  reason: default package */
public final class r22 implements fjf<q22> {
    private final wlf<w7a> a;

    public r22(wlf<w7a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q22(this.a.get());
    }
}
