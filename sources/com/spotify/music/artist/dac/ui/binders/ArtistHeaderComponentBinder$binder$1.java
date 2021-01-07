package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.encore.consumer.components.artist.api.header.ArtistHeader;
import com.spotify.music.artist.dac.proto.ArtistHeaderComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistHeaderComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistHeaderComponent, f> {
    final /* synthetic */ ArtistHeaderComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistHeaderComponentBinder$binder$1(ArtistHeaderComponentBinder artistHeaderComponentBinder) {
        super(2);
        this.this$0 = artistHeaderComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistHeaderComponent artistHeaderComponent) {
        final ArtistHeaderComponent artistHeaderComponent2 = artistHeaderComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistHeaderComponent2, "component");
        String i = artistHeaderComponent2.i();
        h.d(i, "component.artistName");
        String m = artistHeaderComponent2.m();
        h.d(m, "component.monthlyListenerCount");
        ArtistHeader.Model model = new ArtistHeader.Model(i, m, artistHeaderComponent2.h(), 0, false, false, 8, null);
        ArtistHeaderComponentBinder artistHeaderComponentBinder = this.this$0;
        String l = artistHeaderComponent2.l();
        h.d(l, "component.artistUri");
        ArtistHeaderComponentBinder.j(artistHeaderComponentBinder, l, model);
        ArtistHeaderComponentBinder.f(this.this$0).render(model);
        ArtistHeaderComponentBinder.f(this.this$0).onEvent(new nmf<ArtistHeader.Events, f>() {
            /* class com.spotify.music.artist.dac.ui.binders.ArtistHeaderComponentBinder$binder$1.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public f invoke(ArtistHeader.Events events) {
                ArtistHeader.Events events2 = events;
                h.e(events2, "event");
                int ordinal = events2.ordinal();
                if (ordinal == 0) {
                    ArtistHeaderComponentBinder.g(ArtistHeaderComponentBinder$binder$1.this.this$0).a();
                } else if (ordinal == 2) {
                    ArtistHeaderComponentBinder artistHeaderComponentBinder = ArtistHeaderComponentBinder$binder$1.this.this$0;
                    String l = artistHeaderComponent2.l();
                    h.d(l, "component.artistUri");
                    ArtistHeaderComponentBinder.k(artistHeaderComponentBinder, l);
                }
                return f.a;
            }
        });
        return f.a;
    }
}
