package com.spotify.music.feedback;

final class AutoValue_FeedbackResponse extends FeedbackResponse {
    private final String contextUri;
    private final String entityUri;
    private final String feature;
    private final String feedbackUrl;
    private final String intention;
    private final String reason;
    private final String type;

    AutoValue_FeedbackResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (str != null) {
            this.entityUri = str;
            if (str2 != null) {
                this.contextUri = str2;
                this.reason = str3;
                this.feedbackUrl = str4;
                this.feature = str5;
                if (str6 != null) {
                    this.intention = str6;
                    this.type = str7;
                    return;
                }
                throw new NullPointerException("Null intention");
            }
            throw new NullPointerException("Null contextUri");
        }
        throw new NullPointerException("Null entityUri");
    }

    @Override // com.spotify.music.feedback.FeedbackResponse
    public String contextUri() {
        return this.contextUri;
    }

    @Override // com.spotify.music.feedback.FeedbackResponse
    public String entityUri() {
        return this.entityUri;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedbackResponse)) {
            return false;
        }
        FeedbackResponse feedbackResponse = (FeedbackResponse) obj;
        if (this.entityUri.equals(feedbackResponse.entityUri()) && this.contextUri.equals(feedbackResponse.contextUri()) && ((str = this.reason) != null ? str.equals(feedbackResponse.reason()) : feedbackResponse.reason() == null) && ((str2 = this.feedbackUrl) != null ? str2.equals(feedbackResponse.feedbackUrl()) : feedbackResponse.feedbackUrl() == null) && ((str3 = this.feature) != null ? str3.equals(feedbackResponse.feature()) : feedbackResponse.feature() == null) && this.intention.equals(feedbackResponse.intention())) {
            String str4 = this.type;
            if (str4 == null) {
                if (feedbackResponse.type() == null) {
                    return true;
                }
            } else if (str4.equals(feedbackResponse.type())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.feedback.FeedbackResponse
    public String feature() {
        return this.feature;
    }

    @Override // com.spotify.music.feedback.FeedbackResponse
    public String feedbackUrl() {
        return this.feedbackUrl;
    }

    public int hashCode() {
        int hashCode = (((this.entityUri.hashCode() ^ 1000003) * 1000003) ^ this.contextUri.hashCode()) * 1000003;
        String str = this.reason;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.feedbackUrl;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.feature;
        int hashCode4 = (((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.intention.hashCode()) * 1000003;
        String str4 = this.type;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 ^ i;
    }

    @Override // com.spotify.music.feedback.FeedbackResponse
    public String intention() {
        return this.intention;
    }

    @Override // com.spotify.music.feedback.FeedbackResponse
    public String reason() {
        return this.reason;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FeedbackResponse{entityUri=");
        V0.append(this.entityUri);
        V0.append(", contextUri=");
        V0.append(this.contextUri);
        V0.append(", reason=");
        V0.append(this.reason);
        V0.append(", feedbackUrl=");
        V0.append(this.feedbackUrl);
        V0.append(", feature=");
        V0.append(this.feature);
        V0.append(", intention=");
        V0.append(this.intention);
        V0.append(", type=");
        return je.I0(V0, this.type, "}");
    }

    @Override // com.spotify.music.feedback.FeedbackResponse
    public String type() {
        return this.type;
    }
}
