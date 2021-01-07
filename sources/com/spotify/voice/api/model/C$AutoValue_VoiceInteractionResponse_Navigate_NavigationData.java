package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Navigate_NavigationData  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Navigate_NavigationData extends VoiceInteractionResponse.Navigate.NavigationData {
    private final VoiceInteractionResponse.Navigate.NavigationData.Target target;
    private final String uri;

    C$AutoValue_VoiceInteractionResponse_Navigate_NavigationData(String str, VoiceInteractionResponse.Navigate.NavigationData.Target target2) {
        this.uri = str;
        this.target = target2;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Navigate.NavigationData)) {
            return false;
        }
        VoiceInteractionResponse.Navigate.NavigationData navigationData = (VoiceInteractionResponse.Navigate.NavigationData) obj;
        String str = this.uri;
        if (str != null ? str.equals(navigationData.uri()) : navigationData.uri() == null) {
            VoiceInteractionResponse.Navigate.NavigationData.Target target2 = this.target;
            if (target2 == null) {
                if (navigationData.target() == null) {
                    return true;
                }
            } else if (target2.equals(navigationData.target())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        VoiceInteractionResponse.Navigate.NavigationData.Target target2 = this.target;
        if (target2 != null) {
            i = target2.hashCode();
        }
        return hashCode ^ i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Navigate.NavigationData
    @JsonProperty("target")
    public VoiceInteractionResponse.Navigate.NavigationData.Target target() {
        return this.target;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("NavigationData{uri=");
        V0.append(this.uri);
        V0.append(", target=");
        V0.append(this.target);
        V0.append("}");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Navigate.NavigationData
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }
}
