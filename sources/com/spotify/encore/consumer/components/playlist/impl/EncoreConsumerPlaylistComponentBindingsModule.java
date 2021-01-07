package com.spotify.encore.consumer.components.playlist.impl;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylistConfiguration;
import com.spotify.encore.consumer.components.playlist.impl.participantrow.ParticipantRowPlaylistFactory;
import kotlin.jvm.internal.h;

public final class EncoreConsumerPlaylistComponentBindingsModule {
    public static final EncoreConsumerPlaylistComponentBindingsModule INSTANCE = new EncoreConsumerPlaylistComponentBindingsModule();

    private EncoreConsumerPlaylistComponentBindingsModule() {
    }

    public final ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration> provideParticipantRowPlaylistFactory(ajf<ParticipantRowPlaylistFactory> ajf) {
        h.e(ajf, "participantRowPlaylistFactoryLazy");
        ParticipantRowPlaylistFactory participantRowPlaylistFactory = ajf.get();
        h.d(participantRowPlaylistFactory, "participantRowPlaylistFactoryLazy.get()");
        return participantRowPlaylistFactory;
    }
}
