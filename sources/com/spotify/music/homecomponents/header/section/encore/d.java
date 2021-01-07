package com.spotify.music.homecomponents.header.section.encore;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import kotlin.f;

public final class d implements fjf<c> {
    private final wlf<ComponentFactory<Component<SectionHeading2.Model, f>, SectionHeading2.Configuration>> a;

    public d(wlf<ComponentFactory<Component<SectionHeading2.Model, f>, SectionHeading2.Configuration>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
