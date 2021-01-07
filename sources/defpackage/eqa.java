package defpackage;

/* renamed from: eqa  reason: default package */
public final class eqa implements fjf<dqa> {
    private final wlf<cqa> a;

    public eqa(wlf<cqa> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dqa(this.a.get());
    }
}
