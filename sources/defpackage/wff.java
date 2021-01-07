package defpackage;

/* renamed from: wff  reason: default package */
public final class wff implements fjf<vff> {
    private final wlf<ere> a;

    public wff(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vff(this.a.get());
    }
}
