package defpackage;

import android.media.AudioManager;

/* renamed from: bfa  reason: default package */
public final class bfa implements fjf<afa> {
    private final wlf<AudioManager> a;

    public bfa(wlf<AudioManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new afa(ejf.a(this.a));
    }
}
