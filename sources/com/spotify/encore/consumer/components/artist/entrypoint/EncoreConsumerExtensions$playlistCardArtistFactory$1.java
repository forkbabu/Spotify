package com.spotify.encore.consumer.components.artist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtistConfiguration;
import com.spotify.encore.consumer.components.artist.impl.playlistcard.DefaultPlaylistCardArtist;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerExtensions$playlistCardArtistFactory$1 implements ComponentFactory<Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events>, PlaylistCardArtistConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_playlistCardArtistFactory;

    EncoreConsumerExtensions$playlistCardArtistFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_playlistCardArtistFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultPlaylistCardArtist make(PlaylistCardArtistConfiguration playlistCardArtistConfiguration) {
        return new DefaultPlaylistCardArtist(this.$this_playlistCardArtistFactory.getActivity(), this.$this_playlistCardArtistFactory.getPicasso());
    }
}
