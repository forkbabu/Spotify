package com.spotify.encore.consumer.components.artist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.header.ArtistHeader;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerArtistHeaderExtensions {
    public static final ComponentFactory<Component<ArtistHeader.Model, ArtistHeader.Events>, ArtistHeader.Configuration> artistHeaderFactory(EncoreConsumerEntryPoint.Headers headers) {
        h.e(headers, "$this$artistHeaderFactory");
        return new EncoreConsumerArtistHeaderExtensions$artistHeaderFactory$1(headers);
    }
}
