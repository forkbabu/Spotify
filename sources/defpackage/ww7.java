package defpackage;

import com.spotify.remoteconfig.u6;

/* renamed from: ww7  reason: default package */
public final class ww7 implements fjf<Boolean> {
    private final wlf<u6> a;

    public ww7(wlf<u6> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}
