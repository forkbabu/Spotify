package defpackage;

/* renamed from: zs9  reason: default package */
public final class zs9 implements fjf<ys9> {
    private final wlf<ws9> a;

    public zs9(wlf<ws9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ys9(this.a.get());
    }
}
