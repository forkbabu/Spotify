package com.spotify.music.libs.partnerapps.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class PartnerIntegrationsEntry implements JacksonModel {
    PartnerIntegrationsEntry() {
    }

    @JsonCreator
    static PartnerIntegrationsEntry create(@JsonProperty("isConnected") boolean z, @JsonProperty("clientId") String str, @JsonProperty("partnerIntegrationId") String str2) {
        return new AutoValue_PartnerIntegrationsEntry(z, str, str2);
    }

    /* access modifiers changed from: package-private */
    public abstract String clientId();

    /* access modifiers changed from: package-private */
    public abstract boolean isConnected();

    /* access modifiers changed from: package-private */
    public abstract String partnerIntegrationId();
}
