package com.spotify.music.features.ads.rx.model;

/* access modifiers changed from: package-private */
public final class AutoValue_RewardAdsRequestBody extends RewardAdsRequestBody {
    private final String format;

    AutoValue_RewardAdsRequestBody(String str) {
        if (str != null) {
            this.format = str;
            return;
        }
        throw new NullPointerException("Null format");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RewardAdsRequestBody) {
            return this.format.equals(((RewardAdsRequestBody) obj).getFormat());
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.rx.model.RewardAdsRequestBody
    public String getFormat() {
        return this.format;
    }

    public int hashCode() {
        return this.format.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("RewardAdsRequestBody{format="), this.format, "}");
    }
}
