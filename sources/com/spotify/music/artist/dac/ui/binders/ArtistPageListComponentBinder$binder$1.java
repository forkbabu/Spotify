package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.music.artist.dac.proto.ArtistPageListComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistPageListComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistPageListComponent, f> {
    final /* synthetic */ ArtistPageListComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistPageListComponentBinder$binder$1(ArtistPageListComponentBinder artistPageListComponentBinder) {
        super(2);
        this.this$0 = artistPageListComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistPageListComponent artistPageListComponent) {
        ArtistPageListComponent artistPageListComponent2 = artistPageListComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistPageListComponent2, "component");
        String i = artistPageListComponent2.i();
        h.d(i, "component.title");
        ArtistPageListComponentBinder.f(this.this$0).render(new SectionHeading2.Model(i, null, 2, null));
        ArtistPageListComponentBinder.a(this.this$0).b0(artistPageListComponent2.h());
        return f.a;
    }
}
