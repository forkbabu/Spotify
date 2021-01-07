package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistcard.PlaylistCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.playlistcard.DefaultPlaylistCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerPlaylistCardLibraryExtensions$playlistCardLibraryFactory$1 implements ComponentFactory<Component<PlaylistCardLibrary.Model, PlaylistCardLibrary.Events>, PlaylistCardLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_playlistCardLibraryFactory;

    EncoreConsumerPlaylistCardLibraryExtensions$playlistCardLibraryFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_playlistCardLibraryFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PlaylistCardLibrary.Model, PlaylistCardLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultPlaylistCardLibrary make(PlaylistCardLibrary.Configuration configuration) {
        return new DefaultPlaylistCardLibrary(this.$this_playlistCardLibraryFactory.getActivity(), this.$this_playlistCardLibraryFactory.getPicasso());
    }
}
