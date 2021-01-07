package com.spotify.encore.consumer.components.home.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.likedsongscard.LikedSongsCardHome;
import com.spotify.encore.consumer.components.home.impl.likedsongscard.DefaultLikedSongsCardHome;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerLikedSongsCardHomeExtensions$likedSongsCardHomeFactory$1 implements ComponentFactory<Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events>, LikedSongsCardHome.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_likedSongsCardHomeFactory;

    EncoreConsumerLikedSongsCardHomeExtensions$likedSongsCardHomeFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_likedSongsCardHomeFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultLikedSongsCardHome make(LikedSongsCardHome.Configuration configuration) {
        return new DefaultLikedSongsCardHome(this.$this_likedSongsCardHomeFactory.getActivity());
    }
}
