package com.spotify.music.libs.branchintegration.network;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class BranchFlag implements JacksonModel {
    @JsonCreator
    public static BranchFlag create(@JsonProperty("branch_enabled") Boolean bool, @JsonProperty("branch_enabled_ios") Boolean bool2, @JsonProperty("branch_enabled_android") Boolean bool3) {
        return new AutoValue_BranchFlag(bool, bool2, bool3);
    }

    @JsonGetter("branch_enabled")
    public abstract Boolean branchEnabled();

    @JsonGetter("branch_enabled_android")
    public abstract Boolean branchEnabledAndroid();

    @JsonGetter("branch_enabled_ios")
    public abstract Boolean branchEnabledIos();
}
