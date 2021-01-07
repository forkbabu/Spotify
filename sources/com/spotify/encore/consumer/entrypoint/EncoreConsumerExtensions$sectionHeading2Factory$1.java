package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.encore.consumer.components.impl.sectionheading.DefaultSectionHeading2;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.f;

public final class EncoreConsumerExtensions$sectionHeading2Factory$1 implements ComponentFactory<Component<SectionHeading2.Model, f>, SectionHeading2.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headings $this_sectionHeading2Factory;

    EncoreConsumerExtensions$sectionHeading2Factory$1(EncoreConsumerEntryPoint.Headings headings) {
        this.$this_sectionHeading2Factory = headings;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<SectionHeading2.Model, f> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultSectionHeading2 make(SectionHeading2.Configuration configuration) {
        return new DefaultSectionHeading2(this.$this_sectionHeading2Factory.getActivity());
    }
}
