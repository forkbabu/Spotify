package defpackage;

import org.threeten.bp.Clock;

/* renamed from: wvc  reason: default package */
public final class wvc implements fjf<vvc> {
    private final wlf<Clock> a;

    public wvc(wlf<Clock> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vvc(this.a.get());
    }
}
