package defpackage;

import com.spotify.libs.pse.model.a;
import com.spotify.libs.pse.model.e;

/* renamed from: sy0  reason: default package */
public final class sy0 implements fjf<a> {
    private final wlf<e> a;

    public sy0(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a();
    }
}
