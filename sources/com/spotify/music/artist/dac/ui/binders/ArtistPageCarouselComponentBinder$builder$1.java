package com.spotify.music.artist.dac.ui.binders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import com.spotify.music.C0707R;
import com.spotify.music.artist.dac.proto.ArtistPageCarouselComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPageCarouselComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistPageCarouselComponent, Boolean, View> {
    final /* synthetic */ ArtistPageCarouselComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistPageCarouselComponentBinder$builder$1(ArtistPageCarouselComponentBinder artistPageCarouselComponentBinder) {
        super(3);
        this.this$0 = artistPageCarouselComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistPageCarouselComponent artistPageCarouselComponent, Boolean bool) {
        ViewGroup viewGroup2 = viewGroup;
        boolean booleanValue = bool.booleanValue();
        h.e(viewGroup2, "parentView");
        h.e(artistPageCarouselComponent, "<anonymous parameter 1>");
        View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(C0707R.layout.artist_page_carousel_layout, viewGroup2, booleanValue);
        ArtistPageCarouselComponentBinder artistPageCarouselComponentBinder = this.this$0;
        ArtistPageCarouselComponentBinder.g(artistPageCarouselComponentBinder, EncoreConsumerExtensions.sectionHeading2Factory(ArtistPageCarouselComponentBinder.a(artistPageCarouselComponentBinder).getHeadings()).make());
        if (inflate != null) {
            ((LinearLayout) inflate).addView(ArtistPageCarouselComponentBinder.f(this.this$0).getView(), 0);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.carousel);
            viewGroup2.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.setAdapter(ArtistPageCarouselComponentBinder.b(this.this$0));
            h.d(inflate, "LayoutInflater.from(pare…      }\n                }");
            return inflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}
