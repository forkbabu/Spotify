package com.spotify.music.libs.partnerapps.api;

import java.util.List;

final class AutoValue_PartnerIntegrationsResponse extends PartnerIntegrationsResponse {
    private final String categoryId;
    private final List<PartnerIntegrationsEntry> partnerIntegrations;

    AutoValue_PartnerIntegrationsResponse(String str, List<PartnerIntegrationsEntry> list) {
        if (str != null) {
            this.categoryId = str;
            if (list != null) {
                this.partnerIntegrations = list;
                return;
            }
            throw new NullPointerException("Null partnerIntegrations");
        }
        throw new NullPointerException("Null categoryId");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.partnerapps.api.PartnerIntegrationsResponse
    public String categoryId() {
        return this.categoryId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PartnerIntegrationsResponse)) {
            return false;
        }
        PartnerIntegrationsResponse partnerIntegrationsResponse = (PartnerIntegrationsResponse) obj;
        if (!this.categoryId.equals(partnerIntegrationsResponse.categoryId()) || !this.partnerIntegrations.equals(partnerIntegrationsResponse.partnerIntegrations())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.categoryId.hashCode() ^ 1000003) * 1000003) ^ this.partnerIntegrations.hashCode();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.partnerapps.api.PartnerIntegrationsResponse
    public List<PartnerIntegrationsEntry> partnerIntegrations() {
        return this.partnerIntegrations;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PartnerIntegrationsResponse{categoryId=");
        V0.append(this.categoryId);
        V0.append(", partnerIntegrations=");
        return je.L0(V0, this.partnerIntegrations, "}");
    }
}
