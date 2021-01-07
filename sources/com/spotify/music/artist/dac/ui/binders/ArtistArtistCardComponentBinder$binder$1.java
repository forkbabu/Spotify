package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;
import com.spotify.music.artist.dac.proto.ArtistArtistCardComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistArtistCardComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistArtistCardComponent, f> {
    final /* synthetic */ ArtistArtistCardComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistArtistCardComponentBinder$binder$1(ArtistArtistCardComponentBinder artistArtistCardComponentBinder) {
        super(2);
        this.this$0 = artistArtistCardComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistArtistCardComponent artistArtistCardComponent) {
        final ArtistArtistCardComponent artistArtistCardComponent2 = artistArtistCardComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistArtistCardComponent2, "cardComponent");
        String i = artistArtistCardComponent2.i();
        String h = artistArtistCardComponent2.h();
        h.d(h, "cardComponent.artistImageUri");
        ArtistArtistCardComponentBinder.a(this.this$0).render(new PlaylistCardArtist.Model(i, h));
        ArtistArtistCardComponentBinder.a(this.this$0).onEvent(new nmf<PlaylistCardArtist.Events, f>() {
            /* class com.spotify.music.artist.dac.ui.binders.ArtistArtistCardComponentBinder$binder$1.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public f invoke(PlaylistCardArtist.Events events) {
                PlaylistCardArtist.Events events2 = events;
                h.e(events2, "event");
                if (h.a(events2, PlaylistCardArtist.Events.CardClicked.INSTANCE)) {
                    ArtistArtistCardComponentBinder.f(ArtistArtistCardComponentBinder$binder$1.this.this$0).d(artistArtistCardComponent2.l());
                }
                return f.a;
            }
        });
        return f.a;
    }
}
