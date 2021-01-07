package defpackage;

/* renamed from: qc1  reason: default package */
public final class qc1 implements fjf<pc1> {
    private final wlf<jz1> a;

    public qc1(wlf<jz1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pc1(this.a.get());
    }
}
