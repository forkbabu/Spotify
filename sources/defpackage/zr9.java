package defpackage;

/* renamed from: zr9  reason: default package */
public final class zr9 implements fjf<yr9> {
    private final wlf<ws9> a;

    public zr9(wlf<ws9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yr9(this.a.get());
    }
}
