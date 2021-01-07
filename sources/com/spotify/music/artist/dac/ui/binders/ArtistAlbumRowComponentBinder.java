package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.proto.ArtistAlbumRowComponent;
import com.spotify.music.navigation.t;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistAlbumRowComponentBinder implements a<ArtistAlbumRowComponent> {
    private Component<TrackRow.Model, TrackRow.Events> a;
    private final EncoreConsumerEntryPoint b;
    private final t c;

    public ArtistAlbumRowComponentBinder(EncoreConsumerEntryPoint encoreConsumerEntryPoint, t tVar) {
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        h.e(tVar, "navigator");
        this.b = encoreConsumerEntryPoint;
        this.c = tVar;
    }

    public static final /* synthetic */ Component a(ArtistAlbumRowComponentBinder artistAlbumRowComponentBinder) {
        Component<TrackRow.Model, TrackRow.Events> component = artistAlbumRowComponentBinder.a;
        if (component != null) {
            return component;
        }
        h.k("albumRow");
        throw null;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistAlbumRowComponent, Boolean, View> builder() {
        return new ArtistAlbumRowComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistAlbumRowComponent, f> c() {
        return new ArtistAlbumRowComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistAlbumRowComponent> e() {
        return ArtistAlbumRowComponentBinder$parser$1.a;
    }
}
