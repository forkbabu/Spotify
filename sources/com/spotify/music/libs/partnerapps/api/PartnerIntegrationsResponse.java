package com.spotify.music.libs.partnerapps.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PartnerIntegrationsResponse implements JacksonModel {
    @JsonCreator
    static PartnerIntegrationsResponse create(@JsonProperty("categoryId") String str, @JsonProperty("partnerIntegrations") List<PartnerIntegrationsEntry> list) {
        return new AutoValue_PartnerIntegrationsResponse(str, list);
    }

    /* access modifiers changed from: package-private */
    public abstract String categoryId();

    /* access modifiers changed from: package-private */
    public abstract List<PartnerIntegrationsEntry> partnerIntegrations();
}
