package com.google.android.gms.common.api;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@RecentlyNonNull Status status) {
        super(status);
    }

    public void c(@RecentlyNonNull Activity activity, int i) {
        this.mStatus.s2(activity, i);
    }
}
