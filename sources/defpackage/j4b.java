package defpackage;

/* renamed from: j4b  reason: default package */
public final class j4b implements fjf<i4b> {
    private final wlf<Integer> a;

    public j4b(wlf<Integer> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i4b(this.a.get().intValue());
    }
}
