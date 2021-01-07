package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.music.artist.dac.proto.ArtistPageCarouselComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPageCarouselComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistPageCarouselComponent, f> {
    final /* synthetic */ ArtistPageCarouselComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistPageCarouselComponentBinder$binder$1(ArtistPageCarouselComponentBinder artistPageCarouselComponentBinder) {
        super(2);
        this.this$0 = artistPageCarouselComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistPageCarouselComponent artistPageCarouselComponent) {
        ArtistPageCarouselComponent artistPageCarouselComponent2 = artistPageCarouselComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistPageCarouselComponent2, "component");
        String i = artistPageCarouselComponent2.i();
        h.d(i, "component.title");
        ArtistPageCarouselComponentBinder.f(this.this$0).render(new SectionHeading2.Model(i, null, 2, null));
        ArtistPageCarouselComponentBinder.b(this.this$0).b0(artistPageCarouselComponent2.h());
        return f.a;
    }
}
