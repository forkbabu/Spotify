package com.spotify.eventsender.gabo;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.spotify.eventsender.c0;
import com.spotify.eventsender.gabo.EventEnvelope;

public final /* synthetic */ class d implements Function {
    public final /* synthetic */ h a;

    public /* synthetic */ d(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        c0 c0Var = (c0) obj;
        this.a.getClass();
        EventEnvelope.b n = EventEnvelope.n();
        n.n(c0Var.a());
        n.m(FluentIterable.from(c0Var.b()).transform(c.a));
        n.o(c0Var.d());
        n.p(c0Var.e());
        return (EventEnvelope) n.build();
    }
}
