package defpackage;

/* renamed from: v88  reason: default package */
public final class v88 implements fjf<Boolean> {
    private final wlf<td8> a;

    public v88(wlf<td8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().b());
    }
}
