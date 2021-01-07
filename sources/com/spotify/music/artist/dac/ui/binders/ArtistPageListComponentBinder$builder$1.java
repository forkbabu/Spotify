package com.spotify.music.artist.dac.ui.binders;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import com.spotify.music.C0707R;
import com.spotify.music.artist.dac.proto.ArtistPageListComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPageListComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistPageListComponent, Boolean, View> {
    final /* synthetic */ ArtistPageListComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistPageListComponentBinder$builder$1(ArtistPageListComponentBinder artistPageListComponentBinder) {
        super(3);
        this.this$0 = artistPageListComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistPageListComponent artistPageListComponent, Boolean bool) {
        ViewGroup viewGroup2 = viewGroup;
        boolean booleanValue = bool.booleanValue();
        h.e(viewGroup2, "parentView");
        h.e(artistPageListComponent, "<anonymous parameter 1>");
        View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(C0707R.layout.artist_page_list_layout, viewGroup2, booleanValue);
        ArtistPageListComponentBinder artistPageListComponentBinder = this.this$0;
        ArtistPageListComponentBinder.g(artistPageListComponentBinder, EncoreConsumerExtensions.sectionHeading2Factory(ArtistPageListComponentBinder.b(artistPageListComponentBinder).getHeadings()).make());
        if (inflate != null) {
            ((LinearLayout) inflate).addView(ArtistPageListComponentBinder.f(this.this$0).getView(), 0);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.tracks);
            viewGroup2.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.setAdapter(ArtistPageListComponentBinder.a(this.this$0));
            int i = q4.g;
            if (Build.VERSION.SDK_INT >= 21) {
                recyclerView.setNestedScrollingEnabled(false);
            } else {
                recyclerView.setNestedScrollingEnabled(false);
            }
            h.d(inflate, "LayoutInflater.from(pare…      }\n                }");
            return inflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}
