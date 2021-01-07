package defpackage;

import com.spotify.libs.pse.model.e;

/* renamed from: uy0  reason: default package */
public final class uy0 implements fjf<Boolean> {
    private final wlf<e> a;

    public uy0(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().e());
    }
}
