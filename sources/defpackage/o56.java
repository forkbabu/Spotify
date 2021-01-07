package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: o56  reason: default package */
public final class o56 implements fjf<n56> {
    private final wlf<y56> a;
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> b;

    public o56(wlf<y56> wlf, wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n56(this.a.get(), this.b.get());
    }
}
