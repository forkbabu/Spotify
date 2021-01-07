package com.spotify.encore.consumer.components.home.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.homecard.HomeCard;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerHomeCardExtensions {
    public static final ComponentFactory<Component<HomeCard.Model, HomeCard.Events>, HomeCard.Configuration> homeCardFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$homeCardFactory");
        return new EncoreConsumerHomeCardExtensions$homeCardFactory$1(cards);
    }
}
