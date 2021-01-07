package defpackage;

import com.spotify.mobile.android.quotesharing.i;
import com.spotify.music.features.podcast.entity.presentation.FilteringPresenter;
import com.spotify.music.features.podcast.entity.presentation.d;
import com.spotify.music.features.podcast.entity.presentation.l;
import com.spotify.music.features.podcast.entity.presentation.s;
import com.spotify.music.features.podcast.entity.presentation.u;
import com.spotify.music.features.podcast.entity.presentation.y;
import com.spotify.music.features.podcast.entity.trailer.PodcastTrailerPresenter;

/* renamed from: j57  reason: default package */
public final class j57 implements fjf<i57> {
    private final wlf<l> a;
    private final wlf<u> b;
    private final wlf<d77> c;
    private final wlf<PodcastTrailerPresenter> d;
    private final wlf<FilteringPresenter> e;
    private final wlf<s> f;
    private final wlf<d> g;
    private final wlf<y> h;
    private final wlf<i> i;

    public j57(wlf<l> wlf, wlf<u> wlf2, wlf<d77> wlf3, wlf<PodcastTrailerPresenter> wlf4, wlf<FilteringPresenter> wlf5, wlf<s> wlf6, wlf<d> wlf7, wlf<y> wlf8, wlf<i> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i57(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
