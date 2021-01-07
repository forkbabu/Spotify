package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.android.dac.engine.view.binders.containers.list.b;
import com.spotify.music.artist.dac.proto.ArtistPageWithHeaderComponent;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistPageWithHeaderComponentBinder implements a<ArtistPageWithHeaderComponent> {
    private b a;
    private t80 b;
    private final wlf<s80> c;

    public ArtistPageWithHeaderComponentBinder(wlf<s80> wlf) {
        h.e(wlf, "dacResolverProvider");
        this.c = wlf;
        this.a = new b(wlf);
    }

    public static final /* synthetic */ t80 f(ArtistPageWithHeaderComponentBinder artistPageWithHeaderComponentBinder) {
        t80 t80 = artistPageWithHeaderComponentBinder.b;
        if (t80 != null) {
            return t80;
        }
        h.k("headerComponentHandler");
        throw null;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistPageWithHeaderComponent, Boolean, View> builder() {
        return new ArtistPageWithHeaderComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistPageWithHeaderComponent, f> c() {
        return new ArtistPageWithHeaderComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistPageWithHeaderComponent> e() {
        return ArtistPageWithHeaderComponentBinder$parser$1.a;
    }
}
