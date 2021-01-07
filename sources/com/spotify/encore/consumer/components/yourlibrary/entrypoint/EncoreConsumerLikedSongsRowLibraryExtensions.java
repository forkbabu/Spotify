package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongsrow.LikedSongsRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerLikedSongsRowLibraryExtensions {
    public static final ComponentFactory<Component<LikedSongsRowLibrary.Model, LikedSongsRowLibrary.Events>, LikedSongsRowLibrary.Configuration> likedSongsRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$likedSongsRowLibraryFactory");
        return new EncoreConsumerLikedSongsRowLibraryExtensions$likedSongsRowLibraryFactory$1(rows);
    }
}
