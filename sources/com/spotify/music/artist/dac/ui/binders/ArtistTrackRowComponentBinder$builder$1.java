package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.components.artist.entrypoint.EncoreConsumerTrackRowArtistExtensions;
import com.spotify.music.artist.dac.proto.ArtistTrackRowComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistTrackRowComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistTrackRowComponent, Boolean, View> {
    final /* synthetic */ ArtistTrackRowComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistTrackRowComponentBinder$builder$1(ArtistTrackRowComponentBinder artistTrackRowComponentBinder) {
        super(3);
        this.this$0 = artistTrackRowComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistTrackRowComponent artistTrackRowComponent, Boolean bool) {
        bool.booleanValue();
        h.e(viewGroup, "<anonymous parameter 0>");
        h.e(artistTrackRowComponent, "<anonymous parameter 1>");
        TrackRowArtist make = EncoreConsumerTrackRowArtistExtensions.trackRowArtistFactory(ArtistTrackRowComponentBinder.a(this.this$0).getRows()).make();
        ArtistTrackRowComponentBinder.g(this.this$0, make);
        return make.getView();
    }
}
