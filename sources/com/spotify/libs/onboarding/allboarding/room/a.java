package com.spotify.libs.onboarding.allboarding.room;

import com.spotify.libs.onboarding.allboarding.room.PickerStepData;

public final class a {
    public final String a(PickerStepData.AllboardingScreenType allboardingScreenType) {
        if (allboardingScreenType != null) {
            return allboardingScreenType.toString();
        }
        return null;
    }

    public final String b(PickerStepData.NextAction.AllboardingType allboardingType) {
        if (allboardingType != null) {
            return allboardingType.toString();
        }
        return null;
    }

    public final PickerStepData.AllboardingScreenType c(String str) {
        if (str != null) {
            return PickerStepData.AllboardingScreenType.valueOf(str);
        }
        return null;
    }

    public final PickerStepData.NextAction.AllboardingType d(String str) {
        if (str != null) {
            return PickerStepData.NextAction.AllboardingType.valueOf(str);
        }
        return null;
    }
}
