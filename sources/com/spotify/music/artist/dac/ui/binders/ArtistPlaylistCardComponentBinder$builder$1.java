package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.music.artist.dac.proto.ArtistPlaylistCardComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPlaylistCardComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistPlaylistCardComponent, Boolean, View> {
    final /* synthetic */ ArtistPlaylistCardComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistPlaylistCardComponentBinder$builder$1(ArtistPlaylistCardComponentBinder artistPlaylistCardComponentBinder) {
        super(3);
        this.this$0 = artistPlaylistCardComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistPlaylistCardComponent artistPlaylistCardComponent, Boolean bool) {
        bool.booleanValue();
        h.e(viewGroup, "<anonymous parameter 0>");
        h.e(artistPlaylistCardComponent, "<anonymous parameter 1>");
        Component make = ArtistPlaylistCardComponentBinder.f(this.this$0).make();
        ArtistPlaylistCardComponentBinder.g(this.this$0, make);
        return make.getView();
    }
}
