package defpackage;

import com.spotify.libs.connect.r;

/* renamed from: aq4  reason: default package */
public final class aq4 implements fjf<zp4> {
    private final wlf<r> a;

    public aq4(wlf<r> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zp4(this.a.get());
    }
}
