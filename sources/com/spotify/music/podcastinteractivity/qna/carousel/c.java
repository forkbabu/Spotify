package com.spotify.music.podcastinteractivity.qna.carousel;

import androidx.fragment.app.o;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import com.spotify.glue.dialogs.g;
import com.spotify.music.podcastinteractivity.qna.presenter.PodcastQnAPresenter;

public final class c implements fjf<PodcastQnACarouselImpl> {
    private final wlf<o> a;
    private final wlf<PodcastQnAPresenter> b;
    private final wlf<ComponentFactory<Component<ReplyRowQnA.Model, ReplyRowQnA.Events>, ReplyRowQnA.Configuration>> c;
    private final wlf<a> d;
    private final wlf<g> e;
    private final wlf<tvc> f;
    private final wlf<rvc> g;

    public c(wlf<o> wlf, wlf<PodcastQnAPresenter> wlf2, wlf<ComponentFactory<Component<ReplyRowQnA.Model, ReplyRowQnA.Events>, ReplyRowQnA.Configuration>> wlf3, wlf<a> wlf4, wlf<g> wlf5, wlf<tvc> wlf6, wlf<rvc> wlf7) {
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
        return new PodcastQnACarouselImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
