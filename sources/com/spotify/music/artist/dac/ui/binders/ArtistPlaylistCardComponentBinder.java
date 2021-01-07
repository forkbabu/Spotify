package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtistConfiguration;
import com.spotify.music.artist.dac.proto.ArtistPlaylistCardComponent;
import com.spotify.music.navigation.t;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistPlaylistCardComponentBinder implements a<ArtistPlaylistCardComponent> {
    private Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events> a;
    private final t b;
    private final ComponentFactory<Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events>, PlaylistCardArtistConfiguration> c;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.spotify.encore.ComponentFactory<com.spotify.encore.Component<com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist$Model, com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist$Events>, ? super com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtistConfiguration> */
    /* JADX WARN: Multi-variable type inference failed */
    public ArtistPlaylistCardComponentBinder(t tVar, ComponentFactory<Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events>, ? super PlaylistCardArtistConfiguration> componentFactory) {
        h.e(tVar, "navigator");
        h.e(componentFactory, "playlistCardArtistFactory");
        this.b = tVar;
        this.c = componentFactory;
    }

    public static final /* synthetic */ Component b(ArtistPlaylistCardComponentBinder artistPlaylistCardComponentBinder) {
        Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events> component = artistPlaylistCardComponentBinder.a;
        if (component != null) {
            return component;
        }
        h.k("playlistCardArtist");
        throw null;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistPlaylistCardComponent, Boolean, View> builder() {
        return new ArtistPlaylistCardComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistPlaylistCardComponent, f> c() {
        return new ArtistPlaylistCardComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistPlaylistCardComponent> e() {
        return ArtistPlaylistCardComponentBinder$parser$1.a;
    }
}
