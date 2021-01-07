package defpackage;

import com.spotify.remoteconfig.qa;

/* renamed from: j2e  reason: default package */
public final class j2e implements fjf<i2e> {
    private final wlf<qa> a;

    public j2e(wlf<qa> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i2e(this.a.get());
    }
}
