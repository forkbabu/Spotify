package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastrow.PodcastRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerPodcastRowLibraryExtensions {
    public static final ComponentFactory<Component<PodcastRowLibrary.Model, PodcastRowLibrary.Events>, PodcastRowLibrary.Configuration> podcastRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$podcastRowLibraryFactory");
        return new EncoreConsumerPodcastRowLibraryExtensions$podcastRowLibraryFactory$1(rows);
    }
}
