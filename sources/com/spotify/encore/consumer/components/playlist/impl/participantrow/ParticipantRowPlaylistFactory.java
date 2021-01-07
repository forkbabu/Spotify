package com.spotify.encore.consumer.components.playlist.impl.participantrow;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylistConfiguration;
import com.spotify.player.model.ContextTrack;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class ParticipantRowPlaylistFactory implements ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration> {
    private final wlf<DefaultParticipantRowPlaylist> provider;

    public ParticipantRowPlaylistFactory(wlf<DefaultParticipantRowPlaylist> wlf) {
        h.e(wlf, ContextTrack.Metadata.KEY_PROVIDER);
        this.provider = wlf;
    }

    @Override // com.spotify.encore.ComponentFactory
    public ParticipantRowPlaylist make() {
        return (ParticipantRowPlaylist) ComponentFactory.DefaultImpls.make(this);
    }

    public ParticipantRowPlaylist make(ParticipantRowPlaylistConfiguration participantRowPlaylistConfiguration) {
        if (h.a(participantRowPlaylistConfiguration, ParticipantRowPlaylistConfiguration.DefaultParticipantRowPlaylistConfiguration.INSTANCE)) {
            DefaultParticipantRowPlaylist defaultParticipantRowPlaylist = this.provider.get();
            h.d(defaultParticipantRowPlaylist, "provider.get()");
            return defaultParticipantRowPlaylist;
        } else if (participantRowPlaylistConfiguration == null) {
            DefaultParticipantRowPlaylist defaultParticipantRowPlaylist2 = this.provider.get();
            h.d(defaultParticipantRowPlaylist2, "provider.get()");
            return defaultParticipantRowPlaylist2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
