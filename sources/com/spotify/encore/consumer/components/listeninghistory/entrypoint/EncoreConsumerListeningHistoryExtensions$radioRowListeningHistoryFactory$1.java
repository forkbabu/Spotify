package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.radiorow.RadioRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.entityrow.DefaultEntityRowListeningHistoryViewBinder;
import com.spotify.encore.consumer.components.listeninghistory.impl.radiorow.DefaultRadioRowListeningHistory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerListeningHistoryExtensions$radioRowListeningHistoryFactory$1 implements ComponentFactory<Component<RadioRowListeningHistory.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_radioRowListeningHistoryFactory;

    EncoreConsumerListeningHistoryExtensions$radioRowListeningHistoryFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_radioRowListeningHistoryFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<RadioRowListeningHistory.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.listeninghistory.impl.radiorow.DefaultRadioRowListeningHistory' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<RadioRowListeningHistory.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultRadioRowListeningHistory(new DefaultEntityRowListeningHistoryViewBinder(this.$this_radioRowListeningHistoryFactory.getActivity(), this.$this_radioRowListeningHistoryFactory.getPicasso()));
    }
}
