package com.spotify.music.features.entityselector.common;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class b {
    private final a<List<ty4>> a;
    private final List<ty4> b = new ArrayList();

    public b() {
        a<List<ty4>> h1 = a.h1();
        h.d(h1, "BehaviorSubject.create<List<SpotifyEntity>>()");
        this.a = h1;
    }

    public final void a(sy4 sy4) {
        h.e(sy4, "podcastEpisode");
        this.b.add(sy4);
        this.a.onNext(d.Q(this.b));
    }

    public final void b(uy4 uy4) {
        h.e(uy4, AppProtocol.TrackData.TYPE_TRACK);
        this.b.add(uy4);
        this.a.onNext(d.Q(this.b));
    }

    public final List<ty4> c() {
        return d.Q(this.b);
    }

    public final s<List<ty4>> d() {
        return this.a;
    }
}
