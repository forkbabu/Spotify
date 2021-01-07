package com.spotify.mobile.android.storytelling.container;

import android.app.Activity;
import android.media.AudioManager;
import kotlin.jvm.internal.h;

public final class c implements fjf<AudioManager> {
    private final wlf<Activity> a;

    public c(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        h.e(activity, "activity");
        Object systemService = activity.getSystemService("audio");
        if (systemService != null) {
            return (AudioManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }
}
