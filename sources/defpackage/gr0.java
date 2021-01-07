package defpackage;

import com.spotify.remoteconfig.gj;

/* renamed from: gr0  reason: default package */
class gr0 implements fr0 {
    private final gj a;

    public gr0(gj gjVar) {
        this.a = gjVar;
    }

    @Override // defpackage.fr0
    public boolean isEnabled() {
        return this.a.b();
    }
}
