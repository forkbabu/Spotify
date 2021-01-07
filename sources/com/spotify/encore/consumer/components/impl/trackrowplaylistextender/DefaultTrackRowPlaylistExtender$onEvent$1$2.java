package com.spotify.encore.consumer.components.impl.trackrowplaylistextender;

import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DefaultTrackRowPlaylistExtender$onEvent$1$2 extends FunctionReferenceImpl implements nmf<Events, f> {
    DefaultTrackRowPlaylistExtender$onEvent$1$2(nmf nmf) {
        super(1, nmf, nmf.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(Events events) {
        invoke(events);
        return f.a;
    }

    public final void invoke(Events events) {
        h.e(events, "p1");
        ((nmf) this.receiver).invoke(events);
    }
}
