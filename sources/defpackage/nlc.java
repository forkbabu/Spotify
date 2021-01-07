package defpackage;

/* renamed from: nlc  reason: default package */
public final class nlc implements fjf<mlc> {
    private final wlf<rlc> a;
    private final wlf<olc> b;

    public nlc(wlf<rlc> wlf, wlf<olc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mlc(this.a, this.b);
    }
}
