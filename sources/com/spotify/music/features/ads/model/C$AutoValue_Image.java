package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.ads.model.$AutoValue_Image  reason: invalid class name */
abstract class C$AutoValue_Image extends Image {
    private final String url;

    C$AutoValue_Image(String str) {
        this.url = str;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        String str = this.url;
        String url2 = ((Image) obj).getUrl();
        if (str != null) {
            return str.equals(url2);
        }
        if (url2 == null) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.model.Image
    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.url;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.I0(je.V0("Image{url="), this.url, "}");
    }
}
