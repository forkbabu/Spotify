package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongscard.LikedSongsCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerLikedSongsCardLibraryExtensions {
    public static final ComponentFactory<Component<LikedSongsCardLibrary.Model, LikedSongsCardLibrary.Events>, LikedSongsCardLibrary.Configuration> likedSongsCardLibraryFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$likedSongsCardLibraryFactory");
        return new EncoreConsumerLikedSongsCardLibraryExtensions$likedSongsCardLibraryFactory$1(cards);
    }
}
