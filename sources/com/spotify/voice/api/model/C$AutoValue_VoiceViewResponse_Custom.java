package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.voice.api.model.VoiceViewResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceViewResponse_Custom  reason: invalid class name */
abstract class C$AutoValue_VoiceViewResponse_Custom extends VoiceViewResponse.Custom {
    private final String error;
    private final String friendlyError;
    private final String query;
    private final String rawIntent;
    private final VoiceViewResponse.Custom.Restriction restriction;
    private final String ttsUrl;

    C$AutoValue_VoiceViewResponse_Custom(String str, String str2, VoiceViewResponse.Custom.Restriction restriction2, String str3, String str4, String str5) {
        this.rawIntent = str;
        this.query = str2;
        this.restriction = restriction2;
        this.friendlyError = str3;
        this.error = str4;
        this.ttsUrl = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceViewResponse.Custom)) {
            return false;
        }
        VoiceViewResponse.Custom custom = (VoiceViewResponse.Custom) obj;
        String str = this.rawIntent;
        if (str != null ? str.equals(custom.rawIntent()) : custom.rawIntent() == null) {
            String str2 = this.query;
            if (str2 != null ? str2.equals(custom.query()) : custom.query() == null) {
                VoiceViewResponse.Custom.Restriction restriction2 = this.restriction;
                if (restriction2 != null ? restriction2.equals(custom.restriction()) : custom.restriction() == null) {
                    String str3 = this.friendlyError;
                    if (str3 != null ? str3.equals(custom.friendlyError()) : custom.friendlyError() == null) {
                        String str4 = this.error;
                        if (str4 != null ? str4.equals(custom.error()) : custom.error() == null) {
                            String str5 = this.ttsUrl;
                            if (str5 == null) {
                                if (custom.ttsUrl() == null) {
                                    return true;
                                }
                            } else if (str5.equals(custom.ttsUrl())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom
    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public String error() {
        return this.error;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom
    @JsonProperty("friendlyError")
    public String friendlyError() {
        return this.friendlyError;
    }

    public int hashCode() {
        String str = this.rawIntent;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.query;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        VoiceViewResponse.Custom.Restriction restriction2 = this.restriction;
        int hashCode3 = (hashCode2 ^ (restriction2 == null ? 0 : restriction2.hashCode())) * 1000003;
        String str3 = this.friendlyError;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.error;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.ttsUrl;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom
    @JsonProperty("query")
    public String query() {
        return this.query;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom
    @JsonProperty("intent")
    public String rawIntent() {
        return this.rawIntent;
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom
    @JsonProperty("restriction")
    public VoiceViewResponse.Custom.Restriction restriction() {
        return this.restriction;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Custom{rawIntent=");
        V0.append(this.rawIntent);
        V0.append(", query=");
        V0.append(this.query);
        V0.append(", restriction=");
        V0.append(this.restriction);
        V0.append(", friendlyError=");
        V0.append(this.friendlyError);
        V0.append(", error=");
        V0.append(this.error);
        V0.append(", ttsUrl=");
        return je.I0(V0, this.ttsUrl, "}");
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom
    @JsonProperty("ttsUrl")
    public String ttsUrl() {
        return this.ttsUrl;
    }
}
