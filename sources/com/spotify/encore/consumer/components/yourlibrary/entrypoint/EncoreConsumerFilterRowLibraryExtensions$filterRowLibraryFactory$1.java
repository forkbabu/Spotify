package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.filterrow.DefaultFilterRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerFilterRowLibraryExtensions$filterRowLibraryFactory$1 implements ComponentFactory<Component<FilterRowLibrary.Model, FilterRowLibrary.Event>, FilterRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_filterRowLibraryFactory;

    EncoreConsumerFilterRowLibraryExtensions$filterRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_filterRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<FilterRowLibrary.Model, FilterRowLibrary.Event> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultFilterRowLibrary make(FilterRowLibrary.Configuration configuration) {
        return new DefaultFilterRowLibrary(this.$this_filterRowLibraryFactory.getActivity());
    }
}
