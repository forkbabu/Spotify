package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.proto.ArtistSectionHeaderComponent;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistSectionHeaderComponentBinder implements a<ArtistSectionHeaderComponent> {
    private Component<SectionHeading2.Model, f> a;
    private final EncoreConsumerEntryPoint b;

    public ArtistSectionHeaderComponentBinder(EncoreConsumerEntryPoint encoreConsumerEntryPoint) {
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        this.b = encoreConsumerEntryPoint;
    }

    public static final /* synthetic */ Component b(ArtistSectionHeaderComponentBinder artistSectionHeaderComponentBinder) {
        Component<SectionHeading2.Model, f> component = artistSectionHeaderComponentBinder.a;
        if (component != null) {
            return component;
        }
        h.k("sectionHeading");
        throw null;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistSectionHeaderComponent, Boolean, View> builder() {
        return new ArtistSectionHeaderComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistSectionHeaderComponent, f> c() {
        return new ArtistSectionHeaderComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistSectionHeaderComponent> e() {
        return ArtistSectionHeaderComponentBinder$parser$1.a;
    }
}
