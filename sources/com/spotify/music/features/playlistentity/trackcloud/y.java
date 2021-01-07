package com.spotify.music.features.playlistentity.trackcloud;

import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistallsongs.f;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.music.features.playlistentity.trackcloud.w;
import defpackage.ao6;
import java.util.Random;

final class y implements w.a {
    private final wlf<f> a;
    private final wlf<s> b;
    private final wlf<String> c;
    private final wlf<TrackCloudShuffling> d;
    private final wlf<ao6.a> e;
    private final wlf<Random> f;
    private final wlf<io.reactivex.y> g;

    y(wlf<f> wlf, wlf<s> wlf2, wlf<String> wlf3, wlf<TrackCloudShuffling> wlf4, wlf<ao6.a> wlf5, wlf<Random> wlf6, wlf<io.reactivex.y> wlf7) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
        b(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.features.playlistentity.trackcloud.w.a
    public w a(i iVar, c cVar) {
        f fVar = this.a.get();
        b(fVar, 1);
        f fVar2 = fVar;
        s sVar = this.b.get();
        b(sVar, 2);
        s sVar2 = sVar;
        String str = this.c.get();
        b(str, 3);
        String str2 = str;
        TrackCloudShuffling trackCloudShuffling = this.d.get();
        b(trackCloudShuffling, 4);
        TrackCloudShuffling trackCloudShuffling2 = trackCloudShuffling;
        ao6.a aVar = this.e.get();
        b(aVar, 5);
        ao6.a aVar2 = aVar;
        Random random = this.f.get();
        b(random, 6);
        Random random2 = random;
        io.reactivex.y yVar = this.g.get();
        b(yVar, 7);
        b(iVar, 8);
        b(cVar, 9);
        return new x(fVar2, sVar2, str2, trackCloudShuffling2, aVar2, random2, yVar, iVar, cVar);
    }
}
