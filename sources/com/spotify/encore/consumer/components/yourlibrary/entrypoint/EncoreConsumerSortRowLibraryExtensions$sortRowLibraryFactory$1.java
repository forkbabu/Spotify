package com.spotify.encore.consumer.components.yourlibrary.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.sortrow.SortRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.sortrow.DefaultSortRowLibrary;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerSortRowLibraryExtensions$sortRowLibraryFactory$1 implements ComponentFactory<Component<SortRowLibrary.Model, SortRowLibrary.Events>, SortRowLibrary.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_sortRowLibraryFactory;

    EncoreConsumerSortRowLibraryExtensions$sortRowLibraryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_sortRowLibraryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<SortRowLibrary.Model, SortRowLibrary.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultSortRowLibrary make(SortRowLibrary.Configuration configuration) {
        return new DefaultSortRowLibrary(this.$this_sortRowLibraryFactory.getActivity());
    }
}
