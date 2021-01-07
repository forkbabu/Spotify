package com.spotify.mobile.android.storytelling.controls;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.mobile.android.storytelling.controls.stories.StoriesControls;
import kotlin.jvm.internal.h;

public final class a implements fjf<nx1> {
    private final wlf<Optional<nx1>> a;
    private final wlf<Activity> b;

    public a(wlf<Optional<nx1>> wlf, wlf<Activity> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        Optional<nx1> optional = this.a.get();
        Activity activity = this.b.get();
        h.e(optional, "customControls");
        h.e(activity, "activity");
        nx1 or = optional.or((Optional<nx1>) new StoriesControls(activity));
        h.d(or, "customControls.or(StoriesControls(activity))");
        return or;
    }
}
