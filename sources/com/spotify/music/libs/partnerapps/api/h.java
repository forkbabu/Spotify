package com.spotify.music.libs.partnerapps.api;

import io.reactivex.z;

public interface h {
    @zqf("partner-client-integrations/v1/categories/navigation")
    z<PartnerIntegrationsResponse> a();

    @zqf("partner-client-integrations/v1/categories/voice-assistants")
    z<PartnerIntegrationsResponse> b();
}
