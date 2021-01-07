package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.android.dac.engine.view.binders.containers.list.b;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.proto.ArtistPageCarouselComponent;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistPageCarouselComponentBinder implements a<ArtistPageCarouselComponent> {
    private Component<SectionHeading2.Model, f> a;
    private final b b;
    private final EncoreConsumerEntryPoint c;

    public ArtistPageCarouselComponentBinder(wlf<s80> wlf, EncoreConsumerEntryPoint encoreConsumerEntryPoint) {
        h.e(wlf, "dacResolverProvider");
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        this.c = encoreConsumerEntryPoint;
        this.b = new b(wlf);
    }

    public static final /* synthetic */ Component f(ArtistPageCarouselComponentBinder artistPageCarouselComponentBinder) {
        Component<SectionHeading2.Model, f> component = artistPageCarouselComponentBinder.a;
        if (component != null) {
            return component;
        }
        h.k("sectionHeading");
        throw null;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistPageCarouselComponent, Boolean, View> builder() {
        return new ArtistPageCarouselComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistPageCarouselComponent, f> c() {
        return new ArtistPageCarouselComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistPageCarouselComponent> e() {
        return ArtistPageCarouselComponentBinder$parser$1.a;
    }
}
