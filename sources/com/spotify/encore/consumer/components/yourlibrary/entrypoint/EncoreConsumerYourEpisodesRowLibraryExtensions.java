package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.yourepisodesrow.YourEpisodesRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerYourEpisodesRowLibraryExtensions {
    public static final ComponentFactory<Component<YourEpisodesRowLibrary.Model, YourEpisodesRowLibrary.Events>, YourEpisodesRowLibrary.Configuration> yourEpisodesRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$yourEpisodesRowLibraryFactory");
        return new EncoreConsumerYourEpisodesRowLibraryExtensions$yourEpisodesRowLibraryFactory$1(rows);
    }
}
