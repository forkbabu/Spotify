package defpackage;

/* renamed from: j98  reason: default package */
public final class j98 implements fjf<dd8> {
    private final wlf<xc8> a;

    public j98(wlf<xc8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        xc8 xc8 = this.a.get();
        if (xc8 != null) {
            return xc8;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
