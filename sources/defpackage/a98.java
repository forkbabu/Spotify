package defpackage;

/* renamed from: a98  reason: default package */
public final class a98 implements fjf<Boolean> {
    private final wlf<wd8> a;

    public a98(wlf<wd8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().c());
    }
}
