package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistrow.PlaylistRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.playlistrow.DefaultPlaylistRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerPlaylistRowLibraryExtensions$playlistRowLibraryFactory$1 implements ComponentFactory<Component<PlaylistRowLibrary.Model, PlaylistRowLibrary.Events>, PlaylistRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_playlistRowLibraryFactory;

    EncoreConsumerPlaylistRowLibraryExtensions$playlistRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_playlistRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PlaylistRowLibrary.Model, PlaylistRowLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultPlaylistRowLibrary make(PlaylistRowLibrary.Configuration configuration) {
        return new DefaultPlaylistRowLibrary(this.$this_playlistRowLibraryFactory.getActivity(), this.$this_playlistRowLibraryFactory.getPicasso());
    }
}
