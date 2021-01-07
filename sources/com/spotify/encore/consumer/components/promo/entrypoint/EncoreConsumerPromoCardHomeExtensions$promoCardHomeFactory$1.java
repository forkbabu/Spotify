package com.spotify.encore.consumer.components.promo.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;
import com.spotify.encore.consumer.components.promo.impl.promocard.DefaultPromoCardHome;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerPromoCardHomeExtensions$promoCardHomeFactory$1 implements ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_promoCardHomeFactory;

    EncoreConsumerPromoCardHomeExtensions$promoCardHomeFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_promoCardHomeFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<PromoCardHome.Model, PromoCardHome.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultPromoCardHome make(PromoCardHome.Configuration configuration) {
        return new DefaultPromoCardHome(this.$this_promoCardHomeFactory.getActivity(), this.$this_promoCardHomeFactory.getPicasso());
    }
}
