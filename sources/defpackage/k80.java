package defpackage;

/* renamed from: k80  reason: default package */
public final class k80 implements fjf<j80> {
    private final wlf<l80> a;

    public k80(wlf<l80> wlf) {
        this.a = wlf;
    }

    public static j80 a(Object obj) {
        return new j80((l80) obj);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
