package com.spotify.encore.consumer.components.home.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.likedsongscard.LikedSongsCardHome;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerLikedSongsCardHomeExtensions {
    public static final ComponentFactory<Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events>, LikedSongsCardHome.Configuration> likedSongsCardHomeFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$likedSongsCardHomeFactory");
        return new EncoreConsumerLikedSongsCardHomeExtensions$likedSongsCardHomeFactory$1(cards);
    }
}
