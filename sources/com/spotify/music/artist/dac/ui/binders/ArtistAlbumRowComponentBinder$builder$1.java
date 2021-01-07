package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import com.spotify.music.artist.dac.proto.ArtistAlbumRowComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistAlbumRowComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistAlbumRowComponent, Boolean, View> {
    final /* synthetic */ ArtistAlbumRowComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistAlbumRowComponentBinder$builder$1(ArtistAlbumRowComponentBinder artistAlbumRowComponentBinder) {
        super(3);
        this.this$0 = artistAlbumRowComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistAlbumRowComponent artistAlbumRowComponent, Boolean bool) {
        bool.booleanValue();
        h.e(viewGroup, "<anonymous parameter 0>");
        h.e(artistAlbumRowComponent, "<anonymous parameter 1>");
        Component<TrackRow.Model, TrackRow.Events> make = EncoreConsumerExtensions.trackRowFactory(ArtistAlbumRowComponentBinder.b(this.this$0).getRows()).make();
        ArtistAlbumRowComponentBinder.g(this.this$0, make);
        return make.getView();
    }
}
