package defpackage;

import com.spotify.playlist.formatlisttype.a;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: i56  reason: default package */
public final class i56 implements fjf<h56> {
    private final wlf<a> a;
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> b;

    public i56(wlf<a> wlf, wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h56(this.a.get(), this.b.get());
    }
}
