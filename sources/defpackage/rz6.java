package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties;

/* renamed from: rz6  reason: default package */
public final class rz6 implements fjf<qz6> {
    private final wlf<AndroidLibsPlaylistEntityModesVanillaProperties> a;

    public rz6(wlf<AndroidLibsPlaylistEntityModesVanillaProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qz6(this.a.get());
    }
}
