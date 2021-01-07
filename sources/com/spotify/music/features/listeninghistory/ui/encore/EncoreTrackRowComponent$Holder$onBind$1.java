package com.spotify.music.features.listeninghistory.ui.encore;

import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.music.features.listeninghistory.ui.encore.EncoreTrackRowComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EncoreTrackRowComponent$Holder$onBind$1 extends Lambda implements nmf<TrackRow.Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ EncoreTrackRowComponent.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EncoreTrackRowComponent$Holder$onBind$1(EncoreTrackRowComponent.Holder holder, s81 s81) {
        super(1);
        this.this$0 = holder;
        this.$data = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(TrackRow.Events events) {
        TrackRow.Events events2 = events;
        h.e(events2, "event");
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            EncoreTrackRowComponent.Holder.C(this.this$0).c(this.$data);
        } else if (ordinal == 2) {
            EncoreTrackRowComponent.Holder.C(this.this$0).a(this.$data);
        }
        return f.a;
    }
}
