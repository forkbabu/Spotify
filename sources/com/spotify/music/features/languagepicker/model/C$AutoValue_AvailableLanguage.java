package com.spotify.music.features.languagepicker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.languagepicker.model.$AutoValue_AvailableLanguage  reason: invalid class name */
abstract class C$AutoValue_AvailableLanguage extends AvailableLanguage {
    private final String bcp47;
    private final String imageUri;
    private final String name;

    C$AutoValue_AvailableLanguage(String str, String str2, String str3) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.imageUri = str2;
                if (str3 != null) {
                    this.bcp47 = str3;
                    return;
                }
                throw new NullPointerException("Null bcp47");
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.spotify.music.features.languagepicker.model.AvailableLanguage
    @JsonProperty("bcp47")
    public String bcp47() {
        return this.bcp47;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailableLanguage)) {
            return false;
        }
        AvailableLanguage availableLanguage = (AvailableLanguage) obj;
        if (!this.name.equals(availableLanguage.name()) || !this.imageUri.equals(availableLanguage.imageUri()) || !this.bcp47.equals(availableLanguage.bcp47())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.imageUri.hashCode()) * 1000003) ^ this.bcp47.hashCode();
    }

    @Override // com.spotify.music.features.languagepicker.model.AvailableLanguage
    @JsonProperty("imageUri")
    public String imageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.music.features.languagepicker.model.AvailableLanguage
    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AvailableLanguage{name=");
        V0.append(this.name);
        V0.append(", imageUri=");
        V0.append(this.imageUri);
        V0.append(", bcp47=");
        return je.I0(V0, this.bcp47, "}");
    }
}
