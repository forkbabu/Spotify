package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.List;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Display_DisplayData  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Display_DisplayData extends VoiceInteractionResponse.Display.DisplayData {
    private final VoiceInteractionResponse.Display.DisplayData.DisplayError error;
    private final List<VoiceInteractionResponse.Display.Result> results;
    private final String subtitle;
    private final String title;

    C$AutoValue_VoiceInteractionResponse_Display_DisplayData(String str, String str2, List<VoiceInteractionResponse.Display.Result> list, VoiceInteractionResponse.Display.DisplayData.DisplayError displayError) {
        this.title = str;
        this.subtitle = str2;
        this.results = list;
        this.error = displayError;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Display.DisplayData)) {
            return false;
        }
        VoiceInteractionResponse.Display.DisplayData displayData = (VoiceInteractionResponse.Display.DisplayData) obj;
        String str = this.title;
        if (str != null ? str.equals(displayData.title()) : displayData.title() == null) {
            String str2 = this.subtitle;
            if (str2 != null ? str2.equals(displayData.subtitle()) : displayData.subtitle() == null) {
                List<VoiceInteractionResponse.Display.Result> list = this.results;
                if (list != null ? list.equals(displayData.results()) : displayData.results() == null) {
                    VoiceInteractionResponse.Display.DisplayData.DisplayError displayError = this.error;
                    if (displayError == null) {
                        if (displayData.error() == null) {
                            return true;
                        }
                    } else if (displayError.equals(displayData.error())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.DisplayData
    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public VoiceInteractionResponse.Display.DisplayData.DisplayError error() {
        return this.error;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        List<VoiceInteractionResponse.Display.Result> list = this.results;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        VoiceInteractionResponse.Display.DisplayData.DisplayError displayError = this.error;
        if (displayError != null) {
            i = displayError.hashCode();
        }
        return hashCode3 ^ i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.DisplayData
    @JsonProperty("results")
    public List<VoiceInteractionResponse.Display.Result> results() {
        return this.results;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.DisplayData
    @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
    public String subtitle() {
        return this.subtitle;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display.DisplayData
    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DisplayData{title=");
        V0.append(this.title);
        V0.append(", subtitle=");
        V0.append(this.subtitle);
        V0.append(", results=");
        V0.append(this.results);
        V0.append(", error=");
        V0.append(this.error);
        V0.append("}");
        return V0.toString();
    }
}
