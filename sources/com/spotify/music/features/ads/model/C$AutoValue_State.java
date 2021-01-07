package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.ads.model.$AutoValue_State  reason: invalid class name */
abstract class C$AutoValue_State extends State {
    private final AdBreakState adBreakState;
    private final String adId;
    private final String adSlotId;
    private final boolean adsEnabled;
    private final String appStartupId;
    private final i pendingAds;
    private final String streamTimeInMs;

    C$AutoValue_State(boolean z, String str, AdBreakState adBreakState2, String str2, String str3, i iVar, String str4) {
        this.adsEnabled = z;
        this.appStartupId = str;
        if (adBreakState2 != null) {
            this.adBreakState = adBreakState2;
            this.adSlotId = str2;
            this.adId = str3;
            this.pendingAds = iVar;
            this.streamTimeInMs = str4;
            return;
        }
        throw new NullPointerException("Null adBreakState");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        i iVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        if (this.adsEnabled == state.isAdsEnabled() && ((str = this.appStartupId) != null ? str.equals(state.getAppStartupId()) : state.getAppStartupId() == null) && this.adBreakState.equals(state.getAdBreakState()) && ((str2 = this.adSlotId) != null ? str2.equals(state.getAdSlotId()) : state.getAdSlotId() == null) && ((str3 = this.adId) != null ? str3.equals(state.getAdId()) : state.getAdId() == null) && ((iVar = this.pendingAds) != null ? iVar.equals(state.getPendingAds()) : state.getPendingAds() == null)) {
            String str4 = this.streamTimeInMs;
            if (str4 == null) {
                if (state.getStreamTimeInMs() == null) {
                    return true;
                }
            } else if (str4.equals(state.getStreamTimeInMs())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.ads.model.State
    @JsonProperty("ad_break_state")
    public AdBreakState getAdBreakState() {
        return this.adBreakState;
    }

    @Override // com.spotify.music.features.ads.model.State
    @JsonProperty("ad_id")
    public String getAdId() {
        return this.adId;
    }

    @Override // com.spotify.music.features.ads.model.State
    @JsonProperty("slot_id")
    public String getAdSlotId() {
        return this.adSlotId;
    }

    @Override // com.spotify.music.features.ads.model.State
    @JsonProperty("app_startup_id")
    public String getAppStartupId() {
        return this.appStartupId;
    }

    @Override // com.spotify.music.features.ads.model.State
    @JsonProperty("pending_ads")
    public i getPendingAds() {
        return this.pendingAds;
    }

    @Override // com.spotify.music.features.ads.model.State
    @JsonProperty("stream_time_in_ms")
    public String getStreamTimeInMs() {
        return this.streamTimeInMs;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = ((this.adsEnabled ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.appStartupId;
        int i2 = 0;
        int hashCode = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.adBreakState.hashCode()) * 1000003;
        String str2 = this.adSlotId;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.adId;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        i iVar = this.pendingAds;
        int hashCode4 = (hashCode3 ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        String str4 = this.streamTimeInMs;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 ^ i2;
    }

    @Override // com.spotify.music.features.ads.model.State
    @JsonProperty("ad_enabled")
    public boolean isAdsEnabled() {
        return this.adsEnabled;
    }
}
