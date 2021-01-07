package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.artistrow.ArtistRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerArtistRowLibraryExtensions {
    public static final ComponentFactory<Component<ArtistRowLibrary.Model, ArtistRowLibrary.Events>, ArtistRowLibrary.Configuration> artistRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$artistRowLibraryFactory");
        return new EncoreConsumerArtistRowLibraryExtensions$artistRowLibraryFactory$1(rows);
    }
}
