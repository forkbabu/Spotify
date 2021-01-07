package defpackage;

/* renamed from: a32  reason: default package */
public final class a32 implements fjf<z22> {
    private final wlf<a8a> a;

    public a32(wlf<a8a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z22(this.a.get());
    }
}
