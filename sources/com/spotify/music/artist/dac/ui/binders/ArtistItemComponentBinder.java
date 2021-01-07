package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;
import com.spotify.music.artist.dac.proto.ArtistItemComponent;
import com.spotify.music.navigation.t;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistItemComponentBinder implements a<ArtistItemComponent> {
    public TextView a;
    public CoverArtView b;
    private final t c;
    private final CoverArtView.ViewContext d;

    public ArtistItemComponentBinder(t tVar, CoverArtView.ViewContext viewContext) {
        h.e(tVar, "navigator");
        h.e(viewContext, "coverArtViewContext");
        this.c = tVar;
        this.d = viewContext;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistItemComponent, Boolean, View> builder() {
        return new ArtistItemComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistItemComponent, f> c() {
        return new ArtistItemComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistItemComponent> e() {
        return ArtistItemComponentBinder$parser$1.a;
    }

    public final CoverArtView f() {
        CoverArtView coverArtView = this.b;
        if (coverArtView != null) {
            return coverArtView;
        }
        h.k("artistImage");
        throw null;
    }
}
