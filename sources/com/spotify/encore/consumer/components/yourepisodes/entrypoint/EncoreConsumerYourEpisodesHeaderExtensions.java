package com.spotify.encore.consumer.components.yourepisodes.entrypoint;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.yourepisodes.DaggerYourEpisodesEncoreConsumerComponent;
import kotlin.jvm.internal.h;

public final class EncoreConsumerYourEpisodesHeaderExtensions {
    public static final ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration> yourEpisodesHeaderFactory(EncoreConsumerEntryPoint.Headers headers) {
        h.e(headers, "$this$yourEpisodesHeaderFactory");
        return DaggerYourEpisodesEncoreConsumerComponent.factory().create(headers.getActivity()).yourEpisodesHeaderFactory();
    }
}
