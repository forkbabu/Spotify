package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.coverart.CoverArt;
import com.spotify.music.artist.dac.proto.ArtistItemComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistItemComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistItemComponent, f> {
    final /* synthetic */ ArtistItemComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistItemComponentBinder$binder$1(ArtistItemComponentBinder artistItemComponentBinder) {
        super(2);
        this.this$0 = artistItemComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistItemComponent artistItemComponent) {
        ArtistItemComponent artistItemComponent2 = artistItemComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistItemComponent2, "artistComponent");
        TextView textView = this.this$0.a;
        if (textView != null) {
            textView.setText(artistItemComponent2.i());
            this.this$0.f().setViewContext(ArtistItemComponentBinder.a(this.this$0));
            this.this$0.f().render(CoverArt.Model.builder(SpotifyIconV2.ARTIST).data(CoverArt.ImageData.create(artistItemComponent2.h())).build());
            this.this$0.f().setOnClickListener(new d(this, artistItemComponent2));
            return f.a;
        }
        h.k("artistName");
        throw null;
    }
}
