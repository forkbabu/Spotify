package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;
import com.spotify.encore.consumer.components.artist.entrypoint.EncoreConsumerExtensions;
import com.spotify.music.artist.dac.proto.ArtistArtistCardComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistArtistCardComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistArtistCardComponent, Boolean, View> {
    final /* synthetic */ ArtistArtistCardComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistArtistCardComponentBinder$builder$1(ArtistArtistCardComponentBinder artistArtistCardComponentBinder) {
        super(3);
        this.this$0 = artistArtistCardComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistArtistCardComponent artistArtistCardComponent, Boolean bool) {
        bool.booleanValue();
        h.e(viewGroup, "<anonymous parameter 0>");
        h.e(artistArtistCardComponent, "<anonymous parameter 1>");
        Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events> make = EncoreConsumerExtensions.playlistCardArtistFactory(ArtistArtistCardComponentBinder.b(this.this$0).getCards()).make();
        ArtistArtistCardComponentBinder.g(this.this$0, make);
        return make.getView();
    }
}
