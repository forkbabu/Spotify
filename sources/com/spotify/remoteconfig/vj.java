package com.spotify.remoteconfig;

public final class vj implements fjf<MusicLibsPageloaderForMusicProperties> {
    private final wlf<l0e> a;

    public vj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static MusicLibsPageloaderForMusicProperties a(l0e l0e) {
        MusicLibsPageloaderForMusicProperties musicLibsPageloaderForMusicProperties = (MusicLibsPageloaderForMusicProperties) l0e.a(v0.a);
        yif.g(musicLibsPageloaderForMusicProperties, "Cannot return null from a non-@Nullable @Provides method");
        return musicLibsPageloaderForMusicProperties;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
