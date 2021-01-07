package defpackage;

import com.spotify.remoteconfig.w9;

/* renamed from: fn6  reason: default package */
public final class fn6 implements fjf<en6> {
    private final wlf<w9> a;

    public fn6(wlf<w9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new en6(this.a.get());
    }
}
