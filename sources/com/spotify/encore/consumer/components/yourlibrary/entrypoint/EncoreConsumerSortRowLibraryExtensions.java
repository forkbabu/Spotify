package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.sortrow.SortRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerSortRowLibraryExtensions {
    public static final ComponentFactory<Component<SortRowLibrary.Model, SortRowLibrary.Events>, SortRowLibrary.Configuration> sortRowLibraryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$sortRowLibraryFactory");
        return new EncoreConsumerSortRowLibraryExtensions$sortRowLibraryFactory$1(rows);
    }
}
