package defpackage;

/* renamed from: z88  reason: default package */
public final class z88 implements fjf<Boolean> {
    private final wlf<td8> a;

    public z88(wlf<td8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().c());
    }
}
