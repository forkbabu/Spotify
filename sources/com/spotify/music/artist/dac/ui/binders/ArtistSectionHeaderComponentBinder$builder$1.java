package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import com.spotify.music.artist.dac.proto.ArtistSectionHeaderComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ArtistSectionHeaderComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, ArtistSectionHeaderComponent, Boolean, View> {
    final /* synthetic */ ArtistSectionHeaderComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArtistSectionHeaderComponentBinder$builder$1(ArtistSectionHeaderComponentBinder artistSectionHeaderComponentBinder) {
        super(3);
        this.this$0 = artistSectionHeaderComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public View c(ViewGroup viewGroup, ArtistSectionHeaderComponent artistSectionHeaderComponent, Boolean bool) {
        bool.booleanValue();
        h.e(viewGroup, "<anonymous parameter 0>");
        h.e(artistSectionHeaderComponent, "<anonymous parameter 1>");
        Component<SectionHeading2.Model, f> make = EncoreConsumerExtensions.sectionHeading2Factory(ArtistSectionHeaderComponentBinder.a(this.this$0).getHeadings()).make();
        ArtistSectionHeaderComponentBinder.f(this.this$0, make);
        return make.getView();
    }
}
