package com.spotify.music.features.album.encore;

import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class l implements fjf<TrackRowAlbumComponentBinder> {
    private final wlf<EncoreConsumerEntryPoint> a;
    private final wlf<vd3> b;
    private final wlf<m> c;
    private final wlf<gxc> d;

    public l(wlf<EncoreConsumerEntryPoint> wlf, wlf<vd3> wlf2, wlf<m> wlf3, wlf<gxc> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TrackRowAlbumComponentBinder(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
