package defpackage;

import com.spotify.remoteconfig.gj;

/* renamed from: iv0  reason: default package */
class iv0 implements hv0 {
    private final gj a;

    iv0(gj gjVar) {
        this.a = gjVar;
    }

    @Override // defpackage.hv0
    public boolean isEnabled() {
        return this.a.c();
    }
}
