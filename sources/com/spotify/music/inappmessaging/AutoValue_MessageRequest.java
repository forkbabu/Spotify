package com.spotify.music.inappmessaging;

/* access modifiers changed from: package-private */
public final class AutoValue_MessageRequest extends MessageRequest {
    private static final long serialVersionUID = 1;
    private final String eventId;
    private final String eventName;
    private final String eventVersion;
    private final String feature;

    AutoValue_MessageRequest(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.feature = str;
            if (str2 != null) {
                this.eventName = str2;
                if (str3 != null) {
                    this.eventVersion = str3;
                    this.eventId = null;
                    return;
                }
                throw new NullPointerException("Null eventVersion");
            }
            throw new NullPointerException("Null eventName");
        }
        throw new NullPointerException("Null feature");
    }

    @Override // com.spotify.music.inappmessaging.MessageRequest
    public String b() {
        return this.eventId;
    }

    @Override // com.spotify.music.inappmessaging.MessageRequest
    public String c() {
        return this.eventName;
    }

    @Override // com.spotify.music.inappmessaging.MessageRequest
    public String d() {
        return this.eventVersion;
    }

    @Override // com.spotify.music.inappmessaging.MessageRequest
    public String e() {
        return this.feature;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageRequest)) {
            return false;
        }
        MessageRequest messageRequest = (MessageRequest) obj;
        if (this.feature.equals(messageRequest.e()) && this.eventName.equals(messageRequest.c()) && this.eventVersion.equals(messageRequest.d())) {
            String str = this.eventId;
            if (str == null) {
                if (messageRequest.b() == null) {
                    return true;
                }
            } else if (str.equals(messageRequest.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((((this.feature.hashCode() ^ 1000003) * 1000003) ^ this.eventName.hashCode()) * 1000003) ^ this.eventVersion.hashCode()) * 1000003;
        String str = this.eventId;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("MessageRequest{feature=");
        V0.append(this.feature);
        V0.append(", eventName=");
        V0.append(this.eventName);
        V0.append(", eventVersion=");
        V0.append(this.eventVersion);
        V0.append(", eventId=");
        return je.I0(V0, this.eventId, "}");
    }
}
