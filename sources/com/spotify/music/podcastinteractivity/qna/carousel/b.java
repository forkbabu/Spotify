package com.spotify.music.podcastinteractivity.qna.carousel;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage;

public final class b implements fjf<a> {
    private final wlf<ComponentFactory<Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events>, ReplyCardEpisodePage.Configuration>> a;
    private final wlf<fvc> b;

    public b(wlf<ComponentFactory<Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events>, ReplyCardEpisodePage.Configuration>> wlf, wlf<fvc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
