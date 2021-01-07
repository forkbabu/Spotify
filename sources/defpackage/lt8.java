package defpackage;

/* renamed from: lt8  reason: default package */
public final class lt8 implements fjf<kt8> {
    private final wlf<b61> a;
    private final wlf<rt8> b;
    private final wlf<String> c;

    public lt8(wlf<b61> wlf, wlf<rt8> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kt8(this.a.get(), this.b.get(), this.c.get());
    }
}
