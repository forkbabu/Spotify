package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextTrack;
import com.spotify.voice.api.model.VoiceViewResponse;

final class AutoValue_VoiceViewResponse_Body_Text extends VoiceViewResponse.Body.Text {
    private final String subtitle;
    private final String title;

    AutoValue_VoiceViewResponse_Body_Text(String str, String str2) {
        this.title = str;
        this.subtitle = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse.Body.Text)) {
            return false;
        }
        VoiceViewResponse.Body.Text text = (VoiceViewResponse.Body.Text) obj;
        String str = this.title;
        if (str != null ? str.equals(text.title()) : text.title() == null) {
            String str2 = this.subtitle;
            if (str2 == null) {
                if (text.subtitle() == null) {
                    return true;
                }
            } else if (str2.equals(text.subtitle())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.subtitle;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body.Text
    @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
    public String subtitle() {
        return this.subtitle;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Body.Text
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Text{title=");
        V0.append(this.title);
        V0.append(", subtitle=");
        return je.I0(V0, this.subtitle, "}");
    }
}
