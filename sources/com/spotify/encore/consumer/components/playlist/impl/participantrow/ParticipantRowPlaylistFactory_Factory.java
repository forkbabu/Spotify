package com.spotify.encore.consumer.components.playlist.impl.participantrow;

public final class ParticipantRowPlaylistFactory_Factory implements fjf<ParticipantRowPlaylistFactory> {
    private final wlf<DefaultParticipantRowPlaylist> providerProvider;

    public ParticipantRowPlaylistFactory_Factory(wlf<DefaultParticipantRowPlaylist> wlf) {
        this.providerProvider = wlf;
    }

    public static ParticipantRowPlaylistFactory_Factory create(wlf<DefaultParticipantRowPlaylist> wlf) {
        return new ParticipantRowPlaylistFactory_Factory(wlf);
    }

    public static ParticipantRowPlaylistFactory newInstance(wlf<DefaultParticipantRowPlaylist> wlf) {
        return new ParticipantRowPlaylistFactory(wlf);
    }

    @Override // defpackage.wlf
    public ParticipantRowPlaylistFactory get() {
        return newInstance(this.providerProvider);
    }
}
