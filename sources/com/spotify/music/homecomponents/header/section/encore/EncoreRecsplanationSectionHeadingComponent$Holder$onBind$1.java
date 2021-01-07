package com.spotify.music.homecomponents.header.section.encore;

import com.spotify.encore.consumer.components.home.api.recsplanationsectionheading.RecsplanationSectionHeading;
import com.spotify.music.homecomponents.header.section.encore.EncoreRecsplanationSectionHeadingComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EncoreRecsplanationSectionHeadingComponent$Holder$onBind$1 extends Lambda implements nmf<RecsplanationSectionHeading.Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ EncoreRecsplanationSectionHeadingComponent.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EncoreRecsplanationSectionHeadingComponent$Holder$onBind$1(EncoreRecsplanationSectionHeadingComponent.Holder holder, s81 s81) {
        super(1);
        this.this$0 = holder;
        this.$data = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(RecsplanationSectionHeading.Events events) {
        h.e(events, "it");
        EncoreRecsplanationSectionHeadingComponent.Holder.B(this.this$0).a(this.$data);
        return f.a;
    }
}
