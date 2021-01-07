package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.searchheader.SearchHeaderLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerSearchHeaderLibraryExtensions {
    public static final ComponentFactory<Component<SearchHeaderLibrary.Model, SearchHeaderLibrary.Events>, SearchHeaderLibrary.Configuration> searchHeaderLibraryFactory(EncoreConsumerEntryPoint.Headers headers) {
        h.e(headers, "$this$searchHeaderLibraryFactory");
        return new EncoreConsumerSearchHeaderLibraryExtensions$searchHeaderLibraryFactory$1(headers);
    }
}
