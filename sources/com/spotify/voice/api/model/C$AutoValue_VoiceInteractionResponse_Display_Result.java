package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextTrack;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Display_Result  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Display_Result extends VoiceInteractionResponse.Display.Result {
    private final boolean explicit;
    private final String image;
    private final String navigation;
    private final boolean playing;
    private final String subtitle;
    private final String title;
    private final String uri;

    C$AutoValue_VoiceInteractionResponse_Display_Result(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.title = str;
        this.subtitle = str2;
        this.image = str3;
        this.uri = str4;
        this.navigation = str5;
        this.explicit = z;
        this.playing = z2;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Display.Result)) {
            return false;
        }
        VoiceInteractionResponse.Display.Result result = (VoiceInteractionResponse.Display.Result) obj;
        String str = this.title;
        if (str != null ? str.equals(result.title()) : result.title() == null) {
            String str2 = this.subtitle;
            if (str2 != null ? str2.equals(result.subtitle()) : result.subtitle() == null) {
                String str3 = this.image;
                if (str3 != null ? str3.equals(result.image()) : result.image() == null) {
                    String str4 = this.uri;
                    if (str4 != null ? str4.equals(result.uri()) : result.uri() == null) {
                        String str5 = this.navigation;
                        if (str5 != null ? str5.equals(result.navigation()) : result.navigation() == null) {
                            if (this.explicit == result.explicit() && this.playing == result.playing()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.Result
    @JsonProperty("isExplicit")
    public boolean explicit() {
        return this.explicit;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.image;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.uri;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.navigation;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = 1231;
        int i3 = (((hashCode4 ^ i) * 1000003) ^ (this.explicit ? 1231 : 1237)) * 1000003;
        if (!this.playing) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.Result
    @JsonProperty("imageUrl")
    public String image() {
        return this.image;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.Result
    @JsonProperty("navigationUri")
    public String navigation() {
        return this.navigation;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.Result
    @JsonProperty("isPlaying")
    public boolean playing() {
        return this.playing;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.Result
    @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
    public String subtitle() {
        return this.subtitle;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.Result
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Result{title=");
        V0.append(this.title);
        V0.append(", subtitle=");
        V0.append(this.subtitle);
        V0.append(", image=");
        V0.append(this.image);
        V0.append(", uri=");
        V0.append(this.uri);
        V0.append(", navigation=");
        V0.append(this.navigation);
        V0.append(", explicit=");
        V0.append(this.explicit);
        V0.append(", playing=");
        return je.P0(V0, this.playing, "}");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.Result
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }
}
