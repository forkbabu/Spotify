package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.artistcard.ArtistCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerArtistCardLibraryExtensions {
    public static final ComponentFactory<Component<ArtistCardLibrary.Model, ArtistCardLibrary.Events>, ArtistCardLibrary.Configuration> artistCardLibraryFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$artistCardLibraryFactory");
        return new EncoreConsumerArtistCardLibraryExtensions$artistCardLibraryFactory$1(cards);
    }
}
