package defpackage;

import com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties;

/* renamed from: s8c  reason: default package */
public final class s8c implements fjf<r8c> {
    private final wlf<AndroidLibsOfflineTrialsProperties> a;

    public s8c(wlf<AndroidLibsOfflineTrialsProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r8c(this.a.get());
    }
}
