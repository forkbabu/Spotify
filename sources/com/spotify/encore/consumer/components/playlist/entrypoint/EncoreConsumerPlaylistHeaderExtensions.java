package com.spotify.encore.consumer.components.playlist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.playlist.api.playlistheader.PlaylistHeader;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerPlaylistHeaderExtensions {
    public static final ComponentFactory<Component<PlaylistHeader.Model, PlaylistHeader.Events>, PlaylistHeader.Configuration> playlistHeaderFactory(EncoreConsumerEntryPoint.Headers headers) {
        h.e(headers, "$this$playlistHeaderFactory");
        return new EncoreConsumerPlaylistHeaderExtensions$playlistHeaderFactory$1(headers);
    }
}
