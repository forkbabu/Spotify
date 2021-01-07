package defpackage;

import org.threeten.bp.Clock;

/* renamed from: qvc  reason: default package */
public final class qvc implements fjf<pvc> {
    private final wlf<Clock> a;

    public qvc(wlf<Clock> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pvc(this.a.get());
    }
}
