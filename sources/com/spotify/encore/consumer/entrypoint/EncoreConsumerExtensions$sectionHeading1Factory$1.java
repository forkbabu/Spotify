package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading1;
import com.spotify.encore.consumer.components.impl.sectionheading.DefaultSectionHeading1;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.f;

public final class EncoreConsumerExtensions$sectionHeading1Factory$1 implements ComponentFactory<Component<SectionHeading1.Model, f>, SectionHeading1.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Headings $this_sectionHeading1Factory;

    EncoreConsumerExtensions$sectionHeading1Factory$1(EncoreConsumerEntryPoint.Headings headings) {
        this.$this_sectionHeading1Factory = headings;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<SectionHeading1.Model, f> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultSectionHeading1 make(SectionHeading1.Configuration configuration) {
        return new DefaultSectionHeading1(this.$this_sectionHeading1Factory.getActivity());
    }
}
