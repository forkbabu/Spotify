package com.spotify.effortlesslogin.prerequisites;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class EffortlessLoginPrerequisitesResult implements JacksonModel {
    public static EffortlessLoginPrerequisitesResult createFailure() {
        return new AutoValue_EffortlessLoginPrerequisitesResult(false, Optional.absent());
    }

    public static EffortlessLoginPrerequisitesResult createSuccess(String str) {
        return new AutoValue_EffortlessLoginPrerequisitesResult(true, Optional.of(str));
    }

    public abstract boolean enabled();

    public abstract Optional<String> fullName();
}
