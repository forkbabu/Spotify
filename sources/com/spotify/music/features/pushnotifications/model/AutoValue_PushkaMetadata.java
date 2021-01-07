package com.spotify.music.features.pushnotifications.model;

final class AutoValue_PushkaMetadata extends PushkaMetadata {
    private final String appDeviceId;
    private final String campaignId;
    private final String messageId;

    AutoValue_PushkaMetadata(String str, String str2, String str3) {
        if (str != null) {
            this.messageId = str;
            if (str2 != null) {
                this.campaignId = str2;
                if (str3 != null) {
                    this.appDeviceId = str3;
                    return;
                }
                throw new NullPointerException("Null appDeviceId");
            }
            throw new NullPointerException("Null campaignId");
        }
        throw new NullPointerException("Null messageId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushkaMetadata)) {
            return false;
        }
        PushkaMetadata pushkaMetadata = (PushkaMetadata) obj;
        if (!this.messageId.equals(pushkaMetadata.getMessageId()) || !this.campaignId.equals(pushkaMetadata.getCampaignId()) || !this.appDeviceId.equals(pushkaMetadata.getAppDeviceId())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushkaMetadata
    public String getAppDeviceId() {
        return this.appDeviceId;
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushkaMetadata
    public String getCampaignId() {
        return this.campaignId;
    }

    @Override // com.spotify.music.features.pushnotifications.model.PushkaMetadata
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return ((((this.messageId.hashCode() ^ 1000003) * 1000003) ^ this.campaignId.hashCode()) * 1000003) ^ this.appDeviceId.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PushkaMetadata{messageId=");
        V0.append(this.messageId);
        V0.append(", campaignId=");
        V0.append(this.campaignId);
        V0.append(", appDeviceId=");
        return je.I0(V0, this.appDeviceId, "}");
    }
}
