package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.music.artist.dac.proto.ArtistSectionHeaderComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistSectionHeaderComponentBinder$binder$1 extends Lambda implements rmf<View, ArtistSectionHeaderComponent, f> {
    final /* synthetic */ ArtistSectionHeaderComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistSectionHeaderComponentBinder$binder$1(ArtistSectionHeaderComponentBinder artistSectionHeaderComponentBinder) {
        super(2);
        this.this$0 = artistSectionHeaderComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, ArtistSectionHeaderComponent artistSectionHeaderComponent) {
        ArtistSectionHeaderComponent artistSectionHeaderComponent2 = artistSectionHeaderComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(artistSectionHeaderComponent2, "component");
        String h = artistSectionHeaderComponent2.h();
        h.d(h, "component.title");
        ArtistSectionHeaderComponentBinder.b(this.this$0).render(new SectionHeading2.Model(h, null, 2, null));
        return f.a;
    }
}
