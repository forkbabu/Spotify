package com.spotify.encore.consumer.components.playlist.impl;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylistConfiguration;
import com.spotify.encore.consumer.components.playlist.impl.participantrow.ParticipantRowPlaylistFactory;

public final class EncoreConsumerPlaylistComponentBindingsModule_ProvideParticipantRowPlaylistFactoryFactory implements fjf<ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration>> {
    private final wlf<ParticipantRowPlaylistFactory> participantRowPlaylistFactoryLazyProvider;

    public EncoreConsumerPlaylistComponentBindingsModule_ProvideParticipantRowPlaylistFactoryFactory(wlf<ParticipantRowPlaylistFactory> wlf) {
        this.participantRowPlaylistFactoryLazyProvider = wlf;
    }

    public static EncoreConsumerPlaylistComponentBindingsModule_ProvideParticipantRowPlaylistFactoryFactory create(wlf<ParticipantRowPlaylistFactory> wlf) {
        return new EncoreConsumerPlaylistComponentBindingsModule_ProvideParticipantRowPlaylistFactoryFactory(wlf);
    }

    public static ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration> provideParticipantRowPlaylistFactory(ajf<ParticipantRowPlaylistFactory> ajf) {
        ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration> provideParticipantRowPlaylistFactory = EncoreConsumerPlaylistComponentBindingsModule.INSTANCE.provideParticipantRowPlaylistFactory(ajf);
        yif.g(provideParticipantRowPlaylistFactory, "Cannot return null from a non-@Nullable @Provides method");
        return provideParticipantRowPlaylistFactory;
    }

    @Override // defpackage.wlf
    public ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration> get() {
        return provideParticipantRowPlaylistFactory(ejf.a(this.participantRowPlaylistFactoryLazyProvider));
    }
}
