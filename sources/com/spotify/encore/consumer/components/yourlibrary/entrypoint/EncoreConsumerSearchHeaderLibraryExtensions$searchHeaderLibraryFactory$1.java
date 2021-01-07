package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.searchheader.SearchHeaderLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.searchheader.DefaultSearchHeaderLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerSearchHeaderLibraryExtensions$searchHeaderLibraryFactory$1 implements ComponentFactory<Component<SearchHeaderLibrary.Model, SearchHeaderLibrary.Events>, SearchHeaderLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headers $this_searchHeaderLibraryFactory;

    EncoreConsumerSearchHeaderLibraryExtensions$searchHeaderLibraryFactory$1(EncoreConsumerEntryPoint.Headers headers) {
        this.$this_searchHeaderLibraryFactory = headers;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<SearchHeaderLibrary.Model, SearchHeaderLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultSearchHeaderLibrary make(SearchHeaderLibrary.Configuration configuration) {
        return new DefaultSearchHeaderLibrary(this.$this_searchHeaderLibraryFactory.getActivity());
    }
}
