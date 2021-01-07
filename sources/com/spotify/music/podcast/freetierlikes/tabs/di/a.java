package com.spotify.music.podcast.freetierlikes.tabs.di;

import com.spotify.encore.consumer.components.podcast.entrypoint.EncoreConsumerEpisodeRowExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.podcast.entity.adapter.episoderow.EncoreEpisodeRowViewBinder;
import com.spotify.music.podcast.entity.adapter.episoderow.i;

public final class a implements i.a {
    final /* synthetic */ EncoreConsumerEntryPoint a;
    final /* synthetic */ jhc b;

    a(EncoreConsumerEntryPoint encoreConsumerEntryPoint, jhc jhc) {
        this.a = encoreConsumerEntryPoint;
        this.b = jhc;
    }

    @Override // com.spotify.music.podcast.entity.adapter.episoderow.i.a
    public i create() {
        return new EncoreEpisodeRowViewBinder(EncoreConsumerEpisodeRowExtensions.episodeRowFactory(this.a.getRows()), this.b);
    }
}
