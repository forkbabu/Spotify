package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: u56  reason: default package */
public final class u56 implements fjf<t56> {
    private final wlf<m56> a;
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> b;

    public u56(wlf<m56> wlf, wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t56(this.a, this.b);
    }
}
