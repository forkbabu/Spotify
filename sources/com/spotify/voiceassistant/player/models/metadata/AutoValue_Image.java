package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.Image;

final class AutoValue_Image extends Image {
    private final Optional<Integer> height;
    private final Optional<String> url;
    private final Optional<Integer> width;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Image.Builder {
        private Optional<Integer> height = Optional.absent();
        private Optional<String> url = Optional.absent();
        private Optional<Integer> width = Optional.absent();

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Image.Builder
        public Image build() {
            return new AutoValue_Image(this.url, this.width, this.height);
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Image.Builder
        public Image.Builder setHeight(Integer num) {
            this.height = Optional.of(num);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Image.Builder
        public Image.Builder setUrl(String str) {
            this.url = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Image.Builder
        public Image.Builder setWidth(Integer num) {
            this.width = Optional.of(num);
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
        if (!this.url.equals(image.getUrl()) || !this.width.equals(image.getWidth()) || !this.height.equals(image.getHeight())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Image
    @JsonProperty("height")
    public Optional<Integer> getHeight() {
        return this.height;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Image
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return this.url;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Image
    @JsonProperty("width")
    public Optional<Integer> getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((this.url.hashCode() ^ 1000003) * 1000003) ^ this.width.hashCode()) * 1000003) ^ this.height.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Image{url=");
        V0.append(this.url);
        V0.append(", width=");
        V0.append(this.width);
        V0.append(", height=");
        return je.F0(V0, this.height, "}");
    }

    private AutoValue_Image(Optional<String> optional, Optional<Integer> optional2, Optional<Integer> optional3) {
        this.url = optional;
        this.width = optional2;
        this.height = optional3;
    }
}
