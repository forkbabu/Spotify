package defpackage;

/* renamed from: hb4  reason: default package */
public final class hb4 implements fjf<o84> {
    private final wlf<Boolean> a;

    public hb4(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        if (this.a.get().booleanValue()) {
            return new n84();
        }
        return new l84();
    }
}
