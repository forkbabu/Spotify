package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.yourepisodescard.YourEpisodesCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerYourEpisodesCardLibraryExtensions {
    public static final ComponentFactory<Component<YourEpisodesCardLibrary.Model, YourEpisodesCardLibrary.Events>, YourEpisodesCardLibrary.Configuration> yourEpisodesCardLibraryFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$yourEpisodesCardLibraryFactory");
        return new EncoreConsumerYourEpisodesCardLibraryExtensions$yourEpisodesCardLibraryFactory$1(cards);
    }
}
