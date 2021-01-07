package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongscard.LikedSongsCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.likedsongscard.DefaultLikedSongsCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerLikedSongsCardLibraryExtensions$likedSongsCardLibraryFactory$1 implements ComponentFactory<Component<LikedSongsCardLibrary.Model, LikedSongsCardLibrary.Events>, LikedSongsCardLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_likedSongsCardLibraryFactory;

    EncoreConsumerLikedSongsCardLibraryExtensions$likedSongsCardLibraryFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_likedSongsCardLibraryFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<LikedSongsCardLibrary.Model, LikedSongsCardLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultLikedSongsCardLibrary make(LikedSongsCardLibrary.Configuration configuration) {
        return new DefaultLikedSongsCardLibrary(this.$this_likedSongsCardLibraryFactory.getActivity(), this.$this_likedSongsCardLibraryFactory.getPicasso());
    }
}
