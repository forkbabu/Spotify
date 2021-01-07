package com.spotify.music.libs.yourepisodes.views.tooltip;

import android.app.Activity;
import kotlin.jvm.internal.h;

public final class i implements fjf<d> {
    private final wlf<Activity> a;

    public i(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        h.e(activity, "activity");
        return new d(activity);
    }
}
