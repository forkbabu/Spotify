package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.ads.model.$AutoValue_CompanionAd  reason: invalid class name */
abstract class C$AutoValue_CompanionAd extends CompanionAd {
    private final int bitrate;
    private final boolean hasDisplay;
    private final int height;
    private final String imageHexId;
    private final boolean lockedRatio;
    private final String mimeType;
    private final boolean scalable;
    private final String url;
    private final int width;

    C$AutoValue_CompanionAd(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str3) {
        this.imageHexId = str;
        this.mimeType = str2;
        this.width = i;
        this.height = i2;
        this.scalable = z;
        this.lockedRatio = z2;
        this.hasDisplay = z3;
        this.bitrate = i3;
        this.url = str3;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompanionAd)) {
            return false;
        }
        CompanionAd companionAd = (CompanionAd) obj;
        String str = this.imageHexId;
        if (str != null ? str.equals(companionAd.getImageHexId()) : companionAd.getImageHexId() == null) {
            String str2 = this.mimeType;
            if (str2 != null ? str2.equals(companionAd.getMimeType()) : companionAd.getMimeType() == null) {
                if (this.width == companionAd.getWidth() && this.height == companionAd.getHeight() && this.scalable == companionAd.isScalable() && this.lockedRatio == companionAd.isLockedRatio() && this.hasDisplay == companionAd.isHasDisplay() && this.bitrate == companionAd.getBitrate()) {
                    String str3 = this.url;
                    if (str3 == null) {
                        if (companionAd.getUrl() == null) {
                            return true;
                        }
                    } else if (str3.equals(companionAd.getUrl())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("bitrate")
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("image_hex_id")
    public String getImageHexId() {
        return this.imageHexId;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("mime_type")
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.imageHexId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mimeType;
        int i2 = 1231;
        int hashCode2 = (((((((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ (this.scalable ? 1231 : 1237)) * 1000003) ^ (this.lockedRatio ? 1231 : 1237)) * 1000003;
        if (!this.hasDisplay) {
            i2 = 1237;
        }
        int i3 = (((hashCode2 ^ i2) * 1000003) ^ this.bitrate) * 1000003;
        String str3 = this.url;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 ^ i;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("has_display")
    public boolean isHasDisplay() {
        return this.hasDisplay;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("locked_ratio")
    public boolean isLockedRatio() {
        return this.lockedRatio;
    }

    @Override // com.spotify.music.features.ads.model.CompanionAd
    @JsonProperty("scalable")
    public boolean isScalable() {
        return this.scalable;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("CompanionAd{imageHexId=");
        V0.append(this.imageHexId);
        V0.append(", mimeType=");
        V0.append(this.mimeType);
        V0.append(", width=");
        V0.append(this.width);
        V0.append(", height=");
        V0.append(this.height);
        V0.append(", scalable=");
        V0.append(this.scalable);
        V0.append(", lockedRatio=");
        V0.append(this.lockedRatio);
        V0.append(", hasDisplay=");
        V0.append(this.hasDisplay);
        V0.append(", bitrate=");
        V0.append(this.bitrate);
        V0.append(", url=");
        return je.I0(V0, this.url, "}");
    }
}
