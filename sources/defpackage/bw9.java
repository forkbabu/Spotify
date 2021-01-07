package defpackage;

/* renamed from: bw9  reason: default package */
public final class bw9 implements fjf<aw9> {
    private final wlf<jz1> a;

    public bw9(wlf<jz1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aw9(this.a.get());
    }
}
