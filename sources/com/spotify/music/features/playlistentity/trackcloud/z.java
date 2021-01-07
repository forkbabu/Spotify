package com.spotify.music.features.playlistentity.trackcloud;

import com.spotify.music.features.playlistallsongs.f;
import defpackage.ao6;
import io.reactivex.y;
import java.util.Random;

public final class z implements fjf<y> {
    private final wlf<f> a;
    private final wlf<s> b;
    private final wlf<String> c;
    private final wlf<TrackCloudShuffling> d;
    private final wlf<ao6.a> e;
    private final wlf<Random> f;
    private final wlf<y> g;

    public z(wlf<f> wlf, wlf<s> wlf2, wlf<String> wlf3, wlf<TrackCloudShuffling> wlf4, wlf<ao6.a> wlf5, wlf<Random> wlf6, wlf<y> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
