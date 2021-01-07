package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastcard.PodcastCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerPodcastCardLibraryExtensions {
    public static final ComponentFactory<Component<PodcastCardLibrary.Model, PodcastCardLibrary.Events>, PodcastCardLibrary.Configuration> podcastCardLibraryFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$podcastCardLibraryFactory");
        return new EncoreConsumerPodcastCardLibraryExtensions$podcastCardLibraryFactory$1(cards);
    }
}
