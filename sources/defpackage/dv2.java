package defpackage;

import com.spotify.music.z0;

/* renamed from: dv2  reason: default package */
public final class dv2 implements fjf<z0> {
    private final wlf<String> a;

    public dv2(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z0(this.a.get());
    }
}
