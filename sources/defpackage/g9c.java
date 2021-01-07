package defpackage;

import com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties;

/* renamed from: g9c  reason: default package */
public final class g9c implements fjf<String> {
    private final wlf<AndroidLibsOfflineTrialsProperties> a;

    public g9c(wlf<AndroidLibsOfflineTrialsProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsOfflineTrialsProperties androidLibsOfflineTrialsProperties = this.a.get();
        if (androidLibsOfflineTrialsProperties.b()) {
            return "spotify:playlist:37i9dQZF1EGBu7ogb9Vplt";
        }
        if (androidLibsOfflineTrialsProperties.c()) {
            return "spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne";
        }
        return null;
    }
}
