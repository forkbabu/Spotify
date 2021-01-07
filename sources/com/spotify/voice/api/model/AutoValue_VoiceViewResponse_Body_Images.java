package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse;

final class AutoValue_VoiceViewResponse_Body_Images extends VoiceViewResponse.Body.Images {
    private final VoiceViewResponse.Body.Images.Image main;

    AutoValue_VoiceViewResponse_Body_Images(VoiceViewResponse.Body.Images.Image image) {
        this.main = image;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse.Body.Images)) {
            return false;
        }
        VoiceViewResponse.Body.Images.Image image = this.main;
        VoiceViewResponse.Body.Images.Image main2 = ((VoiceViewResponse.Body.Images) obj).main();
        if (image != null) {
            return image.equals(main2);
        }
        if (main2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        VoiceViewResponse.Body.Images.Image image = this.main;
        return (image == null ? 0 : image.hashCode()) ^ 1000003;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body.Images
    @JsonProperty("main")
    public VoiceViewResponse.Body.Images.Image main() {
        return this.main;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Images{main=");
        V0.append(this.main);
        V0.append("}");
        return V0.toString();
    }
}
