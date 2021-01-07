package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.proto.ArtistTrackRowComponent;
import com.spotify.music.navigation.t;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistTrackRowComponentBinder implements a<ArtistTrackRowComponent> {
    private TrackRowArtist a;
    private final EncoreConsumerEntryPoint b;
    private final t c;

    public ArtistTrackRowComponentBinder(EncoreConsumerEntryPoint encoreConsumerEntryPoint, t tVar) {
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        h.e(tVar, "navigator");
        this.b = encoreConsumerEntryPoint;
        this.c = tVar;
    }

    public static final /* synthetic */ TrackRowArtist f(ArtistTrackRowComponentBinder artistTrackRowComponentBinder) {
        TrackRowArtist trackRowArtist = artistTrackRowComponentBinder.a;
        if (trackRowArtist != null) {
            return trackRowArtist;
        }
        h.k("trackRow");
        throw null;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistTrackRowComponent, Boolean, View> builder() {
        return new ArtistTrackRowComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistTrackRowComponent, f> c() {
        return new ArtistTrackRowComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistTrackRowComponent> e() {
        return ArtistTrackRowComponentBinder$parser$1.a;
    }
}
