package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.albumcard.AlbumCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerAlbumCardLibraryExtensions {
    public static final ComponentFactory<Component<AlbumCardLibrary.Model, AlbumCardLibrary.Events>, AlbumCardLibrary.Configuration> albumCardLibraryFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$albumCardLibraryFactory");
        return new EncoreConsumerAlbumCardLibraryExtensions$albumCardLibraryFactory$1(cards);
    }
}
