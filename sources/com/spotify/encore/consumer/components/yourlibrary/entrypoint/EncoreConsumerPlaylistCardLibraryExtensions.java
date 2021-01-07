package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.playlistcard.PlaylistCardLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerPlaylistCardLibraryExtensions {
    public static final ComponentFactory<Component<PlaylistCardLibrary.Model, PlaylistCardLibrary.Events>, PlaylistCardLibrary.Configuration> playlistCardLibraryFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$playlistCardLibraryFactory");
        return new EncoreConsumerPlaylistCardLibraryExtensions$playlistCardLibraryFactory$1(cards);
    }
}
