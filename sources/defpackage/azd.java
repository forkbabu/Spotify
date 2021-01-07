package defpackage;

import java.util.Set;

/* renamed from: azd  reason: default package */
public final class azd implements fjf<yyd> {
    private final wlf<Set<zyd>> a;

    public azd(wlf<Set<zyd>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yyd(this.a.get());
    }
}
