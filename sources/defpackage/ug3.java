package defpackage;

/* renamed from: ug3  reason: default package */
public final class ug3 implements fjf<tg3> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;
    private final wlf<ere> c;

    public ug3(wlf<jz1> wlf, wlf<cqe> wlf2, wlf<ere> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static tg3 a(wlf<jz1> wlf, wlf<cqe> wlf2, wlf<ere> wlf3) {
        return new tg3(wlf, wlf2, wlf3);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tg3(this.a, this.b, this.c);
    }
}
