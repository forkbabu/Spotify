package com.spotify.libs.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = GaiaState_Deserializer.class)
public class GaiaState implements JacksonModel {
    private final List<GaiaDevice> mDevices;
    private final boolean mIsActive;
    private final boolean mIsActiveOnSameDevice;
    private final String mOnboardingDevice;
    private final boolean mShouldUseLocalPlayback;
    private final GaiaTransferError mTransferError;

    @JsonCreator
    public GaiaState(@JsonProperty("is_active") boolean z, @JsonProperty("onboarding_device") String str, @JsonProperty("should_use_local_playback") boolean z2, @JsonProperty("transfer_error") GaiaTransferError gaiaTransferError, @JsonProperty("devices") List<GaiaDevice> list, @JsonProperty("is_active_on_same_device") boolean z3) {
        this.mIsActive = z;
        this.mOnboardingDevice = str;
        this.mShouldUseLocalPlayback = z2;
        this.mTransferError = gaiaTransferError;
        this.mDevices = gf0.a(list);
        this.mIsActiveOnSameDevice = z3;
    }

    @JsonGetter("devices")
    public List<GaiaDevice> getDevices() {
        return this.mDevices;
    }

    @JsonGetter("onboarding_device")
    public String getOnboardingDevice() {
        return this.mOnboardingDevice;
    }

    @JsonGetter("transfer_error")
    public GaiaTransferError getTransferError() {
        return this.mTransferError;
    }

    @JsonGetter("is_active")
    public Boolean isActive() {
        return Boolean.valueOf(this.mIsActive);
    }

    @JsonGetter("is_active_on_same_device")
    public boolean isActiveOnSameDevice() {
        return this.mIsActiveOnSameDevice;
    }

    @JsonGetter("should_use_local_playback")
    public boolean shouldUseLocalPlayback() {
        return this.mShouldUseLocalPlayback;
    }

    public String toString() {
        StringBuilder V0 = je.V0("GaiaState{, mOnboardingDevice='");
        je.A(V0, this.mOnboardingDevice, '\'', ", mIsActive=");
        V0.append(this.mIsActive);
        V0.append(", mShouldUseLocalPlayback=");
        V0.append(this.mShouldUseLocalPlayback);
        V0.append(", mTransferError=");
        V0.append(this.mTransferError);
        V0.append(", mDevices=");
        V0.append(this.mDevices);
        V0.append(", mIsActiveOnSameDevice=");
        return je.O0(V0, this.mIsActiveOnSameDevice, '}');
    }
}
