package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class DefaultEpisodeRowContinueListening_Factory implements fjf<DefaultEpisodeRowContinueListening> {
    private final wlf<Context> contextProvider;
    private final wlf<Picasso> picassoProvider;

    public DefaultEpisodeRowContinueListening_Factory(wlf<Context> wlf, wlf<Picasso> wlf2) {
        this.contextProvider = wlf;
        this.picassoProvider = wlf2;
    }

    public static DefaultEpisodeRowContinueListening_Factory create(wlf<Context> wlf, wlf<Picasso> wlf2) {
        return new DefaultEpisodeRowContinueListening_Factory(wlf, wlf2);
    }

    public static DefaultEpisodeRowContinueListening newInstance(Context context, Picasso picasso) {
        return new DefaultEpisodeRowContinueListening(context, picasso);
    }

    @Override // defpackage.wlf
    public DefaultEpisodeRowContinueListening get() {
        return newInstance(this.contextProvider.get(), this.picassoProvider.get());
    }
}
