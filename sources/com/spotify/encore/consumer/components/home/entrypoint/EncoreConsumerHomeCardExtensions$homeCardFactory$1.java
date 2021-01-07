package com.spotify.encore.consumer.components.home.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.homecard.HomeCard;
import com.spotify.encore.consumer.components.home.impl.homecard.DefaultHomeCard;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerHomeCardExtensions$homeCardFactory$1 implements ComponentFactory<Component<HomeCard.Model, HomeCard.Events>, HomeCard.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_homeCardFactory;

    EncoreConsumerHomeCardExtensions$homeCardFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_homeCardFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<HomeCard.Model, HomeCard.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultHomeCard make(HomeCard.Configuration configuration) {
        return new DefaultHomeCard(this.$this_homeCardFactory.getActivity(), this.$this_homeCardFactory.getPicasso());
    }
}
