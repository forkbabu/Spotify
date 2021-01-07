package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.navigationrow.NavigationRow;
import com.spotify.encore.consumer.components.impl.com.spotify.encore.consumer.components.impl.navigationrow.DefaultNavigationRow;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerExtensions$navigationRowFactory$1 implements ComponentFactory<Component<NavigationRow.Model, NavigationRow.Events>, NavigationRow.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_navigationRowFactory;

    EncoreConsumerExtensions$navigationRowFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_navigationRowFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<NavigationRow.Model, NavigationRow.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultNavigationRow make(NavigationRow.Configuration configuration) {
        return new DefaultNavigationRow(this.$this_navigationRowFactory.getActivity());
    }
}
