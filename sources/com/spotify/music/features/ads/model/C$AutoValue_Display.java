package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.ads.model.$AutoValue_Display  reason: invalid class name */
abstract class C$AutoValue_Display extends Display {
    private final String displayMedia;
    private final int getHeight;
    private final int getWidth;

    C$AutoValue_Display(int i, int i2, String str) {
        this.getWidth = i;
        this.getHeight = i2;
        this.displayMedia = str;
    }

    @Override // com.spotify.music.features.ads.model.Display
    @JsonProperty("media")
    public String displayMedia() {
        return this.displayMedia;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Display)) {
            return false;
        }
        Display display = (Display) obj;
        if (this.getWidth == display.getWidth() && this.getHeight == display.getHeight()) {
            String str = this.displayMedia;
            if (str == null) {
                if (display.displayMedia() == null) {
                    return true;
                }
            } else if (str.equals(display.displayMedia())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.model.Display
    @JsonProperty("height")
    public int getHeight() {
        return this.getHeight;
    }

    @Override // com.spotify.music.features.ads.model.Display
    @JsonProperty("width")
    public int getWidth() {
        return this.getWidth;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = (((this.getWidth ^ 1000003) * 1000003) ^ this.getHeight) * 1000003;
        String str = this.displayMedia;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Display{getWidth=");
        V0.append(this.getWidth);
        V0.append(", getHeight=");
        V0.append(this.getHeight);
        V0.append(", displayMedia=");
        return je.I0(V0, this.displayMedia, "}");
    }
}
