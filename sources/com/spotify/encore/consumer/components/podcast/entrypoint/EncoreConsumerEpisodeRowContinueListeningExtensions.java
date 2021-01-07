package com.spotify.encore.consumer.components.podcast.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.encore.consumer.components.podcast.api.episoderow.continuelistening.EpisodeRowContinueListening;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerEpisodeRowContinueListeningExtensions {
    public static final ComponentFactory<Component<EpisodeRowContinueListening.Model, EpisodeRowContinueListening.Events>, EpisodeRow.Configuration> episodeRowContinueListeningFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$episodeRowContinueListeningFactory");
        return new EncoreConsumerEpisodeRowContinueListeningExtensions$episodeRowContinueListeningFactory$1(rows);
    }
}
