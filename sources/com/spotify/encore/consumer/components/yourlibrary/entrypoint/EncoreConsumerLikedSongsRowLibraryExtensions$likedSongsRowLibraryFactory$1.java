package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongsrow.LikedSongsRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.likedsongsrow.DefaultLikedSongsRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerLikedSongsRowLibraryExtensions$likedSongsRowLibraryFactory$1 implements ComponentFactory<Component<LikedSongsRowLibrary.Model, LikedSongsRowLibrary.Events>, LikedSongsRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_likedSongsRowLibraryFactory;

    EncoreConsumerLikedSongsRowLibraryExtensions$likedSongsRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_likedSongsRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<LikedSongsRowLibrary.Model, LikedSongsRowLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultLikedSongsRowLibrary make(LikedSongsRowLibrary.Configuration configuration) {
        return new DefaultLikedSongsRowLibrary(this.$this_likedSongsRowLibraryFactory.getActivity(), this.$this_likedSongsRowLibraryFactory.getPicasso());
    }
}
