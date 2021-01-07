package com.spotify.music.homecomponents.header.section.encore;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading1;
import kotlin.f;

public final class b implements fjf<a> {
    private final wlf<ComponentFactory<Component<SectionHeading1.Model, f>, SectionHeading1.Configuration>> a;

    public b(wlf<ComponentFactory<Component<SectionHeading1.Model, f>, SectionHeading1.Configuration>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
