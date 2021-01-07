package com.spotify.music.features.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_SponsorshipAdData extends SponsorshipAdData {
    private final String advertiserName;
    private final String clickThroughUrl;
    private final String clickTrackingUrl;
    private final String creativeId;
    private final String impression;
    private final String lineItemId;
    private final String logoUrl;
    private final String thirdPartyImpression;

    AutoValue_SponsorshipAdData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str != null) {
            this.thirdPartyImpression = str;
            if (str2 != null) {
                this.creativeId = str2;
                if (str3 != null) {
                    this.lineItemId = str3;
                    if (str4 != null) {
                        this.impression = str4;
                        if (str5 != null) {
                            this.logoUrl = str5;
                            if (str6 != null) {
                                this.clickThroughUrl = str6;
                                if (str7 != null) {
                                    this.clickTrackingUrl = str7;
                                    if (str8 != null) {
                                        this.advertiserName = str8;
                                        return;
                                    }
                                    throw new NullPointerException("Null advertiserName");
                                }
                                throw new NullPointerException("Null clickTrackingUrl");
                            }
                            throw new NullPointerException("Null clickThroughUrl");
                        }
                        throw new NullPointerException("Null logoUrl");
                    }
                    throw new NullPointerException("Null impression");
                }
                throw new NullPointerException("Null lineItemId");
            }
            throw new NullPointerException("Null creativeId");
        }
        throw new NullPointerException("Null thirdPartyImpression");
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData
    @JsonProperty("advertiserName")
    public String advertiserName() {
        return this.advertiserName;
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData
    @JsonProperty("clickThrough")
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData
    @JsonProperty("clickTracking")
    public String clickTrackingUrl() {
        return this.clickTrackingUrl;
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData
    @JsonProperty("creativeId")
    public String creativeId() {
        return this.creativeId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SponsorshipAdData)) {
            return false;
        }
        SponsorshipAdData sponsorshipAdData = (SponsorshipAdData) obj;
        if (!this.thirdPartyImpression.equals(sponsorshipAdData.thirdPartyImpression()) || !this.creativeId.equals(sponsorshipAdData.creativeId()) || !this.lineItemId.equals(sponsorshipAdData.lineItemId()) || !this.impression.equals(sponsorshipAdData.impression()) || !this.logoUrl.equals(sponsorshipAdData.logoUrl()) || !this.clickThroughUrl.equals(sponsorshipAdData.clickThroughUrl()) || !this.clickTrackingUrl.equals(sponsorshipAdData.clickTrackingUrl()) || !this.advertiserName.equals(sponsorshipAdData.advertiserName())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((this.thirdPartyImpression.hashCode() ^ 1000003) * 1000003) ^ this.creativeId.hashCode()) * 1000003) ^ this.lineItemId.hashCode()) * 1000003) ^ this.impression.hashCode()) * 1000003) ^ this.logoUrl.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.clickTrackingUrl.hashCode()) * 1000003) ^ this.advertiserName.hashCode();
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData
    @JsonProperty("impression")
    public String impression() {
        return this.impression;
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData
    @JsonProperty("lineItemId")
    public String lineItemId() {
        return this.lineItemId;
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData
    @JsonProperty("logoUrl")
    public String logoUrl() {
        return this.logoUrl;
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData
    @JsonProperty("thirdPartyImpression")
    public String thirdPartyImpression() {
        return this.thirdPartyImpression;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SponsorshipAdData{thirdPartyImpression=");
        V0.append(this.thirdPartyImpression);
        V0.append(", creativeId=");
        V0.append(this.creativeId);
        V0.append(", lineItemId=");
        V0.append(this.lineItemId);
        V0.append(", impression=");
        V0.append(this.impression);
        V0.append(", logoUrl=");
        V0.append(this.logoUrl);
        V0.append(", clickThroughUrl=");
        V0.append(this.clickThroughUrl);
        V0.append(", clickTrackingUrl=");
        V0.append(this.clickTrackingUrl);
        V0.append(", advertiserName=");
        return je.I0(V0, this.advertiserName, "}");
    }
}
