package com.spotify.eventsender.gabo;

import com.google.common.base.Function;
import com.spotify.eventsender.gabo.PublishEventsResponse;

public final /* synthetic */ class a implements Function {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Integer.valueOf(((PublishEventsResponse.EventError) obj).h());
    }
}
