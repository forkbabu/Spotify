package defpackage;

/* renamed from: u4e  reason: default package */
public final class u4e implements fjf<r4e> {
    private final wlf<s4e> a;

    public u4e(wlf<s4e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s4e s4e = this.a.get();
        if (s4e != null) {
            return s4e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
