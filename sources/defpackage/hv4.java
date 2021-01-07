package defpackage;

/* renamed from: hv4  reason: default package */
public final class hv4 implements fjf<Boolean> {
    private final wlf<uda> a;

    public hv4(wlf<uda> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Boolean valueOf = Boolean.valueOf(this.a.get().b(false));
        yif.g(valueOf, "Cannot return null from a non-@Nullable @Provides method");
        return valueOf;
    }
}
