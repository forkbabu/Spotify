package defpackage;

/* renamed from: gab  reason: default package */
public final class gab implements fjf<fab> {
    private final wlf<l0e> a;

    public gab(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        fab fab = (fab) this.a.get().a(v9b.a);
        yif.g(fab, "Cannot return null from a non-@Nullable @Provides method");
        return fab;
    }
}
