package com.spotify.encore.consumer.components.album.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.album.DaggerAlbumEncoreConsumerComponent;
import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbumConfiguration;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerExtensions {
    public static final ComponentFactory<Component<AlbumHeader.Model, AlbumHeader.Events>, AlbumHeader.Configuration> albumHeaderFactory(EncoreConsumerEntryPoint.Headers headers) {
        h.e(headers, "$this$albumHeaderFactory");
        return new EncoreConsumerExtensions$albumHeaderFactory$1(headers);
    }

    public static final ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration> trackRowAlbumFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$trackRowAlbumFactory");
        return DaggerAlbumEncoreConsumerComponent.factory().create(rows.getActivity()).trackRowAlbumFactory();
    }
}
