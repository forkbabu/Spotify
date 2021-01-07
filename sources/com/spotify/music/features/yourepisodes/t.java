package com.spotify.music.features.yourepisodes;

import android.app.Activity;
import com.spotify.mobile.android.ui.view.y;
import kotlin.jvm.internal.h;

public final class t implements fjf<y> {
    private final wlf<Activity> a;

    public t(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        h.e(activity, "activity");
        return new y(activity);
    }
}
