package com.spotify.music.libs.partnerapps.api;

final class AutoValue_PartnerIntegrationsEntry extends PartnerIntegrationsEntry {
    private final String clientId;
    private final boolean isConnected;
    private final String partnerIntegrationId;

    AutoValue_PartnerIntegrationsEntry(boolean z, String str, String str2) {
        this.isConnected = z;
        if (str != null) {
            this.clientId = str;
            if (str2 != null) {
                this.partnerIntegrationId = str2;
                return;
            }
            throw new NullPointerException("Null partnerIntegrationId");
        }
        throw new NullPointerException("Null clientId");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.partnerapps.api.PartnerIntegrationsEntry
    public String clientId() {
        return this.clientId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PartnerIntegrationsEntry)) {
            return false;
        }
        PartnerIntegrationsEntry partnerIntegrationsEntry = (PartnerIntegrationsEntry) obj;
        if (this.isConnected != partnerIntegrationsEntry.isConnected() || !this.clientId.equals(partnerIntegrationsEntry.clientId()) || !this.partnerIntegrationId.equals(partnerIntegrationsEntry.partnerIntegrationId())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.isConnected ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.clientId.hashCode()) * 1000003) ^ this.partnerIntegrationId.hashCode();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.partnerapps.api.PartnerIntegrationsEntry
    public boolean isConnected() {
        return this.isConnected;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.libs.partnerapps.api.PartnerIntegrationsEntry
    public String partnerIntegrationId() {
        return this.partnerIntegrationId;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PartnerIntegrationsEntry{isConnected=");
        V0.append(this.isConnected);
        V0.append(", clientId=");
        V0.append(this.clientId);
        V0.append(", partnerIntegrationId=");
        return je.I0(V0, this.partnerIntegrationId, "}");
    }
}
