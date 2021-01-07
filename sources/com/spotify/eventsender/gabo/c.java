package com.spotify.eventsender.gabo;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.gabo.EventEnvelope;

public final /* synthetic */ class c implements Function {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Pair pair = (Pair) obj;
        EventEnvelope.EventFragment.a l = EventEnvelope.EventFragment.l();
        l.n((String) pair.first);
        l.m((ByteString) pair.second);
        return (EventEnvelope.EventFragment) l.build();
    }
}
