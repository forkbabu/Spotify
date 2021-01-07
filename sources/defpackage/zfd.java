package defpackage;

/* renamed from: zfd  reason: default package */
public final class zfd implements fjf<yfd> {
    private final wlf<tfd> a;
    private final wlf<ufd> b;
    private final wlf<rfd> c;

    public zfd(wlf<tfd> wlf, wlf<ufd> wlf2, wlf<rfd> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yfd(this.a.get(), this.b.get(), this.c.get());
    }
}
