package com.spotify.encore.consumer.components.podcast.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.DaggerPodcastEncoreConsumerComponent;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerEpisodeRowExtensions {
    public static final ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> episodeRowFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$episodeRowFactory");
        return DaggerPodcastEncoreConsumerComponent.factory().create(rows.getActivity(), rows.getPicasso()).episodeRowFactory();
    }
}
