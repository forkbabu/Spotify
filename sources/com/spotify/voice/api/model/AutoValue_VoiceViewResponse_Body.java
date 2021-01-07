package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse;

final class AutoValue_VoiceViewResponse_Body extends VoiceViewResponse.Body {
    private final VoiceViewResponse.Body.Custom custom;
    private final VoiceViewResponse.Body.Images images;
    private final VoiceViewResponse.Body.Target target;
    private final VoiceViewResponse.Body.Text text;

    AutoValue_VoiceViewResponse_Body(VoiceViewResponse.Body.Text text2, VoiceViewResponse.Body.Target target2, VoiceViewResponse.Body.Images images2, VoiceViewResponse.Body.Custom custom2) {
        this.text = text2;
        this.target = target2;
        this.images = images2;
        this.custom = custom2;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body
    @JsonProperty("custom")
    public VoiceViewResponse.Body.Custom custom() {
        return this.custom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse.Body)) {
            return false;
        }
        VoiceViewResponse.Body body = (VoiceViewResponse.Body) obj;
        VoiceViewResponse.Body.Text text2 = this.text;
        if (text2 != null ? text2.equals(body.text()) : body.text() == null) {
            VoiceViewResponse.Body.Target target2 = this.target;
            if (target2 != null ? target2.equals(body.target()) : body.target() == null) {
                VoiceViewResponse.Body.Images images2 = this.images;
                if (images2 != null ? images2.equals(body.images()) : body.images() == null) {
                    VoiceViewResponse.Body.Custom custom2 = this.custom;
                    if (custom2 == null) {
                        if (body.custom() == null) {
                            return true;
                        }
                    } else if (custom2.equals(body.custom())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        VoiceViewResponse.Body.Text text2 = this.text;
        int i = 0;
        int hashCode = ((text2 == null ? 0 : text2.hashCode()) ^ 1000003) * 1000003;
        VoiceViewResponse.Body.Target target2 = this.target;
        int hashCode2 = (hashCode ^ (target2 == null ? 0 : target2.hashCode())) * 1000003;
        VoiceViewResponse.Body.Images images2 = this.images;
        int hashCode3 = (hashCode2 ^ (images2 == null ? 0 : images2.hashCode())) * 1000003;
        VoiceViewResponse.Body.Custom custom2 = this.custom;
        if (custom2 != null) {
            i = custom2.hashCode();
        }
        return hashCode3 ^ i;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body
    @JsonProperty("images")
    public VoiceViewResponse.Body.Images images() {
        return this.images;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body
    @JsonProperty("target")
    public VoiceViewResponse.Body.Target target() {
        return this.target;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body
    @JsonProperty("text")
    public VoiceViewResponse.Body.Text text() {
        return this.text;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Body{text=");
        V0.append(this.text);
        V0.append(", target=");
        V0.append(this.target);
        V0.append(", images=");
        V0.append(this.images);
        V0.append(", custom=");
        V0.append(this.custom);
        V0.append("}");
        return V0.toString();
    }
}
