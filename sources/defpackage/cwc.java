package defpackage;

import com.spotify.music.podcastinteractivity.presenter.PodcastPollPresenter;

/* renamed from: cwc  reason: default package */
public final class cwc implements fjf<bwc> {
    private final wlf<PodcastPollPresenter> a;
    private final wlf<vvc> b;
    private final wlf<qtc> c;
    private final wlf<otc> d;

    public cwc(wlf<PodcastPollPresenter> wlf, wlf<vvc> wlf2, wlf<qtc> wlf3, wlf<otc> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bwc(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
