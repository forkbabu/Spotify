package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import kotlin.jvm.internal.h;

public final class EpisodeRowFactory implements ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> {
    private final wlf<DefaultEpisodeRow> defaultEpisodeRow;

    public EpisodeRowFactory(wlf<DefaultEpisodeRow> wlf) {
        h.e(wlf, "defaultEpisodeRow");
        this.defaultEpisodeRow = wlf;
    }

    public EpisodeRow make(EpisodeRow.Configuration configuration) {
        DefaultEpisodeRow defaultEpisodeRow2 = this.defaultEpisodeRow.get();
        h.d(defaultEpisodeRow2, "defaultEpisodeRow.get()");
        return defaultEpisodeRow2;
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<EpisodeRow.Model, EpisodeRow.Events> make() {
        return make((EpisodeRow.Configuration) null);
    }
}
