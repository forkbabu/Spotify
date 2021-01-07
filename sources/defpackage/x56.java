package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: x56  reason: default package */
public final class x56 implements fjf<w56> {
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> a;

    public x56(wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w56(this.a);
    }
}
