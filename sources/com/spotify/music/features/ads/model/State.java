package com.spotify.music.features.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class State implements JacksonModel, Parcelable {
    @JsonCreator
    public static State create(@JsonProperty("ad_enabled") boolean z, @JsonProperty("app_startup_id") String str, @JsonProperty("ad_break_state") AdBreakState adBreakState, @JsonProperty("slot_id") String str2, @JsonProperty("ad_id") String str3, @JsonProperty("pending_ads") i iVar, @JsonProperty("stream_time_in_ms") String str4) {
        return new AutoValue_State(z, str, adBreakState, str2, str3, iVar, str4);
    }

    @JsonProperty("ad_break_state")
    public abstract AdBreakState getAdBreakState();

    @JsonProperty("ad_id")
    public abstract String getAdId();

    @JsonProperty("slot_id")
    public abstract String getAdSlotId();

    @JsonProperty("app_startup_id")
    public abstract String getAppStartupId();

    @JsonProperty("pending_ads")
    public abstract i getPendingAds();

    @JsonProperty("stream_time_in_ms")
    public abstract String getStreamTimeInMs();

    @JsonProperty("ad_enabled")
    public abstract boolean isAdsEnabled();

    @Override // java.lang.Object
    public String toString() {
        StringBuilder T0 = je.T0(300, "ad_enabled: ");
        T0.append(isAdsEnabled());
        T0.append('\n');
        T0.append("app_startup_id: ");
        T0.append(getAppStartupId());
        T0.append('\n');
        T0.append("ad_break_state: ");
        T0.append(getAdBreakState());
        T0.append('\n');
        T0.append("slot_id: ");
        T0.append(getAdSlotId());
        T0.append('\n');
        T0.append("ad_id: ");
        T0.append(getAdId());
        T0.append('\n');
        T0.append("stream_time_in_ms: ");
        T0.append(getStreamTimeInMs());
        T0.append('\n');
        T0.append("pending_ads: \n");
        T0.append(getPendingAds());
        return T0.toString();
    }
}
