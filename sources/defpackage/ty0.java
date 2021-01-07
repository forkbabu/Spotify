package defpackage;

import com.spotify.libs.pse.model.e;

/* renamed from: ty0  reason: default package */
public final class ty0 implements fjf<Boolean> {
    private final wlf<e> a;

    public ty0(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().k());
    }
}
