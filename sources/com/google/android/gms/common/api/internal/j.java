package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public interface j {
    void F(@RecentlyNonNull String str, @RecentlyNonNull LifecycleCallback lifecycleCallback);

    @RecentlyNonNull
    Activity H1();

    @RecentlyNullable
    <T extends LifecycleCallback> T a0(@RecentlyNonNull String str, @RecentlyNonNull Class<T> cls);

    void startActivityForResult(@RecentlyNonNull Intent intent, int i);
}
