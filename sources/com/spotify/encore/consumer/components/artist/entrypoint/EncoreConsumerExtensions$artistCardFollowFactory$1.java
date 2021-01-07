package com.spotify.encore.consumer.components.artist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.encore.consumer.components.artist.impl.artistcardfollow.DefaultArtistCardFollow;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerExtensions$artistCardFollowFactory$1 implements ComponentFactory<Component<ArtistCardFollow.Model, ArtistCardFollow.Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_artistCardFollowFactory;

    EncoreConsumerExtensions$artistCardFollowFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_artistCardFollowFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistCardFollow.Model, ArtistCardFollow.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.artist.impl.artistcardfollow.DefaultArtistCardFollow' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<ArtistCardFollow.Model, ArtistCardFollow.Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultArtistCardFollow(this.$this_artistCardFollowFactory.getActivity(), this.$this_artistCardFollowFactory.getPicasso());
    }
}
