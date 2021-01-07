package defpackage;

/* renamed from: o80  reason: default package */
public final class o80 implements fjf<n80> {
    private final wlf<j80> a;

    public o80(wlf<j80> wlf) {
        this.a = wlf;
    }

    public static n80 a(Object obj) {
        return new n80((j80) obj);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
