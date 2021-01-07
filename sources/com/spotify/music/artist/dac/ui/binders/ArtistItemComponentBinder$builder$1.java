package com.spotify.music.artist.dac.ui.binders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;
import com.spotify.music.C0707R;
import com.spotify.music.artist.dac.proto.ArtistItemComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistItemComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistItemComponent, Boolean, View> {
    final /* synthetic */ ArtistItemComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistItemComponentBinder$builder$1(ArtistItemComponentBinder artistItemComponentBinder) {
        super(3);
        this.this$0 = artistItemComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistItemComponent artistItemComponent, Boolean bool) {
        ViewGroup viewGroup2 = viewGroup;
        boolean booleanValue = bool.booleanValue();
        h.e(viewGroup2, "parent");
        h.e(artistItemComponent, "<anonymous parameter 1>");
        View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(C0707R.layout.artist_view, viewGroup2, booleanValue);
        ArtistItemComponentBinder artistItemComponentBinder = this.this$0;
        View findViewById = inflate.findViewById(C0707R.id.artist_name);
        h.d(findViewById, "findViewById(R.id.artist_name)");
        TextView textView = (TextView) findViewById;
        artistItemComponentBinder.getClass();
        h.e(textView, "<set-?>");
        artistItemComponentBinder.a = textView;
        ArtistItemComponentBinder artistItemComponentBinder2 = this.this$0;
        View findViewById2 = inflate.findViewById(C0707R.id.artist_image);
        h.d(findViewById2, "findViewById(R.id.artist_image)");
        CoverArtView coverArtView = (CoverArtView) findViewById2;
        artistItemComponentBinder2.getClass();
        h.e(coverArtView, "<set-?>");
        artistItemComponentBinder2.b = coverArtView;
        h.d(inflate, "LayoutInflater.from(pare…d.artist_image)\n        }");
        return inflate;
    }
}
