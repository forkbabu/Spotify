package com.spotify.eventsender.gabo;

import retrofit2.b;

/* access modifiers changed from: package-private */
public interface f {
    @erf({"No-Webgate-Authentication: true"})
    @irf("gabo-receiver-service/public/v3/events")
    b<PublishEventsResponse> a(@uqf PublishEventsRequest publishEventsRequest);

    @irf("gabo-receiver-service/v3/events")
    b<PublishEventsResponse> b(@uqf PublishEventsRequest publishEventsRequest);
}
