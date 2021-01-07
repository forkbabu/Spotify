package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerFilterRowLibraryExtensions {
    public static final ComponentFactory<Component<FilterRowLibrary.Model, FilterRowLibrary.Event>, FilterRowLibrary.Configuration> filterRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$filterRowLibraryFactory");
        return new EncoreConsumerFilterRowLibraryExtensions$filterRowLibraryFactory$1(rows);
    }
}
