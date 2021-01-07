package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.music.artist.dac.proto.ArtistHeaderComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistHeaderComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistHeaderComponent, Boolean, View> {
    final /* synthetic */ ArtistHeaderComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistHeaderComponentBinder$builder$1(ArtistHeaderComponentBinder artistHeaderComponentBinder) {
        super(3);
        this.this$0 = artistHeaderComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistHeaderComponent artistHeaderComponent, Boolean bool) {
        bool.booleanValue();
        h.e(viewGroup, "<anonymous parameter 0>");
        h.e(artistHeaderComponent, "<anonymous parameter 1>");
        Component make = ArtistHeaderComponentBinder.a(this.this$0).make();
        ArtistHeaderComponentBinder.i(this.this$0, make);
        return make.getView();
    }
}
