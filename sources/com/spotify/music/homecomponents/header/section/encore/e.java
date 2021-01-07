package com.spotify.music.homecomponents.header.section.encore;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.recsplanationsectionheading.RecsplanationSectionHeading;

public final class e implements fjf<EncoreRecsplanationSectionHeadingComponent> {
    private final wlf<ComponentFactory<Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events>, RecsplanationSectionHeading.Configuration>> a;
    private final wlf<vp9> b;

    public e(wlf<ComponentFactory<Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events>, RecsplanationSectionHeading.Configuration>> wlf, wlf<vp9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EncoreRecsplanationSectionHeadingComponent(this.a.get(), this.b.get());
    }
}
