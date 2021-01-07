package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistrow.PlaylistRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerPlaylistRowLibraryExtensions {
    public static final ComponentFactory<Component<PlaylistRowLibrary.Model, PlaylistRowLibrary.Events>, PlaylistRowLibrary.Configuration> playlistRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$playlistRowLibraryFactory");
        return new EncoreConsumerPlaylistRowLibraryExtensions$playlistRowLibraryFactory$1(rows);
    }
}
