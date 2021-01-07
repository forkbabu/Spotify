package com.spotify.encore.consumer.components.home.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.recsplanationsectionheading.RecsplanationSectionHeading;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerRecsplanationSectionHeadingExtensions {
    public static final ComponentFactory<Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events>, RecsplanationSectionHeading.Configuration> recsplanationSectionHeadingFactory(EncoreConsumerEntryPoint.Headings headings) {
        h.e(headings, "$this$recsplanationSectionHeadingFactory");
        return new EncoreConsumerRecsplanationSectionHeadingExtensions$recsplanationSectionHeadingFactory$1(headings);
    }
}
