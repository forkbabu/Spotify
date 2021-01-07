package defpackage;

import com.spotify.ubi.specification.factories.v;

/* renamed from: qc8  reason: default package */
public final class qc8 implements fjf<pc8> {
    private final wlf<v> a;

    public qc8(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pc8(this.a.get());
    }
}
