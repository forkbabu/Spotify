package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;
import com.spotify.music.artist.dac.proto.ArtistPlaylistCardComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPlaylistCardComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistPlaylistCardComponent, f> {
    final /* synthetic */ ArtistPlaylistCardComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistPlaylistCardComponentBinder$binder$1(ArtistPlaylistCardComponentBinder artistPlaylistCardComponentBinder) {
        super(2);
        this.this$0 = artistPlaylistCardComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistPlaylistCardComponent artistPlaylistCardComponent) {
        final ArtistPlaylistCardComponent artistPlaylistCardComponent2 = artistPlaylistCardComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistPlaylistCardComponent2, "component");
        String i = artistPlaylistCardComponent2.i();
        String h = artistPlaylistCardComponent2.h();
        h.d(h, "component.playlistImageUri");
        ArtistPlaylistCardComponentBinder.b(this.this$0).render(new PlaylistCardArtist.Model(i, h));
        ArtistPlaylistCardComponentBinder.b(this.this$0).onEvent(new nmf<PlaylistCardArtist.Events, f>() {
            /* class com.spotify.music.artist.dac.ui.binders.ArtistPlaylistCardComponentBinder$binder$1.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public f invoke(PlaylistCardArtist.Events events) {
                PlaylistCardArtist.Events events2 = events;
                h.e(events2, "event");
                if (h.a(events2, PlaylistCardArtist.Events.CardClicked.INSTANCE)) {
                    ArtistPlaylistCardComponentBinder.a(ArtistPlaylistCardComponentBinder$binder$1.this.this$0).d(artistPlaylistCardComponent2.l());
                }
                return f.a;
            }
        });
        return f.a;
    }
}
