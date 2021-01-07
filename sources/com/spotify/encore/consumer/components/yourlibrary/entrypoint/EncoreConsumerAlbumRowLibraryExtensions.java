package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.albumrow.AlbumRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerAlbumRowLibraryExtensions {
    public static final ComponentFactory<Component<AlbumRowLibrary.Model, AlbumRowLibrary.Events>, AlbumRowLibrary.Configuration> albumRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$albumRowLibraryFactory");
        return new EncoreConsumerAlbumRowLibraryExtensions$albumRowLibraryFactory$1(rows);
    }
}
