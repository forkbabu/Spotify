package com.spotify.encore.consumer.components.promo.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerPromoCardHomeExtensions {
    public static final ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration> promoCardHomeFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$promoCardHomeFactory");
        return new EncoreConsumerPromoCardHomeExtensions$promoCardHomeFactory$1(cards);
    }
}
