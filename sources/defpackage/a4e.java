package defpackage;

/* renamed from: a4e  reason: default package */
public final class a4e implements fjf<x3e> {
    private final wlf<l4e> a;

    public a4e(wlf<l4e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        l4e l4e = this.a.get();
        if (l4e != null) {
            return l4e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
