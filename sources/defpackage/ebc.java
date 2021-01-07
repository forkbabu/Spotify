package defpackage;

import com.spotify.remoteconfig.MusicLibsPageloaderForMusicProperties;

/* renamed from: ebc  reason: default package */
public final class ebc implements fjf<dbc> {
    private final wlf<zac> a;
    private final wlf<MusicLibsPageloaderForMusicProperties> b;

    public ebc(wlf<zac> wlf, wlf<MusicLibsPageloaderForMusicProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dbc(this.a.get(), this.b.get());
    }
}
