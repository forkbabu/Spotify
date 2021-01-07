package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.searchintentcard.SearchIntentCard;
import com.spotify.encore.consumer.components.impl.searchintentcard.DefaultSearchIntentCard;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerExtensions$searchIntentCardFactory$1 implements ComponentFactory<Component<SearchIntentCard.Model, SearchIntentCard.Events>, SearchIntentCard.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_searchIntentCardFactory;

    EncoreConsumerExtensions$searchIntentCardFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_searchIntentCardFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<SearchIntentCard.Model, SearchIntentCard.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public Component<SearchIntentCard.Model, SearchIntentCard.Events> make(SearchIntentCard.Configuration configuration) {
        return new DefaultSearchIntentCard(this.$this_searchIntentCardFactory.getActivity(), this.$this_searchIntentCardFactory.getPicasso());
    }
}
