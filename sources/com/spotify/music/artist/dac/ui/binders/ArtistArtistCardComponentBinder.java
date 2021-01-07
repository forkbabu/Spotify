package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.artist.dac.proto.ArtistArtistCardComponent;
import com.spotify.music.navigation.t;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistArtistCardComponentBinder implements a<ArtistArtistCardComponent> {
    private Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events> a;
    private final EncoreConsumerEntryPoint b;
    private final t c;

    public ArtistArtistCardComponentBinder(EncoreConsumerEntryPoint encoreConsumerEntryPoint, t tVar) {
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        h.e(tVar, "navigator");
        this.b = encoreConsumerEntryPoint;
        this.c = tVar;
    }

    public static final /* synthetic */ Component a(ArtistArtistCardComponentBinder artistArtistCardComponentBinder) {
        Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events> component = artistArtistCardComponentBinder.a;
        if (component != null) {
            return component;
        }
        h.k("cardEncoreComponent");
        throw null;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistArtistCardComponent, Boolean, View> builder() {
        return new ArtistArtistCardComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistArtistCardComponent, f> c() {
        return new ArtistArtistCardComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistArtistCardComponent> e() {
        return ArtistArtistCardComponentBinder$parser$1.a;
    }
}
