package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.app.Activity;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements.LottieDownloadStateMachine;
import com.spotify.encore.consumer.elements.downloadbutton.DrawableHandler;
import com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine;
import kotlin.jvm.internal.h;

public final class PodcastComponentBindingsModule {
    public static final PodcastComponentBindingsModule INSTANCE = new PodcastComponentBindingsModule();

    private PodcastComponentBindingsModule() {
    }

    public final ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> provideEpisodeRowFactory(ajf<EpisodeRowFactory> ajf) {
        h.e(ajf, "episodeRowFactoryLazy");
        EpisodeRowFactory episodeRowFactory = ajf.get();
        h.d(episodeRowFactory, "episodeRowFactoryLazy.get()");
        return episodeRowFactory;
    }

    public final LottieIconStateMachine provideLottieIconStateMachine(Activity activity) {
        h.e(activity, "activity");
        return new LottieDownloadStateMachine(new DrawableHandler(activity));
    }
}
