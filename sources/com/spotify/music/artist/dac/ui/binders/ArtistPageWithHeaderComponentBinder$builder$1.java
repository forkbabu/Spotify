package com.spotify.music.artist.dac.ui.binders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.Any;
import com.spotify.music.C0707R;
import com.spotify.music.artist.dac.proto.ArtistPageWithHeaderComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPageWithHeaderComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistPageWithHeaderComponent, Boolean, View> {
    final /* synthetic */ ArtistPageWithHeaderComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistPageWithHeaderComponentBinder$builder$1(ArtistPageWithHeaderComponentBinder artistPageWithHeaderComponentBinder) {
        super(3);
        this.this$0 = artistPageWithHeaderComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistPageWithHeaderComponent artistPageWithHeaderComponent, Boolean bool) {
        ViewGroup viewGroup2 = viewGroup;
        ArtistPageWithHeaderComponent artistPageWithHeaderComponent2 = artistPageWithHeaderComponent;
        boolean booleanValue = bool.booleanValue();
        h.e(viewGroup2, "parentView");
        h.e(artistPageWithHeaderComponent2, "component");
        View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(C0707R.layout.artist_page_with_header_layout, viewGroup2, booleanValue);
        ArtistPageWithHeaderComponentBinder artistPageWithHeaderComponentBinder = this.this$0;
        Any i = artistPageWithHeaderComponent2.i();
        h.d(i, "component.header");
        ArtistPageWithHeaderComponentBinder.g(artistPageWithHeaderComponentBinder, ((s80) ArtistPageWithHeaderComponentBinder.b(this.this$0).get()).a(i));
        View b = ArtistPageWithHeaderComponentBinder.f(this.this$0).b(viewGroup2, false);
        if (inflate != null) {
            ((CoordinatorLayout) inflate).addView(b);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.artist_page_body_container);
            recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup2.getContext()));
            recyclerView.setAdapter(ArtistPageWithHeaderComponentBinder.a(this.this$0));
            h.d(inflate, "LayoutInflater.from(pare…      }\n                }");
            return inflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
    }
}
