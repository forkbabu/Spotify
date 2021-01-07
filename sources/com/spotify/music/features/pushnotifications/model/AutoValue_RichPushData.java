package com.spotify.music.features.pushnotifications.model;

final class AutoValue_RichPushData extends RichPushData {
    private final RichPushFields fields;
    private final String type;
    private final String version;

    AutoValue_RichPushData(String str, String str2, RichPushFields richPushFields) {
        if (str != null) {
            this.type = str;
            if (str2 != null) {
                this.version = str2;
                if (richPushFields != null) {
                    this.fields = richPushFields;
                    return;
                }
                throw new NullPointerException("Null fields");
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null type");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RichPushData)) {
            return false;
        }
        RichPushData richPushData = (RichPushData) obj;
        if (!this.type.equals(richPushData.getType()) || !this.version.equals(richPushData.getVersion()) || !this.fields.equals(richPushData.getFields())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.pushnotifications.model.RichPushData
    public RichPushFields getFields() {
        return this.fields;
    }

    @Override // com.spotify.music.features.pushnotifications.model.RichPushData
    public String getType() {
        return this.type;
    }

    @Override // com.spotify.music.features.pushnotifications.model.RichPushData
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003) ^ this.fields.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("RichPushData{type=");
        V0.append(this.type);
        V0.append(", version=");
        V0.append(this.version);
        V0.append(", fields=");
        V0.append(this.fields);
        V0.append("}");
        return V0.toString();
    }
}
