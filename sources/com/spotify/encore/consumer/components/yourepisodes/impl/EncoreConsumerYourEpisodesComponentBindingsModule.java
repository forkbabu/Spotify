package com.spotify.encore.consumer.components.yourepisodes.impl;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader.YourEpisodesHeaderFactory;
import kotlin.jvm.internal.h;

public final class EncoreConsumerYourEpisodesComponentBindingsModule {
    public final ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration> providesYourEpisodesHeaderFactory(ajf<YourEpisodesHeaderFactory> ajf) {
        h.e(ajf, "yourEpisodesHeaderFactory");
        YourEpisodesHeaderFactory yourEpisodesHeaderFactory = ajf.get();
        h.d(yourEpisodesHeaderFactory, "yourEpisodesHeaderFactory.get()");
        return yourEpisodesHeaderFactory;
    }
}
