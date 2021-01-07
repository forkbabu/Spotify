package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.music.artist.dac.proto.ArtistAlbumRowComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistAlbumRowComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistAlbumRowComponent, f> {
    final /* synthetic */ ArtistAlbumRowComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistAlbumRowComponentBinder$binder$1(ArtistAlbumRowComponentBinder artistAlbumRowComponentBinder) {
        super(2);
        this.this$0 = artistAlbumRowComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistAlbumRowComponent artistAlbumRowComponent) {
        final ArtistAlbumRowComponent artistAlbumRowComponent2 = artistAlbumRowComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistAlbumRowComponent2, "albumComponent");
        String i = artistAlbumRowComponent2.i();
        h.d(i, "albumComponent.albumName");
        ArtistAlbumRowComponentBinder.a(this.this$0).render(new TrackRow.Model(i, null, new Artwork.ImageData(artistAlbumRowComponent2.h()), null, null, null, null, false, false, false, false, 2042, null));
        ArtistAlbumRowComponentBinder.a(this.this$0).onEvent(new nmf<TrackRow.Events, f>() {
            /* class com.spotify.music.artist.dac.ui.binders.ArtistAlbumRowComponentBinder$binder$1.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public f invoke(TrackRow.Events events) {
                TrackRow.Events events2 = events;
                h.e(events2, "event");
                if (events2 == TrackRow.Events.RowClicked) {
                    ArtistAlbumRowComponentBinder.f(ArtistAlbumRowComponentBinder$binder$1.this.this$0).d(artistAlbumRowComponent2.l());
                }
                return f.a;
            }
        });
        return f.a;
    }
}
