package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading3;
import com.spotify.encore.consumer.components.impl.sectionheading.DefaultSectionHeading3;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.f;

public final class EncoreConsumerExtensions$sectionHeading3Factory$1 implements ComponentFactory<Component<SectionHeading3.Model, f>, SectionHeading3.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headings $this_sectionHeading3Factory;

    EncoreConsumerExtensions$sectionHeading3Factory$1(EncoreConsumerEntryPoint.Headings headings) {
        this.$this_sectionHeading3Factory = headings;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<SectionHeading3.Model, f> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultSectionHeading3 make(SectionHeading3.Configuration configuration) {
        return new DefaultSectionHeading3(this.$this_sectionHeading3Factory.getActivity());
    }
}
