package com.spotify.music.features.listeninghistory.ui.encore;

import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EntityBaseHolder$onBind$1 extends Lambda implements nmf<Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ EntityBaseHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EntityBaseHolder$onBind$1(EntityBaseHolder entityBaseHolder, s81 s81) {
        super(1);
        this.this$0 = entityBaseHolder;
        this.$data = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Events events) {
        Events events2 = events;
        h.e(events2, "event");
        int ordinal = events2.ordinal();
        if (ordinal == 0) {
            EntityBaseHolder.B(this.this$0).c(this.$data);
        } else if (ordinal == 1) {
            EntityBaseHolder.B(this.this$0).a(this.$data);
        }
        return f.a;
    }
}
