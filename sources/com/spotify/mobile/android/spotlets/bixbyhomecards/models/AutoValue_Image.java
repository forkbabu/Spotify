package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image;

final class AutoValue_Image extends Image {
    private final int height;
    private final String url;
    private final int width;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Image.Builder {
        private Integer height;
        private String url;
        private Integer width;

        Builder() {
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image.Builder
        public Image build() {
            String str = this.url == null ? " url" : "";
            if (this.height == null) {
                str = je.x0(str, " height");
            }
            if (this.width == null) {
                str = je.x0(str, " width");
            }
            if (str.isEmpty()) {
                return new AutoValue_Image(this.url, this.height.intValue(), this.width.intValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image.Builder
        public Image.Builder height(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image.Builder
        public Image.Builder url(String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            throw new NullPointerException("Null url");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image.Builder
        public Image.Builder width(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        if (this.url.equals(image.url()) && this.height == image.height() && this.width == image.width()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.url.hashCode() ^ 1000003) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image
    @JsonProperty("height")
    public int height() {
        return this.height;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Image{url=");
        V0.append(this.url);
        V0.append(", height=");
        V0.append(this.height);
        V0.append(", width=");
        return je.B0(V0, this.width, "}");
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image
    @JsonProperty("url")
    public String url() {
        return this.url;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Image
    @JsonProperty("width")
    public int width() {
        return this.width;
    }

    private AutoValue_Image(String str, int i, int i2) {
        this.url = str;
        this.height = i;
        this.width = i2;
    }
}
