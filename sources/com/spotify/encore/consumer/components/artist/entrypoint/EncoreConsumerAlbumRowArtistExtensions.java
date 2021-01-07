package com.spotify.encore.consumer.components.artist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.albumrow.AlbumRowArtist;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerAlbumRowArtistExtensions {
    public static final ComponentFactory<Component<AlbumRowArtist.Model, AlbumRowArtist.Events>, AlbumRowArtist.Configuration> albumRowArtistFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$albumRowArtistFactory");
        return new EncoreConsumerAlbumRowArtistExtensions$albumRowArtistFactory$1(rows);
    }
}
