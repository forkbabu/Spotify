package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.header.ArtistHeader;
import com.spotify.music.artist.dac.proto.ArtistHeaderComponent;
import com.spotify.music.follow.j;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.q;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ArtistHeaderComponentBinder implements a<ArtistHeaderComponent> {
    private Component<ArtistHeader.Model, ArtistHeader.Events> a;
    private j b;
    private final q c = new q();
    private final ComponentFactory<Component<ArtistHeader.Model, ArtistHeader.Events>, ArtistHeader.Configuration> d;
    private final a8a e;
    private final gj2 f;
    private final t g;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.spotify.encore.ComponentFactory<com.spotify.encore.Component<com.spotify.encore.consumer.components.artist.api.header.ArtistHeader$Model, com.spotify.encore.consumer.components.artist.api.header.ArtistHeader$Events>, ? super com.spotify.encore.consumer.components.artist.api.header.ArtistHeader$Configuration> */
    /* JADX WARN: Multi-variable type inference failed */
    public ArtistHeaderComponentBinder(ComponentFactory<Component<ArtistHeader.Model, ArtistHeader.Events>, ? super ArtistHeader.Configuration> componentFactory, a8a a8a, gj2 gj2, t tVar) {
        h.e(componentFactory, "artistPageHeaderFactory");
        h.e(a8a, "artistDecorator");
        h.e(gj2, "rxArtistFollowManager");
        h.e(tVar, "navigation");
        this.d = componentFactory;
        this.e = a8a;
        this.f = gj2;
        this.g = tVar;
    }

    public static final /* synthetic */ Component f(ArtistHeaderComponentBinder artistHeaderComponentBinder) {
        Component<ArtistHeader.Model, ArtistHeader.Events> component = artistHeaderComponentBinder.a;
        if (component != null) {
            return component;
        }
        h.k("encoreArtistHeaderComponent");
        throw null;
    }

    public static final void j(ArtistHeaderComponentBinder artistHeaderComponentBinder, String str, ArtistHeader.Model model) {
        artistHeaderComponentBinder.c.a(artistHeaderComponentBinder.e.e(null, str).A(new a(str)).w(new b(artistHeaderComponentBinder, str)).subscribe(new c(artistHeaderComponentBinder, model)));
    }

    public static final void k(ArtistHeaderComponentBinder artistHeaderComponentBinder, String str) {
        j jVar = artistHeaderComponentBinder.b;
        if (jVar != null) {
            artistHeaderComponentBinder.f.c(str, !jVar.g());
        }
    }

    public static final void l(ArtistHeaderComponentBinder artistHeaderComponentBinder, j jVar, ArtistHeader.Model model) {
        artistHeaderComponentBinder.b = jVar;
        Component<ArtistHeader.Model, ArtistHeader.Events> component = artistHeaderComponentBinder.a;
        if (component != null) {
            component.render(ArtistHeader.Model.copy$default(model, null, null, null, 0, jVar.g(), false, 47, null));
        } else {
            h.k("encoreArtistHeaderComponent");
            throw null;
        }
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, ArtistHeaderComponent, Boolean, View> builder() {
        return new ArtistHeaderComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, ArtistHeaderComponent, f> c() {
        return new ArtistHeaderComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return new ArtistHeaderComponentBinder$unbinder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, ArtistHeaderComponent> e() {
        return ArtistHeaderComponentBinder$parser$1.a;
    }
}
