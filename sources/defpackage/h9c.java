package defpackage;

import com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties;

/* renamed from: h9c  reason: default package */
public final class h9c implements fjf<Boolean> {
    private final wlf<AndroidLibsOfflineTrialsProperties> a;

    public h9c(wlf<AndroidLibsOfflineTrialsProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().c());
    }
}
