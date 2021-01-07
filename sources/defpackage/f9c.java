package defpackage;

import com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties;
import io.reactivex.s;

/* renamed from: f9c  reason: default package */
public final class f9c implements fjf<s<Boolean>> {
    private final wlf<AndroidLibsOfflineTrialsProperties> a;

    public f9c(wlf<AndroidLibsOfflineTrialsProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsOfflineTrialsProperties androidLibsOfflineTrialsProperties = this.a.get();
        return s.i0(Boolean.valueOf(androidLibsOfflineTrialsProperties.b() || androidLibsOfflineTrialsProperties.c()));
    }
}
