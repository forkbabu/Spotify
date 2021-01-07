package com.spotify.encore.consumer.components.genrehub.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.genrehub.api.genrehubheader.GenreHubHeader;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerGenreHubHeaderExtensions {
    public static final ComponentFactory<Component<GenreHubHeader.Model, GenreHubHeader.Events>, GenreHubHeader.Configuration> genreHubHeaderFactory(EncoreConsumerEntryPoint.Headers headers) {
        h.e(headers, "$this$genreHubHeaderFactory");
        return new EncoreConsumerGenreHubHeaderExtensions$genreHubHeaderFactory$1(headers);
    }
}
