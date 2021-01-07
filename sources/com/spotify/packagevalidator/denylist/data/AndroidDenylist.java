package com.spotify.packagevalidator.denylist.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.Set;

public abstract class AndroidDenylist implements JacksonModel {
    @JsonCreator
    public static AndroidDenylist create(@JsonProperty("package_names") Set<String> set, @JsonProperty("app_signatures") Set<String> set2) {
        return new AutoValue_AndroidDenylist(set, set2);
    }

    public static AndroidDenylist createEmpty() {
        return new AutoValue_AndroidDenylist(Collections.emptySet(), Collections.emptySet());
    }

    @JsonProperty("app_signatures")
    public abstract Set<String> appSignatures();

    @JsonProperty("package_names")
    public abstract Set<String> packageNames();
}
