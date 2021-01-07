package com.spotify.voice.external.experience.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.voice.external.experience.domain.model.ThingViewResponse;

/* renamed from: com.spotify.voice.external.experience.domain.model.$AutoValue_ThingViewResponse_Custom  reason: invalid class name */
abstract class C$AutoValue_ThingViewResponse_Custom extends ThingViewResponse.Custom {
    private final String error;
    private final PlayerContext playerContext;
    private final String query;
    private final String rawIntent;
    private final ThingViewResponse.Custom.Restriction restriction;
    private final ThingViewResponse.Custom.Slots slots;
    private final String ttsUrl;
    private final Integer volumeLevel;

    C$AutoValue_ThingViewResponse_Custom(String str, ThingViewResponse.Custom.Slots slots2, String str2, PlayerContext playerContext2, ThingViewResponse.Custom.Restriction restriction2, String str3, String str4, Integer num) {
        this.rawIntent = str;
        this.slots = slots2;
        this.query = str2;
        this.playerContext = playerContext2;
        this.restriction = restriction2;
        this.error = str3;
        this.ttsUrl = str4;
        this.volumeLevel = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThingViewResponse.Custom)) {
            return false;
        }
        ThingViewResponse.Custom custom = (ThingViewResponse.Custom) obj;
        String str = this.rawIntent;
        if (str != null ? str.equals(custom.rawIntent()) : custom.rawIntent() == null) {
            ThingViewResponse.Custom.Slots slots2 = this.slots;
            if (slots2 != null ? slots2.equals(custom.slots()) : custom.slots() == null) {
                String str2 = this.query;
                if (str2 != null ? str2.equals(custom.query()) : custom.query() == null) {
                    PlayerContext playerContext2 = this.playerContext;
                    if (playerContext2 != null ? playerContext2.equals(custom.playerContext()) : custom.playerContext() == null) {
                        ThingViewResponse.Custom.Restriction restriction2 = this.restriction;
                        if (restriction2 != null ? restriction2.equals(custom.restriction()) : custom.restriction() == null) {
                            String str3 = this.error;
                            if (str3 != null ? str3.equals(custom.error()) : custom.error() == null) {
                                String str4 = this.ttsUrl;
                                if (str4 != null ? str4.equals(custom.ttsUrl()) : custom.ttsUrl() == null) {
                                    Integer num = this.volumeLevel;
                                    if (num == null) {
                                        if (custom.volumeLevel() == null) {
                                            return true;
                                        }
                                    } else if (num.equals(custom.volumeLevel())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public String error() {
        return this.error;
    }

    public int hashCode() {
        String str = this.rawIntent;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        ThingViewResponse.Custom.Slots slots2 = this.slots;
        int hashCode2 = (hashCode ^ (slots2 == null ? 0 : slots2.hashCode())) * 1000003;
        String str2 = this.query;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        PlayerContext playerContext2 = this.playerContext;
        int hashCode4 = (hashCode3 ^ (playerContext2 == null ? 0 : playerContext2.hashCode())) * 1000003;
        ThingViewResponse.Custom.Restriction restriction2 = this.restriction;
        int hashCode5 = (hashCode4 ^ (restriction2 == null ? 0 : restriction2.hashCode())) * 1000003;
        String str3 = this.error;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.ttsUrl;
        int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Integer num = this.volumeLevel;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode7 ^ i;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
    @JsonProperty("context")
    public PlayerContext playerContext() {
        return this.playerContext;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
    @JsonProperty("query")
    public String query() {
        return this.query;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
    @JsonProperty("intent")
    public String rawIntent() {
        return this.rawIntent;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
    @JsonProperty("restriction")
    public ThingViewResponse.Custom.Restriction restriction() {
        return this.restriction;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
    @JsonProperty("slots")
    public ThingViewResponse.Custom.Slots slots() {
        return this.slots;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Custom{rawIntent=");
        V0.append(this.rawIntent);
        V0.append(", slots=");
        V0.append(this.slots);
        V0.append(", query=");
        V0.append(this.query);
        V0.append(", playerContext=");
        V0.append(this.playerContext);
        V0.append(", restriction=");
        V0.append(this.restriction);
        V0.append(", error=");
        V0.append(this.error);
        V0.append(", ttsUrl=");
        V0.append(this.ttsUrl);
        V0.append(", volumeLevel=");
        V0.append(this.volumeLevel);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
    @JsonProperty("ttsUrl")
    public String ttsUrl() {
        return this.ttsUrl;
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
    @JsonProperty("volume_level")
    public Integer volumeLevel() {
        return this.volumeLevel;
    }
}
