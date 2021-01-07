package com.spotify.encore.consumer.components.playlist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.playlist.api.playlistheader.PlaylistHeader;
import com.spotify.encore.consumer.components.playlist.impl.playlistheader.DefaultPlaylistHeader;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerPlaylistHeaderExtensions$playlistHeaderFactory$1 implements ComponentFactory<Component<PlaylistHeader.Model, PlaylistHeader.Events>, PlaylistHeader.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headers $this_playlistHeaderFactory;

    EncoreConsumerPlaylistHeaderExtensions$playlistHeaderFactory$1(EncoreConsumerEntryPoint.Headers headers) {
        this.$this_playlistHeaderFactory = headers;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PlaylistHeader.Model, PlaylistHeader.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultPlaylistHeader make(PlaylistHeader.Configuration configuration) {
        return new DefaultPlaylistHeader(this.$this_playlistHeaderFactory.getActivity(), this.$this_playlistHeaderFactory.getPicasso());
    }
}
