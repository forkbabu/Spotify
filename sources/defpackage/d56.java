package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: d56  reason: default package */
public final class d56 implements fjf<c56> {
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> a;

    public d56(wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c56(this.a);
    }
}
