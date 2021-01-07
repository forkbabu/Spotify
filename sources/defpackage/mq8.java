package defpackage;

/* renamed from: mq8  reason: default package */
public final class mq8 implements fjf<lq8> {
    private final wlf<kq8> a;
    private final wlf<fq8> b;
    private final wlf<Boolean> c;

    public mq8(wlf<kq8> wlf, wlf<fq8> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lq8(this.a.get(), this.b.get(), this.c.get().booleanValue());
    }
}
