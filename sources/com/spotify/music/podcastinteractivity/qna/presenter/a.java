package com.spotify.music.podcastinteractivity.qna.presenter;

import androidx.lifecycle.n;
import com.spotify.music.podcastinteractivity.qna.datasource.b;
import com.spotify.music.podcastinteractivity.qna.datasource.j;
import io.reactivex.y;

public final class a implements fjf<PodcastQnAPresenter> {
    private final wlf<y> a;
    private final wlf<b> b;
    private final wlf<hvc> c;
    private final wlf<j> d;
    private final wlf<n> e;

    public a(wlf<y> wlf, wlf<b> wlf2, wlf<hvc> wlf3, wlf<j> wlf4, wlf<n> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastQnAPresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
