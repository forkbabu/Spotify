package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.music.artist.dac.proto.ArtistPageWithHeaderComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPageWithHeaderComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistPageWithHeaderComponent, f> {
    final /* synthetic */ ArtistPageWithHeaderComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistPageWithHeaderComponentBinder$binder$1(ArtistPageWithHeaderComponentBinder artistPageWithHeaderComponentBinder) {
        super(2);
        this.this$0 = artistPageWithHeaderComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistPageWithHeaderComponent artistPageWithHeaderComponent) {
        ArtistPageWithHeaderComponent artistPageWithHeaderComponent2 = artistPageWithHeaderComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistPageWithHeaderComponent2, "component");
        ArtistPageWithHeaderComponentBinder.f(this.this$0).c();
        ArtistPageWithHeaderComponentBinder.a(this.this$0).b0(artistPageWithHeaderComponent2.h());
        return f.a;
    }
}
