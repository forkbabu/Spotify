package com.spotify.eventsender.gabo;

import com.google.common.base.Predicate;
import com.spotify.eventsender.gabo.PublishEventsResponse;

public final /* synthetic */ class b implements Predicate {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((PublishEventsResponse.EventError) obj).i();
    }
}
