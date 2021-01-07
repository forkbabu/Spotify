package com.spotify.encore.consumer.components.home.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.recsplanationsectionheading.RecsplanationSectionHeading;
import com.spotify.encore.consumer.components.home.impl.recsplanationsectionheading.DefaultRecsplanationSectionHeading;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerRecsplanationSectionHeadingExtensions$recsplanationSectionHeadingFactory$1 implements ComponentFactory<Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events>, RecsplanationSectionHeading.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headings $this_recsplanationSectionHeadingFactory;

    EncoreConsumerRecsplanationSectionHeadingExtensions$recsplanationSectionHeadingFactory$1(EncoreConsumerEntryPoint.Headings headings) {
        this.$this_recsplanationSectionHeadingFactory = headings;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultRecsplanationSectionHeading make(RecsplanationSectionHeading.Configuration configuration) {
        return new DefaultRecsplanationSectionHeading(this.$this_recsplanationSectionHeadingFactory.getActivity(), this.$this_recsplanationSectionHeadingFactory.getPicasso());
    }
}
