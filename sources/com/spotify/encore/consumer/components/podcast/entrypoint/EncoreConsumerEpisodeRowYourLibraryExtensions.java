package com.spotify.encore.consumer.components.podcast.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowYourLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerEpisodeRowYourLibraryExtensions {
    public static final ComponentFactory<Component<EpisodeRowYourLibrary.Model, EpisodeRowYourLibrary.Events>, EpisodeRowYourLibrary.Configuration> episodeRowYourLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$episodeRowYourLibraryFactory");
        return new EncoreConsumerEpisodeRowYourLibraryExtensions$episodeRowYourLibraryFactory$1(rows);
    }
}
